package com.ABCElectronics.dao;

import com.ABCElectronics.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,Integer> {
}
