/**
  * Created by hongpf on 16/11/21.
  */
import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name:String ){
    val contacts = new ArrayBuffer[Network#Member]
  }

  private val members = new ArrayBuffer[Member]
  def join (name:String ) = {
    val m =  new Member(name)
    members += m
    m
  }
}
