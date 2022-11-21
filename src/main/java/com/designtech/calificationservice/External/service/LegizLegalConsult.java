package com.designtech.calificationservice.External.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("legal-consult-service")
public interface LegizLegalConsult {

}
