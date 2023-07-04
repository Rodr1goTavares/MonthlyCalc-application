package br.com.mouthcalc.mounthcalc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
  @Autowired
  private ResourceLoader resourceLoader;
  @GetMapping
  public ResponseEntity<String> homePage() {
    return ResponseEntity.ok().body("Hello, this is a MonthCalc api: \ncheck the routes:\n/month (get, post, delete)\n/transaction (get, post, delete)");
  }
}
