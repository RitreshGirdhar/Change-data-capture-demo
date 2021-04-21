package learning.personal.cdc.demo.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CustomerResponse {
    private Long id;
    private String firstName;

}
