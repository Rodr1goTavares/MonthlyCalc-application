package br.com.mouthcalc.mounthcalc.app.dto;

import java.util.List;

import br.com.mouthcalc.mounthcalc.app.models.Cost;
import br.com.mouthcalc.mounthcalc.app.models.Month;
import br.com.mouthcalc.mounthcalc.app.models.Profit;
import lombok.ToString;

@ToString
public class MonthResponseDTO {

  public String name;
  private List<Cost> costLis;
  private List<Profit> prfitList;

  private MonthResponseDTO(String name, List<Cost> costList, List<Profit> profitList) {
    this.name = name;
    this.costLis = costList;
    this.prfitList = profitList;
  }
  
  public static MonthResponseDTO toDTO(Month month) {
    String name = month.getName();
    List<Cost> costList = month.getCostList();
    List<Profit> profitList = month.getProfitList(); 
    return new MonthResponseDTO(name, costList, profitList);
  }
}
