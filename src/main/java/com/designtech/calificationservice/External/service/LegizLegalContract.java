package com.designtech.calificationservice.External.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("legal-contract-service")
public interface LegizLegalContract {

}
