package com.ABCElectronics.service;

import com.ABCElectronics.bean.Complaint;
import com.ABCElectronics.bean.Engineer;
import com.ABCElectronics.bean.Product;
import com.ABCElectronics.dao.ComplaintDao;
import com.ABCElectronics.dao.ProductDao;
import com.ABCElectronics.dto.ProductDto;
import com.ABCElectronics.exception.InvalidModelNumber;
import com.ABCElectronics.exception.RecordNotFound;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImplementation implements ProductService{
    ComplaintDao complaintDao;
    ProductDao productDao;
    @Override
    public Product addProduct(ProductDto product) {
        Product newProduct= new Product();
        newProduct.setProductName(product.getProductName());
        newProduct.setProductCategoryName(product.getProductCategoryName());
        newProduct.setDateOfPurchase(product.getDateOfPurchase());
        newProduct.setWarrantyYears(product.getWarrantyYears());
        newProduct.setWarrantyDate(product.getWarrantDate());
        productDao.save(newProduct);
        return newProduct;
    }

    @Override
    public void removeProducts(int modelNumber) throws RecordNotFound {
        if(productDao.findById(modelNumber).isEmpty())
            throw new RecordNotFound(Product.class.toString());
        productDao.deleteById(modelNumber);
    }

    @Override
    public List<Product> getProduct(int modelNumber) {
        return productDao.findAll();
    }

    @Override
    public void updateProductWarranty(int modelNumber) {
//inc from current date till 1yr
    }

    @Override
    public List<Complaint> getProductComplaints(int modelNumber) throws InvalidModelNumber {
//       productDao.findById(modelNumber).orElseThrow(()-> new InvalidModelNumber(Product.class.toString()));
        return complaintDao.findByProductModelNumber(modelNumber);
    }

    @Override
    public List<Engineer> getEngineersByProduct(int modelNumber) throws InvalidModelNumber {
        productDao.findById(modelNumber).orElseThrow(()-> new InvalidModelNumber(Product.class.toString()));

        List<Complaint> complaints = complaintDao.findByProductModelNumber(modelNumber);
        List<Engineer> engineers = new ArrayList<Engineer>();

        complaints.forEach(complaint -> engineers.add(complaint.getEngineer()));
        return engineers;
    }
}
