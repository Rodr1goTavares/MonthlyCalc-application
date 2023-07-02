package br.com.mouthcalc.mounthcalc.app.controller.security;

import br.com.mouthcalc.mounthcalc.app.services.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Dashboard {

  private MonthService monthService = new MonthService();

  @GetMapping
  public String homePage(Model model) {
    model.addAttribute("months", monthService.getAllMonths().toString());
    return "dashboard";
  }
}
