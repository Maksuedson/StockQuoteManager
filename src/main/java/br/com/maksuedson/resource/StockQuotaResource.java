package br.com.maksuedson.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maksuedson.entity.StockQuota;
import br.com.maksuedson.repository.StockQuotaRepository;

@RestController
@RequestMapping (value = "/stockquotas")
public class StockQuotaResource {
	
	@Autowired
	StockQuotaRepository repo;
	
	@GetMapping
	public List<StockQuota> findAll(){		
		return repo.findAll();
	}
	
	@GetMapping ( path = ("{id}"))
	public StockQuota findQuotaById(@PathVariable ("id") String id) {		
		return repo.findById(id).orElse(null);		
	}
	
	@DeleteMapping ( path = ("{id}"))
	public void deleteById(@PathVariable ("id") String id) {
		repo.deleteById(id);
	}
	
	@PostMapping
	public StockQuota addQuota(@RequestBody StockQuota obj) {
		return repo.save(obj);
	}

}
