package br.com.mouthcalc.mounthcalc.app.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.mouthcalc.mounthcalc.app.dto.MonthResponseDTO;
import br.com.mouthcalc.mounthcalc.app.models.Month;

@Controller
public class MonthController {

  @GetMapping("/create")
  public ModelAndView createMonth() {
    return new ModelAndView("month_create");
  }

  @PostMapping("/create-month")
  public String postMonth(@RequestParam String name) {
    Month recivedMonth = new Month(name);
    System.out.println("<< Created >>");
    return MonthResponseDTO.toDTO(recivedMonth).toString();
  }
}
