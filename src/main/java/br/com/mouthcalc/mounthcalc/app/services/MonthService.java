package br.com.mouthcalc.mounthcalc.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.mouthcalc.mounthcalc.app.models.Month;
import br.com.mouthcalc.mounthcalc.app.repository.MonthRepository;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

import java.util.List;

public class MonthService {

  @Autowired
  private MonthRepository monthRepository;

  public void saveMonth(Month month) {

    this.monthRepository.save(month);
  }
  public void removeMonth(Month month) {
    this.monthRepository.delete(month);
  }

  public void deleteMonthById(Long id) {
    this.monthRepository.deleteById(id);
  }

  public Month getMonthById(Long id) {
    return this.monthRepository.getReferenceById(id);
  }

  public List<Month> getAllUserMonths(OidcUser user) {
    return monthRepository.findByOwnerId(user.getIdToken().getTokenValue());
  }

  public List<Month> getAllMonths() {
    return monthRepository.findAll();
  }
}
