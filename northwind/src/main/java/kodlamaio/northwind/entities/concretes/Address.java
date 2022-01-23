package kodlamaio.northwind.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="adresses")
public class Address {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="address_id")
	private int address_id;
	
	
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="city")
	private String city;
	
	
	@Column(name="country")
	private String country;
	
	
	
	//@OneToMany(mappedBy="address")
	//private List<User> users;

}