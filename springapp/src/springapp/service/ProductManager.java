/**
 * 
 */
package springapp.service;

/**
 * @author dhamo
 *
 */

import java.io.Serializable;
import java.util.List;

import springapp.domain.Product;
import springapp.repository.ProductDao;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    public void setTotalPrice(Double totalPrice);
    public Double getTotalPrice();
    public void setProductDao(ProductDao productDao);
    public void setProducts(List<Product> productList);
    
}