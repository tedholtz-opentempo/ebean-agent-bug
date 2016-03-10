package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

//@Entity
@Table(name = "users", schema = "public")
//@Inheritance
@DiscriminatorColumn(name = "usertypeid", discriminatorType = DiscriminatorType.INTEGER)
@MappedSuperclass
public abstract class AbstractUser implements Serializable {

	private static final long serialVersionUID = 5569496199004449769L;

	@Id
	@Column(name = "userid")
	private Integer id;

	private Integer userTypeId;

	public Integer getId() { return this.id; }
	public void setId(Integer id) { this.id = id; }
	public Integer getUserTypeId() { return this.userTypeId; }
	public void setUserTypeId(Integer userTypeId) { this.userTypeId = userTypeId; }

}
