package models;

import javax.persistence._
import scala.beans.BeanProperty

@Entity
@Table(name="recipe")
class recipe(recipeName : String){
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name="id", nullable= false)
  @BeanProperty
  var id: Int = _

  @Column(name="name", nullable=false, length=100)
  @BeanProperty
  var name: String = recipeName
  
  @Column(name="description")
  @BeanProperty
  var description: String = _

  @Column(name="owner")
  @BeanProperty
  var owner: String = _   
  
 // @OneToMany(cascade = CascadeType.ALL)
 // var instructions : Instruction = _

}