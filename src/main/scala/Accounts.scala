/**
  * Created by hongpf on 16/11/21.
  */

class  Account (var balance:Double) {
 val id = Account.newUniqueNumber();
//  private  def balance  = 0.0 ;
  def deposit(amount :Double ): Unit ={
    balance +=  amount ;
  }
}


object Account {
  def apply(balance :Double ) = {
    new Account (balance = balance);
  }
  private var lastNumber =  0  ;
  private def newUniqueNumber () = { lastNumber +=1 ; lastNumber }

}

