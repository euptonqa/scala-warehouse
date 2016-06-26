import scala.collection.mutable

/**
  * Created by emma on 26/06/2016.
  */
trait Entity {
  def findById(id: Int): Option[EntityDesc]
}
