package br.com.mouthcalc.mounthcalc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mouthcalc.mounthcalc.app.models.Month;
import org.springframework.stereotype.Repository;


@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {}