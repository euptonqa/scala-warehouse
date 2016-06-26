/**
  * Created by emma on 24/06/2016.
  */
object Worker extends Enumeration with Entity {
  sealed abstract class WorkerDescriptor(val id: Int, val name:String) extends EntityDesc{
  }

  case object BOB extends WorkerDescriptor(1, "bob")
  case object TYLER extends WorkerDescriptor(2, "tyler")
  case object SHEILA extends WorkerDescriptor(3, "sheila")

  val workers = Set(BOB, TYLER, SHEILA)

  def findById(id:Int) = workers.find(_.id == id)
  def findByName(name:String) = workers.find(_.name == name)

}
