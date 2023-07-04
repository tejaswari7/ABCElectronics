package com.ABCElectronics.service;

import com.ABCElectronics.bean.Client;
import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.dto.ClientDto;
import com.ABCElectronics.exception.InvalidPhoneNumber;
import com.ABCElectronics.exception.RecordNotFound;

public interface ClientService {

    Client addClient(ClientDto client) throws InvalidPhoneNumber;
    Client getClientByClientId(int clientId) throws RecordNotFound;
    Engineer getEngineerById(int engineerId) throws RecordNotFound;
    public void validateClient(String phone) throws InvalidPhoneNumber;

    String changeStatusOfComplaint(int ComplaintId);

}
