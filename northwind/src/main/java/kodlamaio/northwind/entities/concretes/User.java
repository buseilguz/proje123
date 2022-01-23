package kodlamaio.northwind.entities.concretes;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class User {
	@Column(name="user_surname")
	private String user_surname;
	
	@Column(name="user_password")
	private String user_password;
	
	
	@Column(name="userName")
	private String userName;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	
	
	@Column(name="user_gender")
	private String user_gender;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="favorite_actor_id")
	private int favorite_actor_id;
	

	
	@Column(name="address_id")
	private int address_id;
	
	
	@Column(name="email")
	@javax.validation.constraints.Email
	@NotBlank
	@NotNull
	private String email;
	
	@Column(name="verification")
	private String verification;
	
	
	//@ManyToOne()
	//@JoinColumn(name="actor_id")
	//private Actor actor;
	
	
   //@ManyToOne()
	//@JoinColumn(name="address_id")
	//private Address address;
	
   
   
	//@ManyToOne()
	//@JoinColumn(name="email_id")
	//private Email email;
	
	

}
