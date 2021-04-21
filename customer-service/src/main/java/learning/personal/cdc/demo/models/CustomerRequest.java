package learning.personal.cdc.demo.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@NonNull
@Setter
@Getter
public class CustomerRequest {

	private  String firstName;
	private  String lastName;
	private  String email;

}
