package com.ABCElectronics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {

    private String password;
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min=10,max=10,message = "phone number must have 10 digits")
    private long contactNumber;
    @NotEmpty
    @Email(regexp = "[a-zA-Z_][\\w]*@[a-zA-Z]+[.][a-zA-Z]+",message = "Invalid Email, should follow <id>@<domain>.<topleveldomain> pattern")
    private String emailId;
}
