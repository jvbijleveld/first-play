package models;

import javax.persistence.*;

import com.avaje.ebean.Model;
import entities.CoursesEnum;

/**
 * Recipe entity managed by Ebean
 */
@Entity
@Table(name = "recipe")
public class Recipe extends Model{
  
  @Id @GeneratedValue
  //@Column(name="id", nullable= false)
  public Long id;
  
  @Column(name="name", nullable= false)
  public String name;
  
  @Column(name="description")
  public String description;

  @Column(name="owner", length=255)
  private String owner;
  
  @Column(name="course")
  private CoursesEnum course;
  
  @OneToMany
  public Instruction instructions;
  
}