
/**
 * Created by hongpf on 16/11/21.
 */

package com {
  package horstman {
    object Utils {
      def percentOf(value : Double , rate :Double ) :Double  = value * rate / 100
    }
    package  impatient {
      class  Employee ( var salary:Double ) {
        def giveRaise (rate : scala.Double)={
          salary += Utils.percentOf(salary , rate ) ;
          println("salary now is :" + salary) ;
        }
      }
    }
  }
}
