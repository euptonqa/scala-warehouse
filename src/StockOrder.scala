import scala.collection.mutable

/**
  * Created by emma on 24/06/2016.
  */
case class StockOrderDesc(id:Int, productType: Int, allocatedToOrder: Boolean) extends EntityDesc{
  override def toString(): String ={
    id + " | " + productType + " | " + false
  }
}

object StockOrder extends Entity {
  val stockorders = mutable.Queue(StockOrderDesc(1, 1, false),
    StockOrderDesc(2, 1, false))

  def findById(id:Int) = stockorders.find(_.id == id)
  def findByName(productType:Int) = stockorders.find(_.productType == productType)

}