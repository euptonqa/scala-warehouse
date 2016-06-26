/**
  * Created by emma on 24/06/2016.
  */
object ProductType extends Enumeration with Entity {
  sealed abstract class ProductDescriptor(val id: Int, val name:String, var stockLevel:Int, val physicalLoc:String) extends EntityDesc{
   override def toString(): String ={
     id + " | " + name + " | " + stockLevel + " | " + physicalLoc
   }
  }
  case object REDGNOME extends ProductDescriptor(1, "red gnome", 2000, "locA")
  case object BLUEGNOME extends ProductDescriptor(2, "blue gnome", 1543, "locB")
  case object PURPLEGNOMELRG extends ProductDescriptor(3, "large purple gnome", 10, "locC")
  case object PURPLEGNOME extends ProductDescriptor(4, "purple gnome", 90, "locA")

  val productTypes = Set(REDGNOME, BLUEGNOME, PURPLEGNOMELRG, PURPLEGNOME)

  def findById(id:Int) = productTypes.find(_.id == id)
  def findByName(name:String) = productTypes.find(_.name == name)
}
