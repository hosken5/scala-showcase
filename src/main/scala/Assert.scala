/**
  * Created by hongpf on 16/11/17.
  */
package com {
  object Assert {
    def myAssert (pred:()=>Boolean): Unit ={
      if (!pred()) throw new AssertionError()
    }
    def main(args:Array[String]) = myAssert(()=>5<3)
  }
}