package models

import javax.persistence._
import scala.beans.BeanProperty

@Entity
@Table(name="instruction")
class Instruction(instructionDesc : String){

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name="id", nullable= false)
  @BeanProperty
  var id: Int = _

  //@ManyToOne
  //var recipe: Recipe

  @Column(name="instruction", nullable=false)
  @BeanProperty
  var instruction: String = instructionDesc


}