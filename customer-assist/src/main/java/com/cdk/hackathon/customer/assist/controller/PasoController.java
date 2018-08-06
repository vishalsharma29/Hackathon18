package com.cdk.hackathon.customer.assist.controller;

import com.cdk.hackathon.customer.assist.dto.RecommendationDto;
import com.cdk.hackathon.customer.assist.service.PasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PasoController {

    @Autowired
    PasoService pasoService;

    @RequestMapping(value = "/recommendation/{area}/{intent}", method = RequestMethod.GET)
    public List<RecommendationDto> getRecommendation(@PathVariable("area") String area, @PathVariable("intent") String intent) {
        return pasoService.getRecommendation(area, intent);
    }
}
