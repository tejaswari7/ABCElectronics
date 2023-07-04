package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.bean.Product;
import com.ABCElectronics.dto.ProductDto;
import com.ABCElectronics.exception.InvalidModelNumber;
import com.ABCElectronics.exception.RecordNotFound;

import java.util.List;

public interface ProductService {
    Product addProduct(ProductDto product);

    void removeProducts(int modelNumber) throws RecordNotFound;
    List<Product> getProduct(int modelNumber);
    void updateProductWarranty(int modelNumber);
    List <Complaint> getProductComplaints(int modelNumber) throws InvalidModelNumber;

    List<Engineer> getEngineersByProduct(int modelNumber) throws InvalidModelNumber;
}
