package br.com.mouthcalc.mounthcalc.app.models.abstracts;

import java.math.BigDecimal;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Transaction {
  
  @Setter(AccessLevel.NONE)
  protected Long id;
  protected String name;
  protected String description;
  protected BigDecimal value;

  protected Transaction() {}

  protected Transaction(String name, BigDecimal value) {}

  protected Transaction(String name, String description, BigDecimal value) {}
}
