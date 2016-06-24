import com.intellij.util.containers.OrderedSet

import scala.collection.mutable.Queue

/**
  * Created by emma on 24/06/2016.
  */
case class OrderDescription(id:Int, productInt:Int, worker:Int, orderFulfillment:Boolean, porusNeeded:Boolean){
  override def toString():String ="ID: " + id + " | Product ID: " + productInt +
                    "  | Worker ID: " + worker + " | Order Fulfilment: " +
                    orderFulfillment + " | Porus Needed: " + porusNeeded + "\n"
}

object Order {
  val orders = Queue(OrderDescription(1, 1, 1, true, true),
                    OrderDescription(1, 2, 3, true, true),
                    OrderDescription(1, 3, 1, true, true))
  def findById(id:Int) = orders.find(_.id == id)
  def findByWorker(worker:Int) = orders.find(_.worker == worker)

}
