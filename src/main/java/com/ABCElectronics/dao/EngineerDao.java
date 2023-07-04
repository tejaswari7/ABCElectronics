package com.ABCElectronics.dao;

import com.ABCElectronics.bean.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerDao extends JpaRepository<Engineer,Integer> {
}
