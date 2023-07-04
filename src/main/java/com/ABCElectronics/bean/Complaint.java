package com.ABCElectronics.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Complaint {

    @Id
    @GeneratedValue
    private int complaintId;
    private String productModelNumber;
    private String complaintName;
    private String status;
    private int clientId;
    private int engineerId;

}
