/**
 * 
 */
package springapp.service;

import java.util.List;

import springapp.domain.Product;
import springapp.repository.ProductDao;

/**
 * @author dhamo
 *
 */
public class SimpleProductManager implements ProductManager {

	private List<Product> products;
	private Double totalPrice;
	
	/* (non-Javadoc)
	 * @see springapp.service.ProductManager#increasePrice(int)
	 */
	public void increasePrice(int percentage) {
	      if (products != null) {
	            for (Product product : products) {
	                double newPrice = product.getPrice().doubleValue() * 
	                                    (100 + percentage)/100;
	                product.setPrice(newPrice);
	            }
	        }
	}

	/* (non-Javadoc)
	 * @see springapp.service.ProductManager#getProducts()
	 */
	public List<Product> getProducts() {
		return products;
	}

	 public void setProducts(List<Product> theProducts) {
	        this.products = theProducts;        
	 }

	public void setTotalPrice(Double aTotalPrice) {
		totalPrice = aTotalPrice;
	}

	public Double getTotalPrice() {
		Double lTotalPrice = new Double(0d);
		  if (products != null) {
	            for (Product product : products) {
	            	lTotalPrice += product.getPrice();
	            }
	        }
		return lTotalPrice;
	}

	public void setProductDao(ProductDao productDao) {
		// TODO Auto-generated method stub
		
	}	
}
