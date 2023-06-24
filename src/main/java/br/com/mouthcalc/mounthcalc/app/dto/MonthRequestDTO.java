package br.com.mouthcalc.mounthcalc.app.dto;

import br.com.mouthcalc.mounthcalc.app.models.Month;

public class MonthRequestDTO {
  
  private String name;

  public MonthRequestDTO() {}

  public MonthRequestDTO(String name) {
    this.name = name;
  }

  public Month toMonth() {
    return new Month(this.name);
  }
}
