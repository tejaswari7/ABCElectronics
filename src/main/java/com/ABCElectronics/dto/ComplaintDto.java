package com.ABCElectronics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintDto {

    private String productModelNumber;
    private String complaintName;
    private String status;
    private int clientId;
    private int engineerId;
}
