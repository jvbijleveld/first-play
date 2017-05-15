package models;

import javax.persistence.*;

import com.avaje.ebean.Model;

/**
 * Recipe entity managed by Ebean
 */
@Entity
@Table(name = "recipe")
public class Recipe extends Model{
  
  @Id
  @Column(name="id", nullable= false)
  public Integer id;
  
  @Column(name="name", nullable= false)
  public String name;
  
  @Column(name="description")
  public String description;

  @Column(name="owner", length=255)
  private String owner;
  
}