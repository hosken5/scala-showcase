import java.util.{Locale, Date}
import java.text.DateFormat._

/**
  * Created by hongpf on 16/11/17.
  */
object FrenchDate {
  def main (args:Array[String]): Unit ={
   val now = new Date
   val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}