package models;

import javax.persistence.*;

import com.avaje.ebean.Model;

@Entity
@Table(name="instruction")
public class Instruction extends Model{

  @Id @GeneratedValue
  //@Column(name="id", nullable= false)
  public Long id;

  @ManyToOne
  public Recipe recipe;

  @Column(name="instruction", nullable=false)
  public String instruction;

  @OneToMany
  public Ingredient ingredient;
  
}