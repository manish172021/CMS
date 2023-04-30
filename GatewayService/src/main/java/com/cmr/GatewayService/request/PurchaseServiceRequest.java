package com.cmr.GatewayService.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "purchase-service", //microservice-application-name
        path = "cms/purchase", //pre-path for service endpoints
        // url = "${purchase.service.url}", // commented after eureka enabled
        configuration = FeignConfiguration.class)
public interface PurchaseServiceRequest
{
    @PostMapping//cms/purchase
    Object savePurchase(@RequestBody Object requestBody);

    @GetMapping("{userId}")//cms/purchase/{userId}
    List<Object> getAllPurchasesOfUser(@PathVariable("userId") Long userId);
}
