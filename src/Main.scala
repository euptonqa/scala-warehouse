/**
  * Created by emma on 24/06/2016.
  */
import scala.collection.mutable.Queue

object Main {
  def main(args: Array[String]): Unit ={
    println("Current orders \n --------------- \n")
    printOrders(Order.orders)
    println("Specify option: ")
    println("1. Get information on product (type product ID): ")
    println("2. Get information on worker (type worker ID): ")
    println("3. Get an updated list of orders: ")
    println("4. Create a new order")
    println("5. View stock orders")
    println("6. Exit")
  }
  def printOrders(orders:Queue[OrderDescription]): Unit ={
    if(orders.isEmpty){
      return
    }
    val orderHead = orders.head
    printOrder(orderHead)
    val orderTail = orders.tail
    printOrders(orderTail)
  }
  def printOrder(orderDesc:OrderDescription): Unit ={
    print(orderDesc)
  }

}
