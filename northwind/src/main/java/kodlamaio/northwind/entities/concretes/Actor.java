package kodlamaio.northwind.entities.concretes;

import java.util.Date;
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
@Table(name="actors")
public class Actor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="actor_id")
	private int actor_id;
	
	
	@Column(name="actor_birthday")
	private Date actor_birthday;
	
	@Column(name="how_many_likes")
	private int how_many_likes;
	
	
	@Column(name="actor_name")
	private String actor_name;
	
	
	@Column(name="actor_surname")
	private String actor_surname;
	
	//@OneToMany(mappedBy="actor")
	//private List<User> users;
	

}
