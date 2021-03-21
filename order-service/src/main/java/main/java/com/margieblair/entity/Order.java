package main.java.com.margieblair.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TB")
@Data //shortcut annotation to bundle, @Getter,@Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor
@AllArgsConstructor //AllArgsConstructor is used to generate a parameterized constructor which accepts a single parameter for each field, and initializes them.
@NoArgsConstructor //NoArgsConstructor is used to generate a constructor with no arguments. It has an empty body and does nothing
public class Order {

    @Id
    private int id;
    private String name;
    private int qty;
    private double price;
}
