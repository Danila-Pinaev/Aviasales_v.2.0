package com.example.aviasales2.config.filterConfig;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HotelFilter {
    private String city;
    private Short rating;
    private String dateFrom;
}
