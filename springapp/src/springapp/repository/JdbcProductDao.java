package springapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import springapp.domain.Product;

public class JdbcProductDao extends SimpleJdbcDaoSupport implements ProductDao{

	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    /**
	 * @author dhamo
	 *
	 */
	private static class ProductMapper implements ParameterizedRowMapper<Product> {

		/* (non-Javadoc)
		 * @see org.springframework.jdbc.core.simple.ParameterizedRowMapper#mapRow(java.sql.ResultSet, int)
		 */
		public Product mapRow(ResultSet aResultSet, int rowNum) throws SQLException {
			Product product = new Product();
			Integer idValue = aResultSet.getInt("ID");
			product.setId(idValue);
			String description = aResultSet.getString("DESCRIPTION");
			product.setDescription(description);
			Double price = aResultSet.getDouble("PRICE");
			product.setPrice(price);
			return product;
		}

	}
	

	public List<Product> getProductList() {
		logger.info("Getting products");
		List<Product> productList = getSimpleJdbcTemplate().query("SELECT ID, DESCRIPTION, PRICE FROM PRODUCTS",
				new ProductMapper());
		return productList;
	}

	public void saveProduct(Product prod) {
		logger.info("Saving product: " + prod.getDescription());
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("description", prod.getDescription());
		mapSqlParameterSource.addValue("price", prod.getPrice());
		mapSqlParameterSource.addValue("id", prod.getId());
		
		int updCount = getSimpleJdbcTemplate().update("update products set description = :description, price = :price where id = :id", 
				mapSqlParameterSource);
		logger.info("Rows affected: " + updCount);
		
	}

}
