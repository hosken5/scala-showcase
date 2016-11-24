package yimei

import java.io.{File, PrintWriter}
import java.nio.file.Files
import scala.io.{StdIn, Source}
/**
  * Created by hongpf on 16/11/23.
  */
class FileReadExample {
}

object FileReadExample {
  def main (args:Array[String]): Unit ={
//    writeFile()
//    readFile()
//    readInput
//    processControl()
    regExample()
  }

  def readFile (): Unit ={
    val source =  Source.fromFile("scala-showcase.iml")
    val lineIterator =  source.getLines
    for (l <- lineIterator ) println(l)
    source.close
  }

  def writeFile (): Unit ={
    val out = new PrintWriter("hello.txt")
//    for(i <- 1 to 100 ) out.println(i)
//    for(i <- 1 to 100 ) out.printf("%6d %10.2f \n",11.asInstanceOf[AnyRef],32.2.asInstanceOf[AnyRef])
    for(i <- 1 to 100 ) out.print("%6d %10.2f \n".format(11,32.2))
    out.close()
  }


  def readInput () : Unit = {
    print("How old are you ?\n")
    val age = StdIn.readInt()
    println("you age is :" + age)
  }
  def processControl(): Unit ={
//    Files.walkFileTree()
    import  sys.process._
//    println("ls -al ..",,!!)
    val f =  new File("output.txt") ;
    "ls -al .." #> f!
  }

  def regExample (): Unit ={
    val numPattern = "[0-9]+".r
    val wsnumsPattern = """\s+[0-9]+""".r()
    for(matchString <-numPattern.findAllIn("99 bottles 98 bottles ")){
      println(matchString)
    }
  }
}
