/**
  * Created by hongpf on 16/11/21.
  */
package  com.yimei

import java.io.PrintWriter
import java.util.Date
import javax.swing.JFrame


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
  override def log (msg:String){ super.log(msg);println(msg)}
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

trait FileLogger extends Logged {
  val filename :String ;
  val out =  new PrintWriter(filename) ;
  out.println("#"+new Date().toString)
  override def log (msg:String ): Unit ={
    super.log(msg);
    out.println(msg);
    out.flush() ;
  }
}

trait LoggedException extends Exception with  Logged {
  def log(){log(getMessage)}
}

trait LoggedException1 extends  Logged {
  this:Exception =>
  def log() {log(getMessage)}
}





//
//class  UnHappyException (override  val desc:String ,override  val price :Double ) extends Item(desc,price ) with  LoggedException {
// override  def getMessage() = "arggh!"
//}


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



class Self_type{
  def getMessage() = "Self_type"
}

object ExtendsScala{
  def main(args : Array[ String ]): Unit ={
//    val item  =  new {
//        val filename = "console.log "
//        val maxLength:Int = 11
//      }
//      with Item("desc",13.22)
//      with FileLogger
//      with Consolelogger
//      with ShortLogger{
//    }
//    item.hello()
//    new UnHappyException("1",1.1);

//    new JFrame() with LoggedException ;

//    new  Self_type  with LoggedException1 ;
//    new  Self_type  with LoggedException2 ;

  }
}