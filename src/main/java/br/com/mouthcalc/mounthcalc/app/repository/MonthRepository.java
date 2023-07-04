package br.com.mouthcalc.mounthcalc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mouthcalc.mounthcalc.app.models.Month;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {
    List<Month> findByOwnerId(String ownerId);
}