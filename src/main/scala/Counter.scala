import scala.beans.BeanProperty

/**
  * Created by hongpf on 16/11/18.
  */
class Counter {

  @BeanProperty  var value = 0  ;
  private var name = ""

  def increment(){value += 1}
  def current  =  {value}
  def isLess (other:Counter) = value < other.value
  def this (name:String ) {
    this()
    this.name = name
  }

  def this (name :String ,value : Int ){
    this(name)
    this.value = value ;
  }
}

object Counter {
  def isLess(c1:Counter,c2:Counter):Boolean =  {c1.value < c2.value}
}

class Person {

  private var page = 0 ;
  def age = page ;
  def age_= (in : Int ){
    if(in > age ) page = in  ;
  }
}