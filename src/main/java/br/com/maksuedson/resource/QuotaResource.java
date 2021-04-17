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

import br.com.maksuedson.entity.Quota;
import br.com.maksuedson.repository.QuotaRepository;

@RestController
@RequestMapping (value = "/quotas")
public class QuotaResource {
	
	@Autowired
	QuotaRepository repo;
	
	@GetMapping
	public List<Quota> findAll(){		
		return repo.findAll();
	}
	
	@GetMapping ( path = ("{id}"))
	public Quota findQuotaById(@PathVariable ("id") String id) {		
		return repo.findById(id).orElse(null);		
	}
	
	@DeleteMapping ( path = ("{id}"))
	public void deleteById(@PathVariable ("id") String id) {
		repo.deleteById(id);
	}
	
	@PostMapping
	public Quota addQuota(@RequestBody Quota obj) {
		return repo.save(obj);
	}

}
