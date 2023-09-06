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
public class GetStartedInfo {
    @Id
    private String arn;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String mobileNumber;

    private String countryOfBirth;

    private String nationality;

    private String address;




}
