package com.ABCElectronics.dao;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    List<Product> findByProductName();
}
