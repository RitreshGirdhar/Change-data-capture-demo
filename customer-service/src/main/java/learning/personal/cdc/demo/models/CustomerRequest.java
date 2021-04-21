package learning.personal.cdc.demo.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@NonNull
public class CustomerRequest {

	private  String name;
	private  String address;
	private  String firstName;
	private  String lastName;
	private  String email;

}
