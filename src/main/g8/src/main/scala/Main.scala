package com.example

import dispatch._

object Launcher {

  def main(args: Array[String]){
    val http = new Http
    http(url("http://checkip.dyndns.org") >>> System.out)
    http.shutdown

//    or alternatively,
//    val output = Http(url("http://checkip.dyndns.org") as_str).toString
  }
}
