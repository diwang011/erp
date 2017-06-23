package com.erp.controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.biz.IOrderBizService;
import com.erp.biz.api.model.order.ChargeType;
import com.erp.biz.api.model.order.Order;
import com.erp.biz.api.model.order.OrderLineType;
import com.erp.biz.api.model.order.RefundChargeType;
import com.erp.db.model.Orders;
import com.erp.model.OrderCondition;
import com.erp.model.TrackingInfo;
import com.erp.view.model.ViewCharge;
import com.erp.view.model.ViewOrderItem;
import com.erp.view.model.ViewOrders;
import com.erp.view.model.ViewRefund;
import com.erp.view.model.ViewShippingInfo;

/**
 * 
 * @author dev003
 *
 */
@Controller
@RequestMapping("/walmartapp/order")
public class OrderController extends BaseController
{
    private static final Logger LOGGER = LogManager.getLogger(OrderController.class);

    @Resource
    private IOrderBizService orderBizService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<List<Orders>> search(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("order search start");
        BaseResponse<List<Orders>> response = new BaseResponse<List<Orders>>();
        Integer userId = getUserByToken(request.getToken());
        if (userId != null)
        {
            List<Orders> order = null;
            Integer total = null;
            try
            {
                String purchaseOrderId = request.getData();
                Integer offset = request.getOffset();
                total = orderBizService.count(purchaseOrderId, userId);
                order = orderBizService.listByPoId(purchaseOrderId, offset, userId);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Get Order info error," + e.getMessage());
            }
            response.setTotal(total);
            response.setData(order);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("order search end");
        return response;
    }

    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> updateOrder(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("order updateorder start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        Integer userId = getUserByToken(request.getToken());
        if (userId != null)
        {
            Boolean order = Boolean.FALSE;
            String purchaseOrderId = null;
            try
            {
                String data = request.getData();
                if (!StringUtils.isEmpty(data))
                {
                    purchaseOrderId = data;
                }
                order = orderBizService.saveOrder(purchaseOrderId, userId);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("No order info," + e.getMessage());
            }
            response.setData(order);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("order updateorder end");
        return response;
    }

    @RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> cancelOrder(@RequestBody BaseRequest<OrderCondition> request)
    {
        LOGGER.info("order cancelOrder start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        Integer userId = getUserByToken(request.getToken());
        if (userId != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                OrderCondition condition = request.getData();
                it = orderBizService.cancelOrder(condition, userId);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("cancel Order error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("order cancelOrder end");
        return response;
    }

    @RequestMapping(value = "/refundOrder", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> refundOrder(@RequestBody BaseRequest<OrderCondition> request)
    {
        LOGGER.info("order refundOrder start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        Integer userId = getUserByToken(request.getToken());
        if (userId != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                OrderCondition condition = request.getData();
                it = orderBizService.refundOrder(condition, userId);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("refund Order error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("order refundOrder end");
        return response;
    }

    @RequestMapping(value = "/uplodTracking", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<Boolean> uplodTracking(@RequestBody BaseRequest<TrackingInfo> request)
    {
        LOGGER.info("order uplodTracking start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        Integer userId = getUserByToken(request.getToken());
        if (userId != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                TrackingInfo trackingInfo = request.getData();
                it = orderBizService.uplodTracking(trackingInfo, userId);
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("uplod Tracking error," + e.getMessage());
            }
            response.setData(it);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("order uplodTracking end");
        return response;
    }

    @RequestMapping(value = "/getItemDetail", method = RequestMethod.POST)
    public @ResponseBody BaseResponse<ViewOrders> getItemDetail(@RequestBody BaseRequest<String> request)
    {
        LOGGER.info("order getItemDetail start");
        BaseResponse<ViewOrders> response = new BaseResponse<ViewOrders>();
        Integer userId = getUserByToken(request.getToken());
        if (userId != null)
        {
            Order order = null;
            ViewOrders viewOrders = null;
            try
            {
                String purchaseOrderId = request.getData();
                order = orderBizService.getItemDetail(purchaseOrderId, userId);
                if(order != null){
                    viewOrders = convertOrder(order);
                }
            }
            catch (Exception e)
            {
                LOGGER.error(e);
                response.setError("Get Item Detail error," + e.getMessage());
            }
            response.setData(viewOrders);
        }
        else
        {
            response.setError("Token Failure");
        }
        LOGGER.info("order getItemDetail end");
        return response;
    }

    private ViewOrders convertOrder(Order order)
    {
        ViewOrders viewOrders = new ViewOrders();
        try
        {
            GregorianCalendar ca = order.getOrderDate().toGregorianCalendar();
            viewOrders.setOrderDate(ca.getTime().getTime());
            ViewShippingInfo shippingInfo = new ViewShippingInfo();
            shippingInfo.setAddress1(order.getShippingInfo().getPostalAddress().getAddress1());
            shippingInfo.setAddress2(order.getShippingInfo().getPostalAddress().getAddress2());
            shippingInfo.setCity(order.getShippingInfo().getPostalAddress().getCity());
            shippingInfo.setCountry(order.getShippingInfo().getPostalAddress().getCountry());
            shippingInfo.setName(order.getShippingInfo().getPostalAddress().getName());
            shippingInfo.setPostalCode(order.getShippingInfo().getPostalAddress().getPostalCode());
            shippingInfo.setState(order.getShippingInfo().getPostalAddress().getState());
            shippingInfo.setAddressType(order.getShippingInfo().getPostalAddress().getAddressType());
            
            shippingInfo.setPhone(order.getShippingInfo().getPhone());
            ca = order.getShippingInfo().getEstimatedDeliveryDate().toGregorianCalendar();
            shippingInfo.setEstimatedDeliveryDate(ca.getTime().getTime());
            ca = order.getShippingInfo().getEstimatedShipDate().toGregorianCalendar();
            shippingInfo.setEstimatedShipDate(ca.getTime().getTime());
            
            viewOrders.setShippingInfo(shippingInfo);
            
            List<ViewOrderItem> items = new ArrayList<>();
            for(OrderLineType orderLineType : order.getOrderLines().getOrderLine()){
                ViewOrderItem item = new ViewOrderItem();
                item.setLineNumber(orderLineType.getLineNumber());
                item.setPurchaseOrderId(order.getPurchaseOrderId());
                item.setSku(orderLineType.getItem().getSku());
                item.setProductName(orderLineType.getItem().getProductName());
                
                List<ViewCharge> charges = new ArrayList<>();
                if(orderLineType.getCharges().getCharge().size()>0){
                    for(ChargeType chargeType :orderLineType.getCharges().getCharge()){
                        ViewCharge viewCharge = new ViewCharge();
                        viewCharge.setChargeName(chargeType.getChargeName());
                        viewCharge.setChargeAmount(chargeType.getChargeAmount().getAmount() + 
                                " (" +chargeType.getChargeAmount().getCurrency() +")");
                        if(chargeType.getTax()!=null){
                            viewCharge.setTaxName(chargeType.getTax().getTaxName());
                            viewCharge.setTaxAmount(chargeType.getTax().getTaxAmount().getAmount() +
                                    " ("+chargeType.getTax().getTaxAmount().getCurrency()+")");
                        }
                        
                        charges.add(viewCharge);
                    }
//                    item.setPrice_currency(orderLineType.getCharges().getCharge().get(0).getChargeAmount().getAmount()+" ("+
//                            orderLineType.getCharges().getCharge().get(0).getChargeAmount().getCurrency()+")");
                }
                item.setCharges(charges);
                
                
                List<ViewRefund> viewRefunds = new ArrayList<>();
                if(orderLineType.getRefund()!=null&&orderLineType.getRefund().getRefundCharges()!=null&&
                        orderLineType.getRefund().getRefundCharges().getRefundCharge().size()>0){
//                    viewRefund.setRefundId(orderLineType.getRefund().getRefundId());
//                    viewRefund.setRefundComments(orderLineType.getRefund().getRefundComments());
                    for(RefundChargeType refundChargeType : orderLineType.getRefund().getRefundCharges().getRefundCharge()){
                        ViewRefund viewRefund = new ViewRefund();
                        viewRefund.setRefundName(refundChargeType.getCharge().getChargeName());
                        viewRefund.setRefundAmount(refundChargeType.getCharge().getChargeAmount().getAmount()+
                                " ("+refundChargeType.getCharge().getChargeAmount().getCurrency()+")");
                        if(refundChargeType.getCharge().getTax()!=null){
                            viewRefund.setTaxName(refundChargeType.getCharge().getTax().getTaxName());
                            viewRefund.setTaxAmount(refundChargeType.getCharge().getTax().getTaxAmount().getAmount()+
                                    " ("+refundChargeType.getCharge().getTax().getTaxAmount().getCurrency()+")");
                        }
                        if(refundChargeType.getRefundReason()!=null){
                            viewRefund.setRefundReason(refundChargeType.getRefundReason().value());
                        }
                        viewRefunds.add(viewRefund);
                    }
                    
                    //viewRefund.setRefundName(orderLineType.getRefund().getRefundCharges().getRefundCharge());
                }
                item.setRefunds(viewRefunds);
                
                item.setInv_amount_unit(orderLineType.getOrderLineQuantity().getAmount()+" (" +
                        orderLineType.getOrderLineQuantity().getUnitOfMeasurement() + ")");
                
                ca = orderLineType.getStatusDate().toGregorianCalendar();
                item.setStatusDate(ca.getTime().getTime());
                
                int size = orderLineType.getOrderLineStatuses().getOrderLineStatus().size();
                if(size > 0){
                    item.setStatus(orderLineType.getOrderLineStatuses().getOrderLineStatus().get(size-1).getStatus()+"");
                    if(orderLineType.getOrderLineStatuses().getOrderLineStatus().get(size-1).getTrackingInfo()!=null){
                        item.setTrackingInfo(orderLineType.getOrderLineStatuses().getOrderLineStatus().get(size-1).getTrackingInfo().getCarrierName().getCarrier() +" : "+
                                orderLineType.getOrderLineStatuses().getOrderLineStatus().get(size-1).getTrackingInfo().getTrackingNumber());
                    }
                }
                
                items.add(item);
            }
            viewOrders.setItems(items);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return viewOrders;
    }

}