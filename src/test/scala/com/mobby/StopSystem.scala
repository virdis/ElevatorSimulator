package com.mobby

import akka.testkit.TestKit
import org.scalatest.{Suite, BeforeAndAfterAll}


trait StopSystem extends BeforeAndAfterAll{

  self: TestKit with Suite =>

  override protected def afterAll(): Unit ={
    super.afterAll()
    system.shutdown()

  }
}
