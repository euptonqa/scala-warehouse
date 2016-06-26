import com.intellij.util.containers.OrderedSet

import scala.collection.mutable.Queue

/**
  * Created by emma on 24/06/2016.
  */
case class OrderDescription(id:Int, productInt:Int, worker:Int, orderFulfillment:Boolean, porusNeeded:Boolean) extends EntityDesc{
  override def toString():String ="ID: " + id + " | Product ID: " + productInt +
                    "  | Worker ID: " + worker + " | Order Fulfilment: " +
                    orderFulfillment + " | Porus Needed: " + porusNeeded + "\n"
}

object Order extends Entity {
  var currIdVal = 3
  val orders = Queue[OrderDescription](OrderDescription(1, 1, 1, true, true),
                    OrderDescription(1, 2, 3, true, true),
                    OrderDescription(3, 3, 1, true, true))
  val request = Queue[String]("Please enter a product ID", "Please enter a worker ID",
                              "Has the order been fulfilled? (true/false)", "Is porus needed?(true/false)")
  def create(userInput:Queue[String]): OrderDescription ={
    val newId = currIdVal + 1
    val productId = userInput(0).toInt
    val workerId = userInput(1).toInt
    val orderFulfilment = userInput(2).toBoolean
    val porusNeeded = userInput(3).toBoolean
    val order = new OrderDescription(newId, productId, workerId, orderFulfilment, porusNeeded)
    orders.+=(order) //not sure if this is the right operared, might wipe out orders
    currIdVal = currIdVal + 1
    return order
  }
  def findById(id:Int) = orders.find(_.id == id)
  def findByWorker(worker:Int) = orders.find(_.worker == worker)

}
