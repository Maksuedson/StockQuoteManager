package br.com.maksuedson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maksuedson.entity.Quota;

public interface QuotaRepository extends JpaRepository<Quota, String>{

}
