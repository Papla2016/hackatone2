package com.dreamsquad.DreamSquadApi.persistence;

import com.dreamsquad.DreamSquadApi.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleDB extends JpaRepository<Sale, Long> {
}
