package com.ABCElectronics.dto;

import com.ABCElectronics.bean.Complaint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineerDto {

    private String password;
    private String engineerName;
    private List<Complaint> complaintList;
}

