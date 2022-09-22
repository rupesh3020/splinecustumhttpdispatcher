
package org.abnamro.dmp.mdc.splinecustomhttpdispatcher

import za.co.absa.spline.harvester.dispatcher.HttpLineageDispatcher
import za.co.absa.spline.harvester.dispatcher.httpdispatcher._

import za.co.absa.spline.producer.model.v1_1.{ExecutionEvent, ExecutionPlan}

class AzureHttpLineageDispatcher(override val restClient: AzureRestClient,override val apiVersionOption: Option[Version],override val requestCompressionOption: Option[Boolean])
extends HttpLineageDispatcher(restClient, apiVersionOption, requestCompressionOption) {
  
  

}