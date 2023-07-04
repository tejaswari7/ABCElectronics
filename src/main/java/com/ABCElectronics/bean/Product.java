package com.ABCElectronics.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private int modelNumber;
    private String productName;
    private String productCategoryName;
    private LocalDate dateOfPurchase;
    private int warrantyYears;
    private LocalDate warrantyDate;

}
