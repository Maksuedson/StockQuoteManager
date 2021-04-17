package br.com.maksuedson.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StockQuota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private Stock stock;
	
	public StockQuota() {		
	}	
	
	public StockQuota(Stock stock, List<Quota> quotes) {
		this.stock = stock;
		this.quotes = quotes;
	}

	@OneToMany
	(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Quota>quotes = new ArrayList<Quota>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public List<Quota> getQuotes() {
		return quotes;
	}
	
}
