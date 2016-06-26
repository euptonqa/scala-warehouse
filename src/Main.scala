/**
  * Created by emma on 24/06/2016.
  */
import scala.collection.mutable.Queue

object Main {
  def main(args: Array[String]): Unit ={
    println("Current orders \n --------------- \n")
    var continue = true;
    while(continue) {
      println("Specify option: ")
      println("1. Get information on product (type product ID): ")
      println("2. Get information on worker (type worker ID): ")
      println("3. Get a list of current orders: ")
      println("4. Create a new order")
      println("5. View stock orders")
      println("6. Create a new stock order")
      println("6. Exit")
      val option = scala.io.StdIn.readInt()
      switchMenu(option)
    }
  }

  def switchMenu(option: Int): Unit ={
    option match{
      case(1) => getEntityInfo(Product);
        case(2) => getEntityInfo(Worker);
        case(3) => printQueue(Order.orders)
        case(4) => createEntity(Order)
        case(5) =>
        case(6) => createEntity(StockOrder)
    }

  }

  def createEntity(entity:Entity): OrderDescription = {
    entity match {
      case (Order) => {
        val answers = getInput(Order.request)
        Order.create(answers)
      }
    }
  }

  def getInput(arr:Queue[String]): Queue[String]={
    var receivedInput = Queue[String]()
   for(request <- arr){
     print(request)
     receivedInput+=scala.io.StdIn.readLine()
   }
    return receivedInput
  }

  def getEntityInfo(entity: Entity): Unit ={
    println("Enter ID: ")
    val id = scala.io.StdIn.readInt()
    val desc = entity.findById(id)
    print(desc.toString())
  }

  def printQueue(queue: Queue[_]): Unit={
    if(queue.isEmpty){
      return
    }
    val queueHead = queue.head
    printEntity(queueHead)
    val queueTail = queue.tail
    printQueue(queueTail)

  }

  def printEntity(entity:Any): Unit ={
    print(entity)
  }


}
