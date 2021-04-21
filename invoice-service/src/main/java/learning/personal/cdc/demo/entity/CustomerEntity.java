package learning.personal.cdc.demo.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {

    private  String name;
    private  String address;
    private  String firstName;
    private  String lastName;

    @Id
    private  String email;

}
