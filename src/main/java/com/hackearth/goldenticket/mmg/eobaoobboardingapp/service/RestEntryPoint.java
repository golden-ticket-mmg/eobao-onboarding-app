package com.hackearth.goldenticket.mmg.eobaoobboardingapp.service;

import com.hackearth.goldenticket.mmg.eobaoobboardingapp.data.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("onboarding")
@Slf4j
public class RestEntryPoint {

    private RestTemplate restTemplate;

    RestEntryPoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{arn}")
    public Company getCompany(@PathVariable String arn) {
        log.info("Looking for company by ARN {}", arn);
        ResponseEntity<Company> responseEntity = restTemplate
                .getForEntity("http://localhost:9502/online-data/" + arn,
                        Company.class);

        Company company = responseEntity.getBody();
        log.info("For ARN {} found company {}", arn, company);

        return company;

    }
}
