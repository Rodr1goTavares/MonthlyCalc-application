package br.com.mouthcalc.mounthcalc.app.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Month {
  
  @Setter(AccessLevel.NONE)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String ownerId;

  private String name;

  @OneToMany(mappedBy = "month")
  private List<Cost> costList = new ArrayList<>();

  @OneToMany(mappedBy = "month")
  private List<Profit> profitList = new ArrayList<>();

  public Month() {}

  public Month(String ownerId, String name) {
    this.ownerId = ownerId;
    this.name = name;
  }
  public void addCost(Cost cost) {
    this.costList.add(cost);
  }

  public void removeCost(Cost cost) {
    this.costList.remove(cost);
  }

  public List<Cost> getCostList() {
    return this.costList;
  }

  public void addProfit(Profit profit) {
    this.profitList.add(profit);
  }

  public void removeProfit(Profit profit) {
    this.profitList.remove(profit);
  }

  public List<Profit> getProfitList() {
    return this.profitList;
  }

  public BigDecimal getTotalCosts() {
    BigDecimal totalCosts = BigDecimal.ZERO;
    for (Cost cost : this.costList) {
      totalCosts.add(cost.getValue());
    }
    return totalCosts;
  }

  public BigDecimal getTotalProfit() {
    BigDecimal totalProfit = BigDecimal.ZERO;
    for (Profit profit : this.profitList) {
      totalProfit.add(profit.getValue());
    }
    return totalProfit;
  }

  public BigDecimal getMouthResult() {
    BigDecimal mouthCost = this.getTotalCosts(), mouthProfit = this.getTotalProfit();
    return mouthProfit.subtract(mouthCost);
  }
}
