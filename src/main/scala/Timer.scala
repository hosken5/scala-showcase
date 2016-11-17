/**
  * Created by hongpf on 16/11/17.
  */
object Timer {
  def oncePerSeconds(callback:()=>Unit): Unit ={
    while (true ) {callback();Thread sleep(1000)}
  }
  def timeFiles(): Unit ={
    println("time files like  an arrow ");
  }
  def main(args:Array[String]): Unit ={
    oncePerSeconds(timeFiles)
  }
}