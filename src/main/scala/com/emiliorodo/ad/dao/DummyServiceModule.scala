package com.emiliorodo.ad.dao

import com.emiliorodo.ad.AkkaDependenciesModule

trait DummyServiceModule {
  this: AkkaDependenciesModule =>
  lazy val dummyService  = new DummyService
}
