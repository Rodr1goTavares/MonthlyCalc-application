package br.com.mouthcalc.mounthcalc.app.models;

import java.math.BigDecimal;

import br.com.mouthcalc.mounthcalc.app.models.abstracts.Transaction;


public class Profit extends Transaction {

  public Profit() {}

  public Profit(String name, BigDecimal value) {
    this(name, null, value);
  }

  public Profit(String name, String description, BigDecimal value) {
    this.name = name;
    this.description = description;
    this.value = value;
  }
}
