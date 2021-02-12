package learning.personal.cdc.demo.models;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@NonNull
public class CustomerResponse {

    private  String name;
    private  String address;
    private  String id;
}
