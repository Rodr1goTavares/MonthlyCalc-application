package br.com.mouthcalc.mounthcalc.app.controller.error;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/error")
public class ExceptionController {
  
  @GetMapping
  public ResponseEntity<String> error() {
    return ResponseEntity.ok().body("Ops, an error has occurred");
  }
}
