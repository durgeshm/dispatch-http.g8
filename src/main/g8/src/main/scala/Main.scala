package com.example

import dispatch._

object Launcher {

  def main(args: Array[String]){
    val req = :/("checkip.dyndns.org")
    val http = new Http
    println (http x (req as_str))
  }
}
