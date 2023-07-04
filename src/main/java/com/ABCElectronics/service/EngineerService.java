package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;

import java.time.LocalDate;
import java.util.List;

public interface EngineerService {

    List<Complaint> getAllOpenComplaints(int engineerId);
    List<Complaint> getResolvedComplaints(int engineerId);
    List<Complaint> getResolvedComplaintsByDate(int engineerId, LocalDate date);
//    List<Complaint> getComplaints(int engineerId); client id
    String changeComplaintStatus(int complaintId);

}
