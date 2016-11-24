package yimei

import scala.io.StdIn

/**
  * Created by hongpf on 16/11/24.
  */
class Fraction {
  var n :Int = 0
  var d :Int = 0
  def * (b:Fraction) = Fraction(n * b.n,d*b.d)
  def + (b:Fraction):Fraction={
      var lcm = Fraction.lowestCommonMultiple(d,b.d) ;
      var nn = n* lcm/d + b.n*lcm/b.d ;
      if(lcm%nn ==0) {lcm = 1 ; nn =1 }
      else {
        val  gcd = Fraction.greatestCommonDivisor(nn,lcm) ;
        if(gcd!=1){
          lcm = lcm /gcd ;
          nn = nn /gcd  ;
        }
      }
      Fraction(nn,lcm)
  }
  def this (n:Int,d:Int){
    this()
    val temp =  Fraction.greatestCommonDivisor(n,d);
    this.n=n/temp  ;
    this.d=d/temp ;
  }
  override def toString():String={
      "("+n+"/"+d+")"
  }
}
object Fraction {
  def apply(n:Int , d :Int ):Fraction = {
    new Fraction(n,d)
  }

  def lowestCommonMultiple(m:Int , n :Int):Int=   m*n/greatestCommonDivisor(m,n)

  def greatestCommonDivisor(m:Int, n:Int):Int = {
    var a = m ;
    var b = n ;
    if(a<b ){val temp = a ;a=b ; b=temp }
    if(a%b ==0){return  b}
    else {
      while (a%b!=0){
        val temp = a%b
        a = b  ;
        b = temp
      }
      return b
    }
  }

  def test (): Unit ={
    println("请输入第一个数:");
    val a = StdIn.readInt()
    println("请输入第二个数:");
    val b = StdIn.readInt()
    println("最大公约数是:\n"+greatestCommonDivisor(a,b));
  }

  def main(arg:Array[String]): Unit ={
    println(Fraction(3,9))
  }
}
