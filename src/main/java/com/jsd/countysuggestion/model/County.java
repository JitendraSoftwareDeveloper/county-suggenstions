package com.jsd.countysuggestion.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTY")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class County {
    @Id
    private Integer fips;
    private String state;
    private String name;
}

