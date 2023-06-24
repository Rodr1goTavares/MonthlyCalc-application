package br.com.mouthcalc.mounthcalc.app.dto.transactionsDTO;

import java.math.BigDecimal;

import br.com.mouthcalc.mounthcalc.app.exceptions.InvalidTypeException;
import br.com.mouthcalc.mounthcalc.app.models.Cost;
import br.com.mouthcalc.mounthcalc.app.models.Profit;
import br.com.mouthcalc.mounthcalc.app.models.abstracts.Transaction;
import lombok.ToString;

@ToString
public class TransactionRequestDTO {

  private TransactionType type;
  private String name;
  private String description;
  private BigDecimal value;

  public TransactionRequestDTO() {}

  public TransactionRequestDTO(String type, String name, String description, BigDecimal value) throws IllegalArgumentException {
    this.type = TransactionType.valueOf(type);
    this.name = name;
    this.description = description;
    this.value = value;
  }

  public Transaction getTransaction() throws InvalidTypeException {
    return switch (this.type) {
      case PROFIT -> new Profit();
      case COST -> new Cost();
      default -> throw new InvalidTypeException("Invalid type for Transaction: " + this.type);
    }; 
  }
}
