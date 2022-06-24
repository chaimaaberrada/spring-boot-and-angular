package ma.atos.agency.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Data
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String accountNumber;
    private String fullName;
    private BigDecimal balance;


    @ManyToOne
    Client client;




}
