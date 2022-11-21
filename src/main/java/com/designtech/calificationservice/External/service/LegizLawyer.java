package com.designtech.calificationservice.External.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.designtech.calificationservice.External.domain.model.Lawyer;


@FeignClient("lawyer-service")
public interface LegizLawyer {
    @RequestMapping("/api/lawyer/findlawyer/{lawyerId}")
    Lawyer findById(@PathVariable Long lawyerId);
    @RequestMapping("/api/lawyer/existlawyer/{lawyerId}")
    boolean existById(@PathVariable Long lawyerId);
}
