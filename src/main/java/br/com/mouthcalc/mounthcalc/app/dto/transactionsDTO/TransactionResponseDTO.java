package br.com.mouthcalc.mounthcalc.app.dto.transactionsDTO;

import java.math.BigDecimal;

import br.com.mouthcalc.mounthcalc.app.models.abstracts.Transaction;

public class TransactionResponseDTO {
  
  private String type;
  private String name;
  private String description;
  private BigDecimal value;

  private TransactionResponseDTO(String type, String name, String description, BigDecimal value) {
    this.type = type;
    this.name = name;
    this.description = description;
    this.value = value;
  }

  public static TransactionResponseDTO toResponseDTO(Transaction transaction) {
    String transactionType = transaction.getClass().toString().toUpperCase();
    String transactionName = transaction.getName();
    String transactionDescription = transaction.getDescription();
    BigDecimal transactionValue = transaction.getValue();
    return new TransactionResponseDTO(transactionType, transactionName, transactionDescription, transactionValue);
  }
}
