package com.ABCElectronics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String productName;
    private String productCategoryName;
    private LocalDate dateOfPurchase;
    private int warrantyYears;
    private LocalDate warrantDate;
}
