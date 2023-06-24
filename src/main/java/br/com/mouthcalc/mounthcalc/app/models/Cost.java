package br.com.mouthcalc.mounthcalc.app.models;

import java.math.BigDecimal;

import br.com.mouthcalc.mounthcalc.app.models.abstracts.Transaction;


public class Cost extends Transaction {

  public Cost() {}

  public Cost(String name, BigDecimal value) {
    this(name, null, value);
  }

  public Cost(String name, String description, BigDecimal value) {
    this.name = name;
    this.description = description;
    this.value = value;
  }
}
