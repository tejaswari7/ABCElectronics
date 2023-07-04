package com.ABCElectronics.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private int clientId;
    private String password;
    private String address;
    private String phoneNumber;

    @OneToMany(cascade= CascadeType.ALL)
    private List<Complaint> complaintList;

    @OneToMany(cascade= CascadeType.ALL)
    private List<Product> productList;
}
