package com.web.WeMeioPet.ServiceLayer.ProductService;

import com.web.WeMeioPet.entities.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(Product product);
    public Product getProductById(int id);
    public List<Product> getAllProduct();
}
