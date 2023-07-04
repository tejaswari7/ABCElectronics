package com.ABCElectronics.dao;

import com.ABCElectronics.bean.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintDao extends JpaRepository<Complaint,Integer> {
    static void findByComplaintId() {
    }



    List<Complaint> findByProductName();

    List<Complaint> findByProductModelNumber(int modelNumber);
}
