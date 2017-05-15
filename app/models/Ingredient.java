package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name="ingredient")
public class Ingredient extends Model {
	
	@Id @GeneratedValue
	//@Column(name="id")
	public Long id;
	
	@ManyToOne
	public Instruction instruction;
	
	@Column(name="name", nullable=false)
	public String name;
	
	@Column(name="ammount")
	public String ammount;
	
}
