
package org.abnamro.dmp.mdc.splinecustomhttpdispatcher

import za.co.absa.spline.harvester.dispatcher.LineageDispatcher
import za.co.absa.spline.producer.model.v1_1.{ExecutionEvent, ExecutionPlan}
import za.co.absa.spline.harvester.dispatcher.LineageDispatcher

class AzureHttpLineageDispatcher extends LineageDispatcher {
  

  override def send(plan: ExecutionPlan): Unit = ???

  override def send(event: ExecutionEvent): Unit = ???
}