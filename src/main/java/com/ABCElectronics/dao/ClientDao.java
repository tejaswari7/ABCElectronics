package com.ABCElectronics.dao;

import com.ABCElectronics.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Integer> {
}
