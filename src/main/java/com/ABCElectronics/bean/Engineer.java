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
public class Engineer {

    @Id
    @GeneratedValue
    private int engineerId;
    private String password;
    private String engineerName;

    @OneToMany(cascade= CascadeType.ALL)
    private List<Complaint> complaintList;

}
