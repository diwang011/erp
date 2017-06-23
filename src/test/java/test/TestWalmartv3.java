package test;
//package com.erp.biz.api.handle;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.math.BigDecimal;
//import java.security.KeyFactory;
//import java.security.PrivateKey;
//import java.security.Signature;
//import java.security.spec.PKCS8EncodedKeySpec;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//import javax.xml.bind.JAXBException;
//import javax.xml.datatype.DatatypeFactory;
//import javax.xml.datatype.XMLGregorianCalendar;
//
//import org.apache.commons.codec.binary.Base64;
//import org.apache.commons.httpclient.NameValuePair;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//import com.erp.biz.api.model.Data;
//import com.erp.biz.api.model.inventory.Inventory;
//import com.erp.biz.api.model.inventory.InventoryFeed;
//import com.erp.biz.api.model.inventory.InventoryHeader;
//import com.erp.biz.api.model.inventory.Quantity;
//import com.erp.biz.api.model.inventory.UnitOfMeasurement;
//import com.erp.biz.api.model.mp.AdditionalProductAttribute;
//import com.erp.biz.api.model.mp.AdditionalProductAttributes;
//import com.erp.biz.api.model.mp.Electronics;
//import com.erp.biz.api.model.mp.LengthUnit;
//import com.erp.biz.api.model.mp.MPItem;
//import com.erp.biz.api.model.mp.MPItemFeed;
//import com.erp.biz.api.model.mp.MPItemFeedHeader;
//import com.erp.biz.api.model.mp.MPProduct;
//import com.erp.biz.api.model.mp.ProductIdentifier;
//import com.erp.biz.api.model.mp.ProductIdentifiers;
//import com.erp.biz.api.model.mp.WeightUnit;
//import com.erp.biz.api.model.order.CarrierNameType;
//import com.erp.biz.api.model.order.CarrierType;
//import com.erp.biz.api.model.order.ChargeType;
//import com.erp.biz.api.model.order.MetaType;
//import com.erp.biz.api.model.order.Order;
//import com.erp.biz.api.model.order.OrderLineStatusType;
//import com.erp.biz.api.model.order.OrderLineStatusValueType;
//import com.erp.biz.api.model.order.OrderLineType;
//import com.erp.biz.api.model.order.OrderLinesType;
//import com.erp.biz.api.model.order.OrderShipment;
//import com.erp.biz.api.model.order.OrdersListType;
//import com.erp.biz.api.model.order.ShipLineStatusType;
//import com.erp.biz.api.model.order.ShipLineStatusesType;
//import com.erp.biz.api.model.order.ShippingLineType;
//import com.erp.biz.api.model.order.ShippingLinesType;
//import com.erp.biz.api.model.order.ShippingMethodCodeType;
//import com.erp.biz.api.model.order.TrackingInfoType;
//import com.erp.biz.api.model.price.FeedHeaderType;
//import com.erp.biz.api.model.price.ItemIdentifierType;
//import com.erp.biz.api.model.price.ItemPriceType;
//import com.erp.biz.api.model.price.MoneyType;
//import com.erp.biz.api.model.price.Price;
//import com.erp.biz.api.model.price.PriceFeed;
//import com.erp.biz.api.model.price.PricingListType;
//import com.erp.biz.api.model.price.PricingType;
//import com.erp.biz.api.model.response.CurrencyCode;
//import com.erp.biz.api.model.response.FeedAcknowledgement;
//import com.erp.biz.api.model.response.FeedRecord;
//import com.erp.biz.api.model.response.FeedRecordResponse;
//import com.erp.biz.api.model.response.FeedStatus;
//import com.erp.biz.api.model.response.IngestionError;
//import com.erp.biz.api.model.response.ItemResponse;
//import com.erp.biz.api.model.response.ItemResponses;
//import com.erp.biz.api.model.response.ItemRetireResponse;
//import com.erp.biz.api.model.response.ItemStatus;
//import com.erp.biz.api.model.response.ItemStatusDetail;
//import com.erp.biz.api.model.response.Money;
//import com.erp.biz.api.model.response.PartnerFeedResponse;
//import com.erp.biz.api.model.response.PartnerItemIngestionStatus;
//import com.erp.biz.api.model.response.ServiceResponse;
//import com.erp.biz.api.model.response.UnitOfWeight;
//import com.erp.biz.api.model.response.WeightMeasure;
//import com.erp.biz.api.util.ExcelReportFileReaderWriterUtil;
//import com.erp.biz.api.util.HttpClientHelper;
//import com.erp.biz.api.util.JAXBUtil;
//import com.erp.biz.api.util.Reportable;
//
//public class TestWalmartv3
//{
//    private static String baseUrl;
//    private static String consumerId;
//    private static String privateEncodedStr;
//    private static String consumerChannelType;
//
//    static
//    {
//        baseUrl = "https://marketplace.walmartapis.com/v2/orders/";
//        consumerChannelType = "bddef1e9-a87d-465b-87bf-a08b756c325d";
//        // 爱芬照明
////         consumerId = "6e88c7a7-cc47-42c0-8f23-c34bbdc14bbc";
////         privateEncodedStr =s
////         "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIzeI3Rsh6VqzlyU7m+M3Nqs/SEsLiFTLgUBzgeK9VACGMbpt014HAauV7kG2bkcL1TW2DFOryGeEtWtVkEsV09dNSNsWTK1JtX3x0Mpqbbkax/nq9ytwM36XAf6kecX8jie5a/QP67u0hzA1okwAGt7LMC6RiBkzGo0KedVSLfLAgMBAAECgYAtTTLxugVVeSesNmkHjrFn0cIF7QNYzDs8ePwdCN8jP8lgDsFYNIwuydqEMmPKV/oQupcEJF3F3eQIu5nFk9DvxbhG3k/ou7g9oxx5rTcKr+bLJjpaXP3Hs3qa8OooY6wdV2/1/JT5slydXOZBGahGRq7Dw5ex3/ClMhjDq60xAQJBANkjL9blmRM0tGaZcqcvCaq7+QnfTeBcPvcRJ7Nfj7vpzZTTUI5UPcpVKpZ/4aWyQyCLxPUKXELzm2fosCfzEyECQQCmFGwYKbZZ+l/QULCRb1t3wlrXUaC9EO8A7q3NkoacjI9WrRn3mHpVVmupJxzs3qdGBAVQMjm3Bixj0clFIZlrAkEAym1ERxoKx93lpJS/T17Jq1LMS8jTCCvXQ2vJ0C5xiCTiVDFgMyAT7tHQ/zc+/MMgU3IZ7rt24a/LnGZP+x5gIQJALtfxyTrysRxarBImS08ieHv8TWE7ujgtgZDQuvwKNdu7jlIS0fBTCQDwKuzaTsFaYvg9W2pfNw1ptdn1MCeS8wJBAM0ULPfqGYHLYGksItL7mwvx/NPeFrev8tnfkOjeJoAiLrnh8RmCOo7iheWW9GC4NCSGXEwtRcxe2ZEj3FxI1Jk=";
//        // 麦风
//        // consumerId = "6f73e16c-49af-463f-a494-e864476e0964";
//        // privateEncodedStr =
//        // "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAJuel89ZZwz4vjF5OkhIyAYdYyhsd8D1ydqyNKknuH2nY3mePXosSvHDjDZen8uhdTkTgk3Sg2tzA/IpXzw3Go5g5l5a//lfFCX6Uj78JpsqRXPswTnqjIZqJnkKwYQjmekZhw7EwPNCO3ONLu1IIX72wG7Qm8v4RPiaiFNdf6fHAgMBAAECgYEAiMXap2LsL3pvrwvdLarKIpWxkNXEatOblZsKraE7hTSZOUravYYwWEyF70M7Lr25SXDcFYnv94Ae97dk/IdxzlAl5u1eJ7qWlVNEwKVH5Sl8FmUAqX9gJUwOR/pcyS3uVvW9rTzIA3o5YzV4Qw0hvNIHoVNWWm65QiXfQytxCAECQQDgIAkvXrfC19vl5JvQyJR0bRRvzkwrYbY8+uDZFWjdjdIxyME2OdYogHMACz8pTcaPYHia0ZssRNhKhMoWLJ61AkEAscBmJsWSSFT3HtY5dCWo6JzstbxAPEep3UvuoHE19rmUL1TnLm7vS4WuI30HaXjwNZPJbrc2v2W9eNNIYLE+CwJBANut6vLYZ0v+4pYyfpuljwWTSV3Rmo1HCCY7TZraRmArO2T6vo8VH5mxVYcsfutQRZiRWYV+gBdjH5HjGGWltKUCQQCkMtMqZcAnyTUu6z3PqSpLFwsjJm9AQAMORiJ9W5c5/1yADLIyFpA+95JRfiHmsK1VENw2xlBwpg9NGf/2MkTZAkAwA67vGsNiQ61zdfLN0kDbvCnQUIocoxgZzmOedTiYoKT92u53ccdLfIM8OudPcU0XeycjgZYTKq54KAYNR3HL";
//        // 星阡陌
////         consumerId = "8e63d238-a35f-49ca-bee9-439b857f7cb5";
////         privateEncodedStr =
////         "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAK2ndOGlBI8PwRxFcg84plRAP2OlGmG+Kq6397xYDXKOirrVJiakAN0vZFha9wTlNi7ptZnpI8ODORqARQd69JcrNwSayxnVjexCjsuwmrG7VAdH5NPYvCDmjpW8R0BvZCPFl5XN9RlzswbF1Mdv8Ok0Zfc6xmxAzKtyuvQDeyLpAgMBAAECgYAv+cWm2WpLA/U8FEuQvPvm5uEcbG6/dkRghN7ioAkHDy5ws5aYslKyyPcWGfuI1LKFf3f2j5yb1VMfaTSo/mU4MOJtClVtENvEANQcJ7c+NZS7kuDxBqk1vWcX7be6079jFmrjcM0byOLgwP0rwyKn3kz8ZdGvecccClHlK0WtaQJBAPEFC4IrVIJyW2Ar1LD11LT/OjQgumxa7D2YZ3x1ofvc7o49sd2oCCIgx/GT2zYsfBtJMBY7wJtb1hcOENCU3hMCQQC4cohXZP1Plubs9f8A9ArofBdP7yPAG3d42V/6ivHZqjt/JiwNP/d5AnURa3hsWb9mztzDk1VgvtOVrJyoPaqTAkAna5rRRIMC/u9BEIouE1ch72i2o++5zzk6bdXnPlorFpyR+TdBOL1zz4bEVVmSR75YvCS4TjeXcXLXvH41j1OvAkBNnk0H0gTTSGJ3V3HvOcOZYBcDWVRHFIfrQDamnW/3NC8Da9Hf5YpDzyfqo7oyhnYIUocOemLUaplphBEMr56nAkEAtez/CEr4NfVE1VzUyyviYnfLKl8WGPI7fJAmSFxzSsz2QzD9NT/mk/EqgWos2GkL6HC9033YxFe113CkJGbOuA==";
//        // 万兆通
////        consumerId = "d7ee7952-e040-4fa2-b18f-d3c7a79a2b7c";
////        privateEncodedStr = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIWmyRlVTMTFAFLBJI2dPk8bXGI1kAkxGL7hNUteaXn6pPuRd5beDUW4XMpBm7DyFQDg/9Y1RusKmKkS1nmujKtKj+DUaNbeutyhg1HascB/jBL1pB2CvSR5zrgTKk3DK2vmsRJCzuJoNRcvQlwggDKzdwUbSweJdWYvrngnkh+RAgMBAAECgYBU8Knv+sE+cQGClpOXmO7Hsdjl5aqz3MsgTNrlGoyoZD5ET7AUZu1CeSgntsivDTuCAn0180guCt743SsHzIJDTEVv484E/92DsUT9RlNNStuX4fx+thBt3QV3i4L4ScB5UoHp6mTPtTmNQQ/gY/N1S2Lt8eufDxA0XBNVLSf4AQJBAO0uHHMxFupPB49VGnaTIY+EzztHRV7F90oGMRZlW9wl6sWVClkfEv+9Jjuhf5oHJhVyeutJfnfkBpDfqu4yaoECQQCQQa0dTsgAQX/N+IGt+4DQRWYy9pib2TUhjXUwE1ek3sarNzURYZ2+4+RfX1Uz+MruvfQaB4peEDAQioIpkI0RAkEAp2fBeuiuJOltC5Tk3caRjIwP/OYcJ32RQnVGVmlqQeOdZqIAsNDHByzJfJNLzjq3fbHU4pd4JUUUAVNtgTyigQJAVi1V7K82naiDYBl35ubbYhBDaGiWbGwK6HtoKYs0jYKkbn4xjquhH/tmX29FKCIVoSALJk2g5GaJQChub8Qx8QJBAJxrbXEXhZm4kWAbQ+rr7I3KalFdS0ubUWTGBsQwZM9CN7jkNheJ24tfVCsU8D6asP2rzbg/n0HgCG9e43GTOXY=";
//        // 邦德贸易BANGDETRADING
//        // consumerId = "9d6f5383-8929-4341-a5c4-98a767996365";
//        // privateEncodedStr =
//        // "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAN1GaR6IK0ops+C7qm4xF8dXASfqRbz72pi2H1xtNTmyOE3eAyDtExobwscuD7PkoRQUDlAgzsFCQqCdTJYPhV8Ik07VIMSjKqm4R79qSqASLaj20hXktslY8yv2WJV4Gt+DKX2Xhz5YcObsoSC0ApJWa10Ni5JY061BfuOlT65nAgMBAAECgYEAmHViCkJiKVgwcuB63i9/Jb7BsiHNaRfSlrOtSf6I1LcB6kzUtQQDzFJiUuBeu2EExxPGhNkF+8xOoeGfmikZh4gT5mw+YxPnAejiu3vXxqw/lugb/X5cDOb25sEv9BmK0z1+X4gkTdxOb03fvjZZ0dcCGUahyoarF02txueIZLECQQDyvY1f6W3UqbLmgV5WqUXHJ6ETqLEOSkQxQtA4ohw8AWIo0K1e22MmgE4880QabGZp9Z317wSfPcfz/5YR+Ce5AkEA6Vywd0rPv97jttvbuuRYOT4yQCJWeaFhOPhguscYMfaSw6hSAdOsEWEHGdlYYOpdvcdd28m+QfsvRyFQJFtXHwJBAKY6yKX15RDNZYYU8dXG9dH8gYJE83slwK07Y/xkh5FQIThyL0fWVX/4PZvfu7OcqEXHvfS9Sh0C4ftl/A8yMYECQDPCY0GSTlH4VfmQ+kORsh/AM9UVyKhhqva/4HSNBEjQr+zFwKq3EEsqgjCxjHCyiug0+BRvwstPs0TLlsL5n3ECQAN8jjOkBpI6OcPFeIQ5zmdq1R3/pOpuiiejH0odM3SLO76EHZi6J8aAvReSaRhn8BJsBBoKTCLsWz/RIMFSg54=";
//        // 海神
//        // consumerId = "a43fdc1f-98aa-4cba-a0ed-1adba4a33e66";
//        // privateEncodedStr =
//        // "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIieApGEuDn1DgNqVZzVRqerY/XyocfHCXqhtbMHC0SsfsGAG5ZsgMutlq0BU1XChRpbAi9aPCQFM1XHINso4ljY8UgC6qShNj+NjpvETxv7oSjqDXk7TRx/Gpx+PJmkNUzH7kxmLQX9+2mQEqtPn6DOgm5e3ePnFC4qdFjB9X31AgMBAAECgYA1thnAaHOdpbC6uwWpwVgj94g3XAsq5h/d7NHo7u4JM+Ap51nxS/tfGIJSxmCjKPT3paw4PbvDVaAXK1DJmUtTm9C1CRMQ9XGRT7Y1+otHnImaV7Uy+cymiEpJyNm/Ye17lMSPb9Vg/HLOjyskCQvkmzsoWRyB1X+ErUeQKAZVgQJBAMP94kpYcWze8mG0QtInjIaLM8kfpAj0eEtwELwun5jJHx8++ePgqXkfXNPvvU1HmTv3x3HKzFmhUXkWg2+5XaUCQQCyckQkEq/Acn9fe5/wIpI4pUJvKpJ1nSJLdrOMcmc4TYq7nuMHJg/CKgOdQnkgDUwyOn77fha3x9ln+uFtRk4RAkEAlobBa9QtmS5J/hxSTdGuLg9vgILamz4XveieEcnFLbUaQAdAKXJ89tfNlcDFJTteRx5wgcb918D8MAHIhOBbOQJAPEDrE0cgAxpmOeZzZdE2kFv057Z3R7FsMBD/pW/HvLIqIxoOTI6kiYpIOCSG47S5wsgPsnmr0BhyJ3MGBTDVEQJBALUVHx4tTKZ4ZsaHIMNLWlLgIMVqqV/33oTWAUYSOyQpo1Mx3DpLMkv/eXeVeobfEH7M5j2so7BqgDxLvEhcXB0=";
//        // 天高科技
//        // consumerId = "01231a8f-9562-4844-aa86-25719cb2a99c";
//        // privateEncodedStr =
//        // "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKbcxEyl9Rih7YrQjAuaEtRHOifJghtGC5XW9xgt4LEnYDDmXOKl2Rzt0/bdYeoxfnr5EZ2CTs7VNHL4vpajWPRke7kOtgtWeL7pSGVhwSQETOdGXHdYeDPsbifVTnubPO6ROV3XmZw9n/4hX2zzOPVfOGofljKmkyFknnoTBHHJAgMBAAECgYBcEufSr6S+EeQkvAz6/eqz7hW+DKhZal5MMVEpq28X8fVXJlZMzl0uZGGZD/HOq77yFmvM8TGRWf5WDsIEF2CmmkCAcElt/HXHC+azeYhxrX9d+RQZJVOIfx+rYZMp6j9OjWZjfZVb2sTo+1KNyQ7MOv9SrkCb9/65U3d0leaSgQJBAPrzzo2FVSVq+t1lIoRL7u9bMPWpKVKFaVqUVZpY7KJYnB/0jQ9DyfsuOuwy2/w+Qc8brYlgOGSGHLFjSxXshzkCQQCqN/ejRuGhJv/CtMqllyoCtU2ggIvc5jLq4D0EJGd7eksW4kEtTg9AdsMZkaz6toG98fs/G6nDzErRHQphXC8RAkEA+Gftxdh9eBR1TkGV8S7YzMWPqRxRcwXsS2UZdzcexXTA1kDUgI+xl5kjajrN1topekEDfkBokdjO/igzYvhGwQJAb75EDGUI0/E1L43eBqzgwFxjNH2O05ovTO+ePqzjXjUfPEuVu/clng0Y8R0n8IKFU7uaU4iGfuoLJ5In8VhB8QJBAJBiOZaxjYRxjbfmoJ7anxvUSrDnMAyZGOEju88Thkz9dm/fvG0lNLJcCE+eqWlkqnum6Xru/vHlf08u+/9oB1c=";
//        // （Fremo inc）冲锋兔科技
//         consumerId = "438f955c-849e-4e1c-ac2a-558935e2f68d";
//         privateEncodedStr =
//         "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIYSIRD2EFI3yHucEqUm6Qjg3uJiC3zIzws81t2MlLekP4zTfH9CM4O7QYGdvLbsCpiWaP2yiBFuCaoL6sKBDj371MBBvU9HqSxAcoMEqxOMBKr+UCX6Pqwc4hMB0fQXFme16EdanVAv2ocuGX7VwmZl3WPCVj41AtLN5Xg7OcmbAgMBAAECgYAMxHMzq0sYmUlVRCKeaZsthkSTaGTRqEnXNx77ECUla9XFcmpbsBE5zT5Kupu7C7VinIg5CKRejI0NDX94sFOLvOClyPu1mXnFS9IJCt/6TQ1HVtWraNv8X58OZBRmvQ91bNp9iUcEHnHn8cpAT5DdlqVWnrKrqCjX30VlsOj/eQJBAPT9iOz1VrwGEfydp5pq0bw2upch//JgR2JyoW9MJk/EKqUBVRVif+JVQ/ajesN8WJmDnh1ZL3wkf6zHKob2JwUCQQCMGIhG5XsPf4xlk5nzyX/p0+ls1y2Y+lviXsoV/09MQYYbsZCIEXNArjmB8Y+qsXn8ThIaQAbvfD8wfU4ki9AfAkEAjsbbb82jmLyo6uIudW3fgaMbp0ynT2gQ8i0ALE7i3QXkHHnkTiwzf4JVs32e5CKpt/3evhfl9qGGzvjbrf/yyQJALoc/S3yPwHf2Iw5AhU0Y5Iny7qkQhcwwlCAzMdcXeRYR+kSg4fAZvROgGd4mfuRuxTMQpBM7unIjcnFLcKvWtQJBANp47J8TYDcEkSVhh8b5e8QbMprW3uizjRyHNl8mpxGc+gBs92nEBhzsPK8q/JF+EdzhXRUSezPNJ5qLQnvlCbY=";
//    }
//
//    public static void main(String[] args)
//    {
//         //fetchOrders("?createdStartDate=2017-06-01");
//        // fetchOrders("4578560812607");
//        // cancellingOrder("2578560832984");//2578560832984
//        // refund("4578560812607");
//        // shippingUpdates(s);
//         acknowledgeOrder("");
//        // String []str=new String[]{"1578561281346,1,1Z2EX0530392577961"};
//        // List<Data> list1 = new ArrayList<Data>();
//        // List<Data> list2 = new ArrayList<Data>();
//        // List<Data> list3 = new ArrayList<Data>();
//        // List<ItemResponse> itemViews = getItems("", 0);
//        // for (ItemResponse item : itemViews)
//        // {
//        // if (ItemPublishStatus.UNPUBLISHED.name().equals(item.getPublishedStatus().name()))
//        // {
//        // continue;
//        // }
//        // String sku = item.getSku();
//        // BigDecimal amount = item.getPrice().getAmount();
//        // Inventory i = getInventoryForItem(item.getSku());
//        // double qty = i.getQuantity().getAmount().doubleValue();
//        // if (qty <= 0)
//        // {
//        // list1.add(new Data(sku, (1 + "")));
//        // }
//        // list2.add(new Data(sku, (new BigDecimal(1).add(amount) + ""), "USD"));
//        // list3.add(new Data(sku, amount + "", "USD"));
//        // }
//
//       // getFeedsv3();
//        // retireItem("test001");
//        // getFeedItems();
//        // updateProductIdOrSku();
//
//        // getInventoryForItem("CAB-10GSFP-P3M-30(Open Switch-1pc)");
//        // updateInventoryForItem("A4.280.215.200",1,3);
//        // bulkUpdateInventory(list1);
//
//        // updatePrice("OM3-MPO-8LC-10M(1pc)","USD","77.97");//WEM5307 WEM5323
//        // updateBulkPrices(list2);
////         getPromotionalPrices("ASF-GE-T(Ubiquiti-1pc)");
//        // UpdatePromotionalPrice();
//        // updateBulkPromotionalprices(list3);
//    }
//
//    private static void getFeedsv3()
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v3/feeds";
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpGet(finalUrl);
//            System.out.println(xml);
//            FeedRecordResponse detail = JAXBUtil.converyToJavaBean(xml, FeedRecordResponse.class);
//            if (detail != null)
//            {
//                System.out.println(detail.getTotalResults());
//                if (detail.getResults() != null)
//                {
//                    List<FeedRecord> list = detail.getResults().getFeed();
//                    for (int i = 0; i < list.size(); i++)
//                    {
//                        FeedRecord record = list.get(i);
//                        System.out.println(i + "." + record.getFeedId() + " : " + record.getFeedStatus());
//
//                    }
//                }
//            }
//        }
//        catch (Exception e)
//        {
//        }
//    }
//
//    private static void getFeedsv3(String feedId)
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v3/feeds/" + feedId + "?includeDetails=true";
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpGet(finalUrl);
//            System.out.println(xml);
//            PartnerFeedResponse detail = JAXBUtil.converyToJavaBean(xml, PartnerFeedResponse.class);
//            if (detail != null)
//            {
//                System.out.println(detail.getFeedStatus() + "->>> error qty:" + detail.getItemsFailed());
//                if (detail.getItemDetails() != null)
//                {
//                    List<PartnerItemIngestionStatus> list = detail.getItemDetails().getItemIngestionStatus();
//                    for (int i = 0; i < list.size(); i++)
//                    {
//                        String errors = "";
//                        PartnerItemIngestionStatus status = list.get(i);
//                        for (IngestionError error : status.getIngestionErrors().getIngestionError())
//                        {
//                            errors = errors + error.getDescription();
//                        }
//                        System.out.println(
//                                i + "." + status.getSku() + " : " + status.getIngestionStatus() + "->" + errors);
//
//                    }
//                }
//                if (!FeedStatus.PROCESSED.name().equals(detail.getFeedStatus().name()))
//                {
//                    getFeedsv3(feedId);
//                }
//            }
//        }
//        catch (Exception e)
//        {
//        }
//    }
//
//    private static void refund(String purchaseOrderId)
//    {
//        String requestUrl = "https://marketplace.walmartapis.com/v3/orders/" + purchaseOrderId + "/refund";
//        String requestMethod = "POST";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//            System.out.println(requestUrl);
//            String str = readFileContent("C:\\Users\\dev003\\Desktop\\1.xml");
//            System.out.println(str);
//            String xml = httpClient.doHttpPost(requestUrl, str);
//            System.out.println(xml);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void retireItem(String sku)
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v3/items/" + sku;
//        String requestMethod = "DELETE";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpDelete(finalUrl);
//            System.out.println(xml);
//            ItemRetireResponse detail = JAXBUtil.converyToJavaBean(xml, ItemRetireResponse.class);
//            System.out.println(detail.getMessage());
//        }
//        catch (Exception e)
//        {
//        }
//
//    }
//
//    private static void updateBulkPrices(List<Data> list)
//    {
//
//        String requestUrl = "https://marketplace.walmartapis.com/v3/feeds?feedType=price";
//        String requestMethod = "POST";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//            System.out.println(requestUrl);
//            PriceFeed priceFeed = bildPriceFeed("1.5", list);
//            String requestBoby = JAXBUtil.convertToXml(priceFeed);
//            System.out.println(requestBoby);
//            // String xml = httpClient.doHttpPostMultipart(requestUrl, requestBoby);
//            // System.out.println(xml);
//            // FeedAcknowledgement acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
//            // if (acknowledgement != null)
//            // {
//            // getFeeds(acknowledgement.getFeedId());
//            // }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static PriceFeed bildPriceFeed(String version, List<Data> list)
//    {
//        PriceFeed feed = new PriceFeed();
//        FeedHeaderType feedHeaderType = new FeedHeaderType();
//        feedHeaderType.setVersion(version);
//        feed.setPriceHeader(feedHeaderType);
//        for (Data data : list)
//        {
//            feed.getPrice().add(bildPrice(data.getSku(), data.getCurrency(), data.getAmount()));
//        }
//        return feed;
//    }
//
//    private static ItemPriceType bildPrice(String sku, String currency, String amount)
//    {
//        ItemPriceType price = new ItemPriceType();
//        ItemIdentifierType itemIdentifier = new ItemIdentifierType();
//        itemIdentifier.setSku(sku);
//        price.setItemIdentifier(itemIdentifier);
//        PricingListType pricingList = new PricingListType();
//        PricingType pricing = new PricingType();
//        Price p = new Price();
//        MoneyType moneyType = new MoneyType();
//        moneyType.setAmount(new BigDecimal(amount));
//        moneyType.setCurrency(currency);
//        p.setValue(moneyType);
//        pricing.setCurrentPrice(p);
//        pricingList.getPricing().add(pricing);
//        price.setPricingList(pricingList);
//        return price;
//    }
//
//    private static void bulkUpdateInventory(List<Data> list)
//    {
//
//        String requestUrl = "https://marketplace.walmartapis.com/v2/feeds?feedType=inventory";
//        String requestMethod = "POST";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//            System.out.println(requestUrl);
//            InventoryFeed inventoryFeed = bildInventoryFeed(list, 3);
//            String requestBoby = JAXBUtil.convertToXml(inventoryFeed);
//            System.out.println(requestBoby);
//            // String xml = httpClient.doHttpPostMultipart(requestUrl, requestBoby);
//            // System.out.println(xml);
//            // FeedAcknowledgement acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
//            // if (acknowledgement != null)
//            // {
//            // getFeeds(acknowledgement.getFeedId());
//            // }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static InventoryFeed bildInventoryFeed(List<Data> list, int fulfillmentLagTime)
//    {
//        InventoryFeed inventoryFeed = new InventoryFeed();
//        InventoryHeader inventoryHeader = new InventoryHeader();
//        inventoryHeader.setVersion("1.4");
//        inventoryFeed.setInventoryHeader(inventoryHeader);
//        for (Data data : list)
//        {
//            inventoryFeed.getInventory().add(bildInventory(data.getSku(), data.getAmount(), fulfillmentLagTime));
//        }
//        return inventoryFeed;
//    }
//
//    private static void updateBulkPromotionalprices(List<Data> list)
//    {
//        String requestUrl = "https://marketplace.walmartapis.com/v2/feeds?feedType=promo";
//        String requestMethod = "POST";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//            PriceFeed priceFeed = bildPriceFeed("1.51", list);
//            String requestBoby = JAXBUtil.convertToXml(priceFeed);
//            System.out.println(requestBoby);
//            String xml = httpClient.doHttpPostMultipart(requestUrl, requestBoby);
//            System.out.println(xml);
//            FeedAcknowledgement acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
//            if (acknowledgement != null)
//            {
//                getFeeds(acknowledgement.getFeedId());
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void getFeedItems()
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v2/feeds/feeditems/2007841CC7F64F61A38536DEC04811EB@AQQBAQA";
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpGet(finalUrl);
//            System.out.println(xml);
//        }
//        catch (Exception e)
//        {
//        }
//    }
//
//    private static void UpdatePromotionalPrice()
//    {
//        String requestUrl = "https://marketplace.walmartapis.com/v3/price?promo=true";
//        String requestMethod = "PUT";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//
//            System.out.println(requestUrl);
//            ItemPriceType price = bildPrice("sku", "USD", "10");
//            // String requestBoby = JAXBUtil.convertToXml(price);
//            String requestBoby = readFileContent("C:\\Users\\dev003\\Desktop\\1.xml");
//            System.out.println(requestBoby);
//            String xml = httpClient.doHttpPut(requestUrl, requestBoby);
//            System.out.println(xml);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void getPromotionalPrices(String sku)
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v3/promo/sku/" + sku;
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            //String xml = httpClient.doHttpGet(finalUrl);
//            String xml =  readFileContent("C:\\Users\\dev003\\Desktop\\2.xml");
//            System.out.println(xml);
//            xml=xml.replace("<payload xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ns2:itemPriceType\">", "<payload>");
//            ServiceResponse res = JAXBUtil.converyToJavaBean(xml, ServiceResponse.class);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void updateProductIdOrSku()
//    {
//        try
//        {
//            String fileName = "C:\\Users\\dev003\\Desktop\\walmart.xlsx";
//            ExcelReportFileReaderWriterUtil excelUtil = new ExcelReportFileReaderWriterUtil();
//            List<? extends Reportable> dataList = excelUtil.readReportFile(BaseCsvable.class, fileName, 0);
//            if (dataList.size() <= 0)
//            {
//                return;
//            }
//            MPItemFeed mpItemFeed = ConversionMPItemFeedv3.bildMPItemFeed(dataList, "ElectronicsAccessories");
//
//            // filterSuccess(mpItemFeed, "2B5B93549F3D41C585B6D13DEC957559@AQMBAQA");
//
//            uploadSku(mpItemFeed);
//            System.out.println();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//    // private static void updateProductIdOrSku()
//    // {
//    // String requestUrl = "https://marketplace.walmartapis.com/v2/feeds?feedType=item";
//    // String requestMethod = "POST";
//    // HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//    // try
//    // {
//    // String fileName = "C:\\Users\\dev003\\Desktop\\walmart.xlsx";
//    // InputStream file = new FileInputStream(fileName);
//    // Workbook workbook = WorkbookFactory.create(file);
//    // int NumberOfSheets = workbook.getNumberOfSheets();
//    // ExcelReportFileReaderWriterUtil excelUtil = new ExcelReportFileReaderWriterUtil();
//    // for (int i = 0; i < NumberOfSheets; i++)
//    // {
//    // Sheet st = workbook.getSheetAt(i);
//    // Row row = st.getRow(0);
//    // String key = st.getSheetName();
//    // // 标题总列数
//    // int colNum = row.getPhysicalNumberOfCells();
//    // if (colNum < 50)
//    // {
//    // continue;
//    // }
//    // Class c = Class.forName("com.erp.biz.api.handle.BaseCsvable");
//    // List<? extends Reportable> dataList = excelUtil.readReportFile(c, fileName, i);
//    // if (dataList.size() <= 0)
//    // {
//    // continue;
//    // }
//    // MPItemFeed mpItemFeed = ConversionMPItemFeedv3.bildMPItemFeed(dataList, key);
//    //
//    // // filterSuccess(mpItemFeed, "2B5B93549F3D41C585B6D13DEC957559@AQMBAQA");
//    //
//    // uploadSku(mpItemFeed);
//    // System.out.println();
//    // }
//    // }
//    // catch (Exception e)
//    // {
//    // e.printStackTrace();
//    // }
//    //
//    // }
//
//    private static void filterSuccess(MPItemFeed mpItemFeed, String feedId)
//    {
//        Map<String, String> map = getSkus(feedId);
//        Iterator<MPItem> it = mpItemFeed.getMPItem().iterator();
//        while (it.hasNext())
//        {
//            MPItem mp = it.next();
//            if (map.get(mp.getSku()) == null)
//            {
//                it.remove();
//            }
//        }
//    }
//
//    private static void uploadSku(MPItemFeed mpItemFeed)
//    {
//        String requestUrl = "https://marketplace.walmartapis.com/v3/feeds?feedType=item";
//        String requestMethod = "POST";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//
//            System.out.println(requestUrl);
//            String requestBoby = JAXBUtil.convertToXml(mpItemFeed);
//            // String requestBoby = readFileContent("C:\\Users\\dev003\\Desktop\\1.xml");
//            System.out.println(requestBoby);
//            String xml = httpClient.doHttpPostMultipart(requestUrl, requestBoby);
//            System.out.println(xml);
//            FeedAcknowledgement acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
//            System.out.println();
//            if (acknowledgement != null)
//            {
//                System.out.println(acknowledgement.getFeedId());
//                getFeedsv3(acknowledgement.getFeedId());
//            }
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static MPItemFeedHeader bildMPItemFeedHeader(String requestId, String requestBatchId)
//    {
//        MPItemFeedHeader mpItemFeedHeader = new MPItemFeedHeader();
//        mpItemFeedHeader.setRequestId(requestId);
//        mpItemFeedHeader.setRequestBatchId(requestBatchId);
//        mpItemFeedHeader.setVersion("2.1");
//        return mpItemFeedHeader;
//    }
//
//    private static void updateInventoryForItem(String sku, String amount, int fulfillmentLagTime)
//    {
//        String requestUrl = "https://marketplace.walmartapis.com/v2/inventory?sku=" + sku;
//        String requestMethod = "PUT";
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//            System.out.println(requestUrl);
//            Inventory inventory = bildInventory(sku, amount, fulfillmentLagTime);
//            String requestBoby = JAXBUtil.convertToXml(inventory);
//            requestBoby = requestBoby.replace("<", "<wm:").replace("<wm:/", "</wm:").replace("<wm:?", "<?")
//                    .replace("xmlns", "xmlns:wm");
//            System.out.println(requestBoby);
//            String xml = httpClient.doHttpPut(requestUrl, requestBoby);
//            System.out.println(xml);
//            Inventory i = JAXBUtil.converyToJavaBean(xml, Inventory.class);
//            System.out.println(i);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static Inventory bildInventory(String sku, String amount, int fulfillmentLagTime)
//    {
//        Inventory inventory = new Inventory();
//        inventory.setSku(sku);
//        Quantity quantity = new Quantity();
//        quantity.setAmount(new BigDecimal(amount));
//        quantity.setUnit(UnitOfMeasurement.EACH);
//        inventory.setQuantity(quantity);
//        inventory.setFulfillmentLagTime(fulfillmentLagTime);
//        return inventory;
//    }
//
//    private static Inventory getInventoryForItem(String sku)
//    {
//        sku = sku.replace(" ", "%20");
//        String finalUrl = "https://marketplace.walmartapis.com/v2/inventory?sku=" + sku;
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        Inventory i = null;
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpGet(finalUrl);
//            System.out.println(xml);
//            i = JAXBUtil.converyToJavaBean(xml, Inventory.class);
//        }
//        catch (Exception e)
//        {
//        }
//        return i;
//
//    }
//
//    private static void updatePrice(String sku, String currency, String amount)
//    {
//        // String finalUrl =
//        // "https://marketplace.walmartapis.com/v2/prices?sku="+sku+"&currency="+currency+"&price="+amount;
//        String finalUrl = "https://marketplace.walmartapis.com/v3/price";
//        String requestMethod = "PUT";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//        try
//        {
//            System.out.println(finalUrl);
//            ItemPriceType price = bildPrice(sku, currency, amount);
//            String requestBoby = JAXBUtil.convertToXml(price);
//            // String requestBoby = readFileContent("C:\\Users\\dev003\\Desktop\\1.xml");
//            System.out.println(requestBoby);
//            String xml = httpClient.doHttpPut(finalUrl, requestBoby);
//            System.out.println(xml);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    private static Map<String, Object> getMap(String requestUrl, String requestMethod)
//    {
//        String timestamp = String.valueOf(System.currentTimeMillis());
//        String stringToSign = consumerId + "\n" + requestUrl + "\n" + requestMethod + "\n" + timestamp + "\n";
//        String signedString = signData(stringToSign, privateEncodedStr);
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("WM_SVC.NAME", "Walmart Marketplace");
//        map.put("WM_SEC.AUTH_SIGNATURE", signedString);
//        map.put("WM_CONSUMER.ID", consumerId);
//        map.put("WM_SEC.TIMESTAMP", timestamp);
//        map.put("WM_QOS.CORRELATION_ID", (int) (Math.random() * 9000 + 1000) + "");
//        map.put("Accept", "application/xml");
//        // map.put("Content-Type", "application/xml");
//        if (consumerChannelType != null && consumerChannelType.length() > 0)
//        {
//            map.put("WM_CONSUMER.CHANNEL.TYPE", consumerChannelType);
//        }
//        map.put("Host", "https://marketplace.walmartapis.com");
//        return map;
//    }
//
//    private static List<ItemResponse> getItems(String sku, int offset)
//    {
//
//        List<ItemResponse> list = null;
//
//        try
//        {
//            list = getItem(sku, offset);
//        }
//        catch (Exception e)
//        {
//        }
//        for (int i = 0; i < list.size(); i++)
//        {
//            ItemResponse item = list.get(i);
//            System.out.println(i + 1 + ". sku: " + item.getSku() + ", Status: " + item.getPublishedStatus() + "->"
//                    + item.getProductType() + "->" + item.getPrice().getAmount());
//        }
//        return list;
//
//    }
//
//    private static List<ItemResponse> getItem(String sku, int offset) throws Exception
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v3/items" + sku + "?offset=" + offset;
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        List<ItemResponse> list = new ArrayList<>();
//        System.out.println(finalUrl);
//        String xml = httpClient.doHttpGet(finalUrl);
//        System.out.println(xml);
//        // xml = xml.replace("ns2:", "").replace("ns2", "");
//        try
//        {
//            ItemResponses itemViews = JAXBUtil.converyToJavaBean(xml, ItemResponses.class);
//            list.addAll(itemViews.getItemResponse());
//            if (itemViews != null && itemViews.getItemResponse().size() >= 20)
//            {
//                list.addAll(getItem(sku, offset + 20));
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    private static Map<String, String> getSkus(String feedId)
//    {
//        Map<String, String> skus = new HashMap<>();
//        String finalUrl = "https://marketplace.walmartapis.com/v2/feeds/feeditems/" + feedId
//                + "?includeDetails=true&limit=50";
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpGet(finalUrl);
//            System.out.println(xml);
//            ItemStatusDetail detail = JAXBUtil.converyToJavaBean(xml, ItemStatusDetail.class);
//            if (detail != null)
//            {
//                System.out.println(
//                        detail.getMeta().getFeedStatus() + "->>> error qty:" + detail.getMeta().getItemsFailed());
//                if (detail.getElements() != null)
//                {
//                    List<PartnerItemIngestionStatus> list = detail.getElements().getItemDetails()
//                            .getItemIngestionStatus();
//                    for (int i = 0; i < list.size(); i++)
//                    {
//                        String errors = "";
//                        PartnerItemIngestionStatus status = list.get(i);
//                        for (IngestionError error : status.getIngestionErrors().getIngestionError())
//                        {
//                            errors = errors + error.getDescription();
//                        }
//                        System.out.println(
//                                i + "." + status.getSku() + " : " + status.getIngestionStatus() + "->" + errors);
//                        if (!(status.getIngestionStatus().name().equals(ItemStatus.SUCCESS.name())))
//                        {
//                            skus.putIfAbsent(status.getSku(), status.getSku());
//                        }
//
//                    }
//                }
//            }
//        }
//        catch (Exception e)
//        {
//        }
//        return skus;
//    }
//
//    private static void getFeeds(String feedId)
//    {
//        String finalUrl = "https://marketplace.walmartapis.com/v2/feeds/feeditems/" + feedId
//                + "?includeDetails=true&limit=50";
//        String requestMethod = "GET";
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        System.out.println(finalUrl);
//        try
//        {
//            String xml = httpClient.doHttpGet(finalUrl);
//            System.out.println(xml);
//            ItemStatusDetail detail = JAXBUtil.converyToJavaBean(xml, ItemStatusDetail.class);
//            if (detail != null)
//            {
//                System.out.println(
//                        detail.getMeta().getFeedStatus() + "->>> error qty:" + detail.getMeta().getItemsFailed());
//                if (detail.getElements() != null)
//                {
//                    List<PartnerItemIngestionStatus> list = detail.getElements().getItemDetails()
//                            .getItemIngestionStatus();
//                    for (int i = 0; i < list.size(); i++)
//                    {
//                        String errors = "";
//                        PartnerItemIngestionStatus status = list.get(i);
//                        for (IngestionError error : status.getIngestionErrors().getIngestionError())
//                        {
//                            errors = errors + error.getDescription();
//                        }
//                        System.out.println(
//                                i + "." + status.getSku() + " : " + status.getIngestionStatus() + "->" + errors);
//
//                    }
//                }
//                if (!FeedStatus.PROCESSED.name().equals(detail.getMeta().getFeedStatus().name()))
//                {
//                    getFeeds(feedId);
//                }
//            }
//        }
//        catch (Exception e)
//        {
//        }
//    }
//
//    private static Order acknowledgeOrder(String purchaseOrderId)
//    {
//        String requestUrl = baseUrl + purchaseOrderId + "/acknowledge";
//        String requestMethod = "POST";
//        Order acknowledgeOrder = null;
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//        try
//        {
//            System.out.println(requestUrl);
//            String xml = httpClient.doHttpPost(requestUrl, null);
//            System.out.println(xml);
//            Order order = JAXBUtil.converyToJavaBean(xml, Order.class);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return acknowledgeOrder;
//    }
//
//    private static void cancellingOrder(String purchaseOrderId)
//    {
//        String requestUrl = baseUrl + purchaseOrderId + "/cancel";
//        String requestMethod = "POST";
//
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//
//        try
//        {
//            OrderLinesType orderLines = setOrderLines();
//            String requestBoby = JAXBUtil.convertToXml(orderLines);
//            System.out.println(requestUrl);
//            String str = readFileContent("C:\\Users\\dev003\\Desktop\\1.xml");
//            System.out.println(str);
//            String xml = httpClient.doHttpPost(requestUrl, str);
//            System.out.println(xml);
//
//            Order order = JAXBUtil.converyToJavaBean(xml, Order.class);
//            System.out.println();
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    private static OrderLinesType setOrderLines()
//    {
//        OrderLinesType orderLines = new OrderLinesType();
//        // List<OrderLinesType> orderLine = new ArrayList<>();
//        // OrderLineType order = new OrderLineType();
//        // OrderLineStatuses orderLineStatuses = new OrderLineStatuses();
//        // OrderLineStatus orderLineStatus = new OrderLineStatus();
//        // orderLineStatus.setStatus("Cancelled");
//        // StatusQuantity statusQuantity = new StatusQuantity();
//        // statusQuantity.setAmount("1");
//        // statusQuantity.setUnitOfMeasurement("EACH");
//        // orderLineStatus.setStatusQuantity(statusQuantity);
//        // orderLineStatus.setCancellationReason("CANCEL_BY_SELLER");
//        // orderLineStatuses.setOrderLineStatus(orderLineStatus);
//        // order.setOrderLineStatuses(orderLineStatuses);
//        // orderLine.add(order);
//        // orderLines.setOrderLine(orderLine);
//        return orderLines;
//    }
//
//    private static void fetchOrders(String parameter)
//    {
//        String finalUrl = baseUrl + parameter;
//
//        List<Order> list = null;
//        try
//        {
//            list = getAllReleasedOrders(finalUrl);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        for (Order order : list)
//        {
//            if (order.getOrderLines().getOrderLine().get(0).getOrderLineStatuses().getOrderLineStatus().get(0)
//                    .getStatus().equals(OrderLineStatusValueType.CANCELLED))
//            {
//                continue;
//            }
//            // System.out.print(order.getPurchaseOrderId() + ","+order.getCustomerOrderId()+ ",");
//            System.out.println(
//                    order.getPurchaseOrderId() + " : " + order.getCustomerOrderId() + "->" + order.getOrderDate());
//            List<OrderLineType> orderList = order.getOrderLines().getOrderLine();
//            for (OrderLineType orderLine : orderList)
//            {
//                String amount = null;
//                for (ChargeType chargeType : orderLine.getCharges().getCharge())
//                {
//                    amount = chargeType.getChargeAmount().getAmount().toString();
//                    amount = chargeType.getChargeType() + "->" + amount + ",Tax->"
//                            + (chargeType.getTax() != null ? chargeType.getTax().getTaxAmount().getAmount() : "");
//                }
//                OrderLineStatusType type = orderLine.getOrderLineStatuses().getOrderLineStatus().get(0);
//                String methodCode = "";
//                String trackingNumbe = "";
//                if (type.getTrackingInfo() != null)
//                {
//                    methodCode = type.getTrackingInfo().getCarrierName().getCarrier().name();
//                    trackingNumbe = type.getTrackingInfo().getTrackingNumber();
//                }
//                System.out.println(orderLine.getLineNumber() + " : " + type.getStatus() + "->" + methodCode + ":"
//                        + trackingNumbe + " : " + orderLine.getItem().getSku() + " : "
//                        + orderLine.getOrderLineQuantity().getAmount() + " : " + amount);
//            }
//            System.out.println("-----------------------------");
//        }
//    }
//
//    private static void shippingUpdates(String s)
//    {
//        String purchaseOrderId = s.split(",")[0];
//        int num = Integer.parseInt(s.split(",")[1]);
//        String track = s.split(",")[2];
//        String requestUrl = baseUrl + purchaseOrderId + "/shipping";
//        String requestMethod = "POST";
//
//        HttpClientHelper httpClient = createHttpClient(requestUrl, requestMethod);
//
//        try
//        {
//            OrderShipment orderShipment = setOrderShipment(num, track, "UPS", "Standard", new Date());
//            System.out.println(requestUrl);
//            String requestBoby = JAXBUtil.convertToXml(orderShipment);
//            System.out.println(requestBoby);
//            String xml = httpClient.doHttpPost(requestUrl, requestBoby);
//            System.out.println(xml);
//
//            Order order = JAXBUtil.converyToJavaBean(xml, Order.class);
//            System.out.println();
//
//        }
//        catch (JAXBException e)
//        {
//            e.printStackTrace();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<Order> getAllReleasedOrders(String finalUrl) throws Exception
//    {
//        String requestMethod = "GET";
//
//        HttpClientHelper httpClient = createHttpClient(finalUrl, requestMethod);
//
//        List<Order> orderList = new ArrayList<>();
//        System.out.println(finalUrl);
//        String xml = httpClient.doHttpGet(finalUrl);
//        System.out.println(xml);
//
//        OrdersListType ordersListType = JAXBUtil.converyToJavaBean(xml, OrdersListType.class);
//        MetaType meta = ordersListType.getMeta();
//        List<Order> orders = ordersListType.getElements().getOrder();
//        orderList.addAll(orders);
//        if (meta != null && meta.getNextCursor() != null)
//        {
//            String nextUrl = baseUrl + meta.getNextCursor();
//            orderList.addAll(getAllReleasedOrders(nextUrl));
//        }
//        return orderList;
//
//    }
//
//    private static HttpClientHelper createHttpClient(String requestUrl, String requestMethod)
//    {
//        HttpClientHelper httpClient = new HttpClientHelper();
//        String timestamp = String.valueOf(System.currentTimeMillis());
//        String stringToSign = consumerId + "\n" + requestUrl + "\n" + requestMethod + "\n" + timestamp + "\n";
//        String signedString = signData(stringToSign, privateEncodedStr);
//        httpClient.setMap(setMap(signedString, timestamp, consumerId, consumerChannelType));
//        return httpClient;
//    }
//
//    private static OrderShipment setOrderShipment(int lineNumber, String trackingNumber, String carrier,
//            String methodCode, Date shipDateTime)
//    {
//        OrderShipment orderShipment = new OrderShipment();
//        ShippingLinesType orderLines = new ShippingLinesType();
//        for (int i = 1; i <= lineNumber; i++)
//        {
//            ShippingLineType shippingLine = new ShippingLineType();
//            shippingLine.setLineNumber(2 + "");
//            ShipLineStatusesType orderLineStatuses = new ShipLineStatusesType();
//            ShipLineStatusType shipLineStatusType = new ShipLineStatusType();
//            shipLineStatusType.setStatus(OrderLineStatusValueType.SHIPPED);
//
//            TrackingInfoType trackingInfo = new TrackingInfoType();
//            CarrierNameType carrierName = new CarrierNameType();
//            CarrierType carrierType = CarrierType.fromValue(carrier);
//            carrierName.setCarrier(carrierType);
//            trackingInfo.setCarrierName(carrierName);
//            trackingInfo.setMethodCode(ShippingMethodCodeType.fromValue(methodCode));
//            trackingInfo.setTrackingNumber(trackingNumber);
//            trackingInfo.setShipDateTime(convertToXMLGregorianCalendar(shipDateTime));
//            shipLineStatusType.setTrackingInfo(trackingInfo);
//
//            orderLineStatuses.getOrderLineStatus().add(shipLineStatusType);
//            shippingLine.setOrderLineStatuses(orderLineStatuses);
//            orderLines.getOrderLine().add(shippingLine);
//        }
//        orderShipment.setOrderLines(orderLines);
//        return orderShipment;
//    }
//
//    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date)
//    {
//
//        GregorianCalendar cal = new GregorianCalendar();
//        cal.setTime(date);
//        XMLGregorianCalendar gc = null;
//        try
//        {
//            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
//        }
//        catch (Exception e)
//        {
//
//            e.printStackTrace();
//        }
//        return gc;
//    }
//
//    private static Map<String, Map<String, Object>> setMap(String signedString, String timestamp, String consumerId,
//            String consumerChannelType)
//    {
//        Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
//        Map<String, Object> value = new HashMap<String, Object>();
//        value.put("WM_SVC.NAME", "Walmart Marketplace");
//        value.put("WM_SEC.AUTH_SIGNATURE", signedString);
//        value.put("WM_CONSUMER.ID", consumerId);
//        value.put("WM_SEC.TIMESTAMP", timestamp);
//        value.put("WM_QOS.CORRELATION_ID", (int) (Math.random() * 9000 + 1000));
//        value.put("Accept", "application/xml");
//        value.put("Content-Type", "application/xml");
//        String boundary = UUID.randomUUID().toString().replace("-", "");
//        // value.put("Content-Type", "multipart/form-data");
//        if (consumerChannelType != null && consumerChannelType.length() > 0)
//        {
//            value.put("WM_CONSUMER.CHANNEL.TYPE", consumerChannelType);
//        }
//        // value.put("Host", "https://marketplace.walmartapis.com");
//        map.put("head", value);
//        return map;
//    }
//
//    private static String signData(String stringToBeSigned, String encodedPrivateKey)
//    {
//        String signatureString = null;
//        try
//        {
//            byte[] encodedKeyBytes = Base64.decodeBase64(encodedPrivateKey);
//            PKCS8EncodedKeySpec privSpec = new PKCS8EncodedKeySpec(encodedKeyBytes);
//            KeyFactory kf = KeyFactory.getInstance("RSA");
//            PrivateKey myPrivateKey = kf.generatePrivate(privSpec);
//            Signature signature = Signature.getInstance("SHA256withRSA");
//            signature.initSign(myPrivateKey);
//            byte[] data = stringToBeSigned.getBytes("UTF-8");
//            signature.update(data);
//            byte[] signedBytes = signature.sign();
//            signatureString = Base64.encodeBase64String(signedBytes);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return signatureString;
//    }
//
//    private static String readFileContent(String fileName) throws IOException
//    {
//
//        File file = new File(fileName);
//
//        BufferedReader bf = new BufferedReader(new FileReader(file));
//
//        String content = "";
//        StringBuilder sb = new StringBuilder();
//
//        while (content != null)
//        {
//            content = bf.readLine();
//
//            if (content == null)
//            {
//                break;
//            }
//
//            sb.append(content);
//        }
//
//        bf.close();
//        return sb.toString();
//    }
//
//    private static NameValuePair[] generatNameValuePair(Map<String, String> properties)
//    {
//        NameValuePair[] nameValuePair = new NameValuePair[properties.size()];
//        int i = 0;
//        for (Map.Entry<String, String> entry : properties.entrySet())
//        {
//            nameValuePair[i++] = new NameValuePair(entry.getKey(), entry.getValue());
//        }
//
//        return nameValuePair;
//    }
//
//}
