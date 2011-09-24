package com.example

import dispatch._

object Launcher {

  def main(args: Array[String]){
    val url = :/("checkip.dyndns.org")
    val http = new Http
    http x (req => req as_str)
  }
}
