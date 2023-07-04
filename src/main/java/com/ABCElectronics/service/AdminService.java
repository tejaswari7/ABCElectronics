package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.bean.Product;
import com.ABCElectronics.dto.EngineerDto;
import com.ABCElectronics.exception.InvalidComplaintId;
import com.ABCElectronics.exception.InvalidEngineerId;
import com.ABCElectronics.exception.RecordNotFound;

import java.util.List;

public interface AdminService {

    Engineer addEngineer(EngineerDto engineer);
    void removeEngineer(int engineerId) throws RecordNotFound;
    List<Complaint> getComplaintsByProducts(String productName);
    List<Complaint> getComplaints();
    Complaint replaceEngineerFromComplaint(int engineerId,int complaintId) throws InvalidComplaintId, InvalidEngineerId;

}
