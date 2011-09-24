package com.example

import dispatch._

object Launcher {

  def main(args: Array[String]){
    val http = new Http
    http(url("http://checkip.dyndns.org") >>> System.out)
  }
}
