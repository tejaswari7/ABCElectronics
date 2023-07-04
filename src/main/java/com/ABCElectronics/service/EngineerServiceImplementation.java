package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;

import java.time.LocalDate;
import java.util.List;

public class EngineerServiceImplementation implements EngineerService{
    @Override
    public List<Complaint> getAllOpenComplaints(int engineerId) {
        return null;
    }

    @Override
    public List<Complaint> getResolvedComplaints(int engineerId) {
        return null;
    }

    @Override
    public List<Complaint> getResolvedComplaintsByDate(int engineerId, LocalDate date) {
        return null;
    }

    @Override
    public String changeComplaintStatus(int complaintId) {
        return null;
    }
}
