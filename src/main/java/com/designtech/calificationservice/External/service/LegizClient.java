package com.designtech.calificationservice.External.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.designtech.calificationservice.External.domain.model.Client;



@FeignClient("client-service")
public interface LegizClient {
    @RequestMapping("/api/client/findclient/{clientId}")
    Client findById(@PathVariable Long clientId);
    @RequestMapping("/api/client/existClient/{clientId}")
    boolean existById(@PathVariable Long clientId);
}
