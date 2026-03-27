package in.scalive.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(of = {"name"})
@EqualsAndHashCode(exclude = {"name"})
public class User {

	private int age;
	private String name;
	
}
