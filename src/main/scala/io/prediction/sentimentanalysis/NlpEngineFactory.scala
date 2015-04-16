package io.prediction.sentimentanalysis

import io.prediction.controller.{Engine, EngineFactory, IdentityPreparator}

object NlpEngineFactory extends EngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[IdentityPreparator[TrainingData]],
      Map("algo" -> classOf[Algorithm]),
      classOf[Serving])
  }
}
