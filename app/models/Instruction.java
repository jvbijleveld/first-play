package models;

import javax.persistence.*;

import com.avaje.ebean.Model;

@Entity
@Table(name="instruction")
public class Instruction extends Model{

  @Id
  @Column(name="id", nullable= false)
  public Integer id;

  @ManyToOne
  public Recipe recipe;

  @Column(name="instruction", nullable=false)
  public String instruction;

  @OneToMany
  public Ingredient ingredient;
  
}