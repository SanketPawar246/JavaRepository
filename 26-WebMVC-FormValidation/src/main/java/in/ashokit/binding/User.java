package in.ashokit.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {

	@NotEmpty(message = "Uname is required")

	private String uname;

	@NotEmpty(message = "Password is required")
	private String pwd;

	@NotEmpty(message = "email is required")
	@Email(message = "Enter valid email id")
	private String email;

	@NotEmpty(message = "phno is required")
	private String phno;

	@NotNull(message = "age is required")
	@Min(value = 0, message = "age should be not more than 0")
	@Max(value = 100, message = "age should be not more than 100")

	private Integer age;

}
