package com.erp.controller;

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
import com.erp.db.model.Orders;
import com.erp.db.model.UserInfo;
import com.erp.model.OrderCondition;
import com.erp.model.TrackingInfo;
import com.erp.view.model.ViewCharge;
import com.erp.view.model.ViewOrders;

/**
 * 
 * @author dev003
 *
 */
@Controller
@RequestMapping("/order")
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
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            List<Orders> order = null;
            Integer total = null;
            try
            {
                String purchaseOrderId = request.getData();
                Integer offset = request.getOffset();
                total = orderBizService.count(purchaseOrderId, user);
                order = orderBizService.listByPoId(purchaseOrderId, offset, user);
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
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
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
                order = orderBizService.saveOrder(purchaseOrderId, user);
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
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                OrderCondition condition = request.getData();
                it = orderBizService.cancelOrder(condition, user);
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
    public @ResponseBody BaseResponse<Boolean> refundOrder(@RequestBody BaseRequest<ViewCharge> request)
    {
        LOGGER.info("order refundOrder start");
        BaseResponse<Boolean> response = new BaseResponse<Boolean>();
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                ViewCharge condition = request.getData();
                it = orderBizService.refundOrder(condition, user);
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
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            Boolean it = Boolean.FALSE;
            try
            {
                TrackingInfo trackingInfo = request.getData();
                it = orderBizService.uplodTracking(trackingInfo, user);
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
        UserInfo user = getUserByToken(request.getToken());
        if (user != null)
        {
            ViewOrders viewOrders = null;
            try
            {
                String purchaseOrderId = request.getData();
                viewOrders = orderBizService.getItemDetail(purchaseOrderId, user);
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

}