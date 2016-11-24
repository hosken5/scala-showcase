/**
  * Created by hongpf on 16/11/23.
  */
package yimei

trait Logged {
  def log(msg:String ): Unit
}

trait ConsoleLogged extends Logged {
  override def log(msg:String ): Unit ={
    println("console:"+msg)
  }
}

trait LoggedException extends  Logged {
  this: {def getMessage():String } =>
  def log() {log(getMessage)}
}

class Self_type{
  def getMessage() = "Self_type"
}

object  Self_type_test {
  def main(arg:Array[String ]): Unit ={
   val st =   new  Self_type() with ConsoleLogged  with LoggedException
    st.log ;
  }
}
