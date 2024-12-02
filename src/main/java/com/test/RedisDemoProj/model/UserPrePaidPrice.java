package com.test.RedisDemoProj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPrePaidPrice {

    private Integer englishSMSPrice;
    private Integer persianSMSPrice;
}

