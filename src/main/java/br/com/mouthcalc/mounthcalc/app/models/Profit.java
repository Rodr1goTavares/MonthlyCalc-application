package br.com.mouthcalc.mounthcalc.app.models;

import java.math.BigDecimal;

import br.com.mouthcalc.mounthcalc.app.models.abstracts.Transaction;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Setter;

@Entity
public class Profit extends Transaction {

  @Setter(AccessLevel.NONE)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  @ManyToOne
  private Month month;

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
