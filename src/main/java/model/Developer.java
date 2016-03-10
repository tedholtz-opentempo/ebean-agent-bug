package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
@DiscriminatorValue("10")
public class Developer extends AbstractUser {
	
	private static final long serialVersionUID = 5569496199004449769L;
	
	private String name;

}
