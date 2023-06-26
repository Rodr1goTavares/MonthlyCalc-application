package br.com.mouthcalc.mounthcalc.app.controller.error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {

  private static List<String> testsList = new ArrayList<>();
  private static int count;
  
  @GetMapping("/test")
  public String test(Model model) {
    testsList.add((TestController.count++) + "º test");
    model.addAttribute("name", TestController.testsList.toString());
    return "test";
  }

  @GetMapping("/test1")
  public String test1(HttpServletRequest httpServletRequest) {
    httpServletRequest.setAttribute("name", "Rodrigo");
    return "test";
  }

  @GetMapping("/test2")
  public ModelAndView test2() {
    ModelAndView modelAndView = new ModelAndView("test"); // <- Name of the .html file
    modelAndView.addObject("name", "Rodri");
    return modelAndView;
  }

  @GetMapping("test3")
  public String test3() {
    return "test";
  }
}
