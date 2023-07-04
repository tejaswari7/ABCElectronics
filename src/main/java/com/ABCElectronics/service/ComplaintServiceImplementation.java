package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.bean.Product;

import java.util.List;

public class ComplaintServiceImplementation implements ComplaintService {
    @Override
    public boolean bookComplaint(int clientId, int ComplaintId, int modelNumber) {
        return false;
    }

    @Override
    public String changeComplaintStatus(int complaintId) {
        return null;
    }

    @Override
    public List<Complaint> getClientAllComplaints(int clientId) {
        return null;
    }

    @Override
    public List<Complaint> getClientAllOpenComplaints(int clientId) {
        return null;
    }

    @Override
    public Engineer getEngineer(int employeeId) {
        return null;
    }

    @Override
    public Product getProductByComplaint(int ComplaintId) {
        return null;
    }
}
