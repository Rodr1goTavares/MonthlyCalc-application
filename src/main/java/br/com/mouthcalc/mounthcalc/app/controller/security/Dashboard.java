package br.com.mouthcalc.mounthcalc.app.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dashboard")
public class Dashboard {

  @Autowired
  private ResourceLoader resourceLoader;
  
  @GetMapping
  public ResponseEntity<Resource> homePage() {
    Resource resource = this.resourceLoader.getResource("classpath:static/dashboard/index.html");
    return ResponseEntity.ok().body(resource);
  }
}
