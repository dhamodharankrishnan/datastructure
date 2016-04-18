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
public class DBProductManager implements ProductManager {

	private ProductDao productDao;
	private List<Product> productList;

	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/* (non-Javadoc)
	 * @see springapp.service.ProductManager#increasePrice(int)
	 */
	public void increasePrice(int percentage) {
		//List<Product> products = productDao.getProductList();
        if (productList != null) {
            for (Product product : productList) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }

	}

	/* (non-Javadoc)
	 * @see springapp.service.ProductManager#getProducts()
	 */
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productDao.getProductList();
	}

	public void setProducts(List<Product> productList){
		this.productList = productList;
	}
	/* (non-Javadoc)
	 * @see springapp.service.ProductManager#setTotalPrice(java.lang.Double)
	 */
	public void setTotalPrice(Double totalPrice) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see springapp.service.ProductManager#getTotalPrice()
	 */
	public Double getTotalPrice() {
		Double lTotalPrice = new Double(0d);
		List<Product> productList = productDao.getProductList();
		  if (productList != null) {
	            for (Product product : productList) {
	            	lTotalPrice += product.getPrice();
	            }
	        }
		return lTotalPrice;
	}

}
