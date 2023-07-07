package br.com.mouthcalc.mounthcalc.app.controller.security;

import br.com.mouthcalc.mounthcalc.app.dto.MonthRequestDTO;
import br.com.mouthcalc.mounthcalc.app.services.MonthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.*;

import br.com.mouthcalc.mounthcalc.app.dto.MonthResponseDTO;
import br.com.mouthcalc.mounthcalc.app.models.Month;

import java.util.List;

@RestController
@RequestMapping("/month")
public class MonthController {

  private MonthService monthService = new MonthService();

  @GetMapping
  public ResponseEntity<List<Month>> getMonth(@AuthenticationPrincipal OidcUser principal) {
    return new ResponseEntity<>(this.monthService.getAllUserMonths(principal), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<MonthResponseDTO> postMonth(@RequestParam MonthRequestDTO monthRequestDTO, @AuthenticationPrincipal OidcUser principal) {
    Month recivedMonth = monthRequestDTO.toMonth(principal);
    monthService.saveMonth(recivedMonth);
    return new ResponseEntity<>(MonthResponseDTO.toDTO(recivedMonth), HttpStatus.CREATED);
  }
}
