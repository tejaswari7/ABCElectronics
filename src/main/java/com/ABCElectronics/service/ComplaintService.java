package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.bean.Product;

import java.util.List;

public interface ComplaintService {
    boolean bookComplaint(int clientId, int ComplaintId, int modelNumber);
    String changeComplaintStatus(int complaintId);
    List<Complaint> getClientAllComplaints(int clientId);
    List<Complaint> getClientAllOpenComplaints(int clientId);
    Engineer getEngineer(int employeeId);
    Product getProductByComplaint(int ComplaintId);
}
