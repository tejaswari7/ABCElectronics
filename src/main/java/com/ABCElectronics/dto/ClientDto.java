package com.ABCElectronics.dto;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private String password;
    private String address;
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min=10,max=10,message = "phone number must have 10 digits")
    private String phoneNumber;
    private List<Complaint> complaintList;
    private List<Product> productList;
}
