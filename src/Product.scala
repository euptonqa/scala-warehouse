import scala.collection.mutable

/**
  * Created by emma on 24/06/2016.
  */
case class ProductDescription(id:Int, productType: Int){
}

object Product {
  val products = mutable.Queue(ProductDescription(1, 1),
    ProductDescription(2, 1))

}
