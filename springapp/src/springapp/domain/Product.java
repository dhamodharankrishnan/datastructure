package springapp.domain;

import java.io.Serializable;

public class Product implements Serializable {

	private Integer id;
    private String description;
    private Double price;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description
				+ ", price=" + price + "]";
	}


}