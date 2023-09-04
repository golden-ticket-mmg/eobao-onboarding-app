package com.hackearth.goldenticket.mmg.eobaoobboardingapp.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Companies {

    List<Company> companies;
}
