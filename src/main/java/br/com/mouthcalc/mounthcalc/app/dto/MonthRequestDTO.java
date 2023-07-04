package br.com.mouthcalc.mounthcalc.app.dto;

import br.com.mouthcalc.mounthcalc.app.models.Month;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

public class MonthRequestDTO {
  
  private String name;

  public MonthRequestDTO() {}

  public MonthRequestDTO(String name) {
    this.name = name;
  }

  public Month toMonth(OidcUser principal) {
    String ownerId = principal.getIdToken().getTokenValue();
    return new Month(ownerId, this.name);
  }
}
