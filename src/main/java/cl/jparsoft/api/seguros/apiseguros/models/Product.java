package cl.jparsoft.api.seguros.apiseguros.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private Long price;
	
	@Column(name = "sellIn")
	private Long sellIn;
	
	

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getSellIn() {
		return this.sellIn;
	}

	public void setSellIn(Long sellIn) {
		this.sellIn = sellIn;
	}

	@Override
	public String toString() {
		return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", price='" + getPrice() + "'"
				+ ", sellIn='" + getSellIn() + "'" + "}";
	}

}
