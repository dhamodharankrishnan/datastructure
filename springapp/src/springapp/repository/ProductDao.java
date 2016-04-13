/**
 * 
 */
package springapp.repository;

import java.util.List;

import springapp.domain.Product;

/**
 * @author dhamo
 *
 */
public interface ProductDao {
	   public List<Product> getProductList();

	    public void saveProduct(Product prod);
}
