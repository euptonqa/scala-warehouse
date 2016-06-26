import scala.collection.mutable

/**
  * Created by emma on 24/06/2016.
  */
case class ProductDescription(id:Int, productType: Int, allocatedToOrder: Boolean) extends EntityDesc{
  override def toString(): String ={
    id + " | " + productType + " | " + false
  }
}

object Product extends Entity {
  val products = mutable.Queue(ProductDescription(1, 1, false),
    ProductDescription(2, 1, false))

  def findById(id:Int) = products.find(_.id == id)
  def findByName(productType:Int) = products.find(_.productType == productType)

}
