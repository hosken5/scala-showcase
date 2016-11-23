/**
  * Created by hongpf on 16/11/21.
  */
package  com.yimei

import java.util.Date


class Person (var name :String , var age: Int ) {

  def test : String   ={
    println("Person function:test()");
    "1"
  }

  def test_= (news:String ){

  }

  val  sex :String = "male"
  println("Person -> name:"+name);
  println("Person -> age:"+age);

}


class  Student (name:String , age:Int , major :String )  extends  Person (name , age ) {
  println("Student -> major: " + major)

  override val   test :String = "test";

  override def toString () = {
    "override method"
  }
  override val sex:String = "femal"

}

abstract   class Person1 (val name:String ){
  def id:Int
}
class Employee (name:String)  extends Person1 (name){
  def id():Int = {
    1
  }
}

class Creature {
  val range:Int = 10 ;
  val env:Array[Int] = new  Array[Int](range)
}

class Ant extends  {
  override  val range = 2 ;
} with Creature

trait Logged {
  def log(msg:String ) {}
}

trait Consolelogger  extends  Logged {
  override def log (msg:String){println(msg)}
}

trait TimestampLogger extends  Logged {
  override  def log(msg:String ){
    super.log(new Date()+" "+msg)
  }
}

trait ShortLogger extends  Logged {
  val maxLength :Int

  override def log(msg:String ){
    super.log(
      if(msg.length <= maxLength){
        msg
      }else msg.substring(0,maxLength-3)+"..."
    )
  }
}
class Item (val desc :String , val price :Double ) extends  Logged{
//  log("object created")
  def hello (): Unit ={
    log("descsdfasfasfasfsafsdfsdfasfsafsfsdfsdfs:"+desc+"price:"+price)
  }
  override def equals (other :Any): Boolean ={
    val that  = other.asInstanceOf[Item]
    if(that == null ) false
    else
      desc == that.desc && price == that.price
  }
}

object ExtendsScala{
  def main(args : Array[ String ]): Unit ={
    val item  =  new Item("desc",13.22) with Consolelogger with ShortLogger{
      val maxLength:Int = 11 ;
    }
    item.hello()
    val item1  =  new Item("desc",13.2) with ShortLogger with Consolelogger{
      val maxLength:Int = 6 ;
    }
  }
}




