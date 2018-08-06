package com.cdk.hackathon.customer.assist.controller;

import com.cdk.hackathon.customer.assist.dto.AdCopyDto;
import com.cdk.hackathon.customer.assist.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdController {
    @Autowired
    private AdService adService;

    @RequestMapping(value = "/ad/get/top", method = RequestMethod.GET)
    public List<AdCopyDto> getAd() {
        return null;
    }
}
