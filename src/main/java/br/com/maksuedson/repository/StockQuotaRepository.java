package br.com.maksuedson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maksuedson.entity.StockQuota;

public interface StockQuotaRepository extends JpaRepository<StockQuota, String>{

}
