package com.hackearth.goldenticket.mmg.eobaoobboardingapp.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class YourBusinessInfo {
    @Id
    private String arn;

    private String businessName;

    private String website;

    private String startedTradingSince;


}
