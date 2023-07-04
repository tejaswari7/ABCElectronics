package com.ABCElectronics.service;

import com.ABCElectronics.bean.Client;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.dao.ClientDao;
import com.ABCElectronics.dao.EngineerDao;
import com.ABCElectronics.dto.ClientDto;
import com.ABCElectronics.exception.InvalidPhoneNumber;
import com.ABCElectronics.exception.RecordNotFound;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientServiceImplementation implements ClientService{
//    private final PasswordEncoder passwordEncoder;
    ClientDao clientDao;
    EngineerDao engineerDao;
    @Override
    public Client addClient(ClientDto client) throws InvalidPhoneNumber {
        Client newClient= new Client();
        newClient.setAddress(client.getAddress());
        newClient.setPhoneNumber(client.getPhoneNumber());
        newClient.setPassword(client.getPassword());
//        newClient.setPassword(passwordEncoder.encode(user.getUserPassword()));
        this.validateClient(newClient.getPhoneNumber());
//        log.info("User is: {}",user);
        clientDao.save(newClient);
        return newClient;
    }
    public void validateClient(String phone) throws InvalidPhoneNumber {

        String regexPhone = "[1-9][\\d]{9}";
        Pattern p1 = Pattern.compile(regexPhone);
        Matcher m1 = p1.matcher(phone);
        if(!m1.matches())
            throw new InvalidPhoneNumber("Phone number should contain only 10 Digits & should not start with 0");

    }
    @Override
    public Client getClientByClientId(int clientId) throws RecordNotFound {
        return clientDao.findById(clientId).orElseThrow( ()->new RecordNotFound(Client.class.toString()));
    }

    @Override
    public Engineer getEngineerById(int engineerId) throws RecordNotFound {
        return engineerDao.findById(engineerId).orElseThrow( ()->new RecordNotFound(Client.class.toString()));
    }

    @Override
    public String changeStatusOfComplaint(int ComplaintId) {
        return null;
    }
}
