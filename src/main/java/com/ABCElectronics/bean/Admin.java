package com.ABCElectronics.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue
    private long adminId;
    private String password;
    private long contactNumber;
    private String emailId;
}
