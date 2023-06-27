package br.com.mouthcalc.mounthcalc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mouthcalc.mounthcalc.app.models.Month;


public interface MonthRepository extends JpaRepository<Month, Long> {}
