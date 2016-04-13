package springapp.regular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestCase;
import springapp.domain.Product;

public class DatabaseTest extends TestCase {

	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    Connection conn;
	Statement stmt;
	ResultSet resultSet;
	
	@Override
	protected void setUp() throws Exception {
		Class.forName("org.hsqldb.jdbcDriver");
		conn = DriverManager.getConnection("jdbc:hsqldb:hsql://DAM-ACER");
		
		logger.info("conn..."+conn);
		assertNotNull(conn);
	}

	public void testGetData(){
		try {
			stmt = conn.createStatement();
			logger.info("stmt..."+stmt);
			assertNotNull(stmt);
			resultSet = stmt.executeQuery("SELECT ID, DESCRIPTION, PRICE FROM PRODUCTS");
			assertNotNull(resultSet);
			
			List<Product> productList = new ArrayList<Product>();
			
			
			while(resultSet.next()){
				Product product = new Product();
				Integer idValue = resultSet.getInt("ID");
				product.setId(idValue);
				String description = resultSet.getString("DESCRIPTION");
				product.setDescription(description);
				Double price = resultSet.getDouble("PRICE");
				product.setPrice(price);
				productList.add(product);
			}
			logger.info("productList:"+productList);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(resultSet != null){
				try {
					logger.info("Closing resultset");
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(stmt != null){
				try {
					logger.info("Closing stmt");
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	
	public void testUpdateSql(){
		Product product = new Product();
		product.setDescription("Printer");
		product.setId(3);
		product.setPrice(4500.23);
		
		String updSql = "update products set description = '"+product.getDescription() +"' , price = "+product.getPrice() + " where id = "+product.getId();
		logger.info("updSql :"+updSql);
		try {
			stmt = conn.createStatement();
			int updCount = stmt.executeUpdate(updSql);
			logger.info("updCount :"+updCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(stmt != null){
				try {
					logger.info("Closing stmt");
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	protected void tearDown() throws Exception {
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
