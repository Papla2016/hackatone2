package com.dreamsquad.DreamSquadApi.service;


import com.dreamsquad.DreamSquadApi.model.Sale;
import com.dreamsquad.DreamSquadApi.persistence.SaleDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleDB repository;

    public List<Sale> getAllSales() {
        return  repository.findAll();
    }

    public Optional<Sale> getSaleById(Long id) {
        return repository.findById(id);
    }

    public Sale addSale(Sale sale) {
        return repository.save(sale);
    }
}
