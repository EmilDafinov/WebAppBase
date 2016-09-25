package com.emiliorodo.ad.server

import akka.http.scaladsl.server.{Directives, Route}
import com.emiliorodo.ad.AkkaDependenciesModule
import com.emiliorodo.ad.configuration.ApplicationConfigurationModule
import com.emiliorodo.ad.dao.DummyServiceModule

/**
  * @author edafinov
  */
trait HealthRoutes extends Directives {
  this: ApplicationConfigurationModule with AkkaDependenciesModule with DummyServiceModule =>

  lazy val ping: Route =
    (path("ping") & pathEndOrSingleSlash & get) {
      import JsonSupport._
      complete {
        PingResponse()
      }
    }

  lazy val sample: Route =
    (path("sample") & get) {
      complete {
        dummyService.getAkkaWebPageAsString
      }
    }

}

case class PingResponse(message: String = "Pong!")
