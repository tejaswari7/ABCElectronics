package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.dao.ComplaintDao;
import com.ABCElectronics.dao.EngineerDao;
import com.ABCElectronics.dao.ProductDao;
import com.ABCElectronics.dto.EngineerDto;
import com.ABCElectronics.exception.InvalidComplaintId;
import com.ABCElectronics.exception.InvalidEngineerId;
import com.ABCElectronics.exception.RecordNotFound;

import java.util.List;

public class AdminServiceImplementation implements AdminService{

    ComplaintDao complaintDao;
    EngineerDao engineerDao;
    ProductDao productDao;
    @Override
    public Engineer addEngineer(EngineerDto engineer) {
        Engineer newEngineer= new Engineer();
        newEngineer.setEngineerName(engineer.getEngineerName());
        newEngineer.setPassword(engineer.getPassword());
        engineerDao.save(newEngineer);
        return newEngineer;
    }

    @Override
    public void removeEngineer(int engineerId) throws RecordNotFound    {
        if(engineerDao.findById(engineerId).isEmpty())
            throw new RecordNotFound(Engineer.class.toString());
        engineerDao.deleteById(engineerId);
    }

    @Override
    public List<Complaint> getComplaintsByProducts(String productModelNumber) {
        return complaintDao.findByProductModelNumber();
    }

    @Override
    public List<Complaint> getComplaints() {
        return complaintDao.findAll();
    }

    @Override
    public Complaint replaceEngineerFromComplaint(int engineerId, int complaintId) throws InvalidComplaintId,InvalidEngineerId {
      Complaint newComplaint =  complaintDao.findById(complaintId).orElseThrow(
              () -> new InvalidComplaintId("Complaint with ID: " + complaintId + " not found"));

      Engineer newEngineer = engineerDao.findById(engineerId).orElseThrow(
                () -> new InvalidEngineerId("Engineer with ID: " + engineerId + " not found"));

      newComplaint.setEngineerId(engineerId);
        complaintDao.save(newComplaint);
        return newComplaint;
    }
}
