package br.com.mouthcalc.mounthcalc.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {

  @Autowired
  private ResourceLoader resourceLoader;

  @GetMapping
  public ResponseEntity<Resource> homePage() {
    Resource resource = this.resourceLoader.getResource("classpath:static/landing.html");
    return ResponseEntity.ok().body(resource);
  }
}
