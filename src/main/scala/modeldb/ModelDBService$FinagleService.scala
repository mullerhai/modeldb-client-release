/**
 * Generated by Scrooge
 *   version: 18.10.0
 *   rev: dda071e1412b53f4bfdebc19e474f584e475d475
 *   built at: 20181018-174244
 */
package modeldb

import com.twitter.finagle.{
  Filter => _,
  Service => finagle$Service,
  thrift => _,
  _
}
import com.twitter.finagle.stats.{NullStatsReceiver, StatsReceiver}
import com.twitter.finagle.thrift.RichServerParam
import com.twitter.io.Buf
import com.twitter.util.Future
import org.apache.thrift.protocol._
import org.apache.thrift.TApplicationException
import org.apache.thrift.transport.TMemoryInputTransport
import scala.collection.mutable.{HashMap => mutable$HashMap}

import scala.language.higherKinds


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
class ModelDBService$FinagleService(
  iface: ModelDBService[Future],
  serverParam: RichServerParam
) extends com.twitter.finagle.Service[Array[Byte], Array[Byte]] {
  import ModelDBService._

  @deprecated("Use com.twitter.finagle.thrift.RichServerParam", "2017-08-16")
  def this(
    iface: ModelDBService[Future],
    protocolFactory: TProtocolFactory,
    stats: StatsReceiver = NullStatsReceiver,
    maxThriftBufferSize: Int = Thrift.param.maxThriftBufferSize,
    serviceName: String = "ModelDBService"
  ) = this(iface, RichServerParam(protocolFactory, serviceName, maxThriftBufferSize, stats))

  @deprecated("Use com.twitter.finagle.thrift.RichServerParam", "2017-08-16")
  def this(
    iface: ModelDBService[Future],
    protocolFactory: TProtocolFactory,
    stats: StatsReceiver,
    maxThriftBufferSize: Int
  ) = this(iface, protocolFactory, stats, maxThriftBufferSize, "ModelDBService")

  @deprecated("Use com.twitter.finagle.thrift.RichServerParam", "2017-08-16")
  def this(
    iface: ModelDBService[Future],
    protocolFactory: TProtocolFactory
  ) = this(iface, protocolFactory, NullStatsReceiver, Thrift.param.maxThriftBufferSize)

  def serviceName: String = serverParam.serviceName
  private[this] val filters = new Filter(serverParam)

  private[this] def protocolFactory: TProtocolFactory = serverParam.restrictedProtocolFactory

  protected val serviceMap = new mutable$HashMap[String, finagle$Service[(TProtocol, Int), Array[Byte]]]()

  protected def addService(name: String, service: finagle$Service[(TProtocol, Int), Array[Byte]]): Unit = {
    serviceMap(name) = service
  }

  final def apply(request: Array[Byte]): Future[Array[Byte]] = {
    val inputTransport = new TMemoryInputTransport(request)
    val iprot = protocolFactory.getProtocol(inputTransport)

    try {
      val msg = iprot.readMessageBegin()
      val service = serviceMap.get(msg.name)
      service match {
        case _root_.scala.Some(svc) =>
          svc(iprot, msg.seqid)
        case _ =>
          TProtocolUtil.skip(iprot, TType.STRUCT)
          Future.value(Buf.ByteArray.Owned.extract(
            filters.exception(msg.name, msg.seqid, TApplicationException.UNKNOWN_METHOD,
              "Invalid method name: '" + msg.name + "'")))
      }
    } catch {
      case e: Exception => Future.exception(e)
    }
  }
  // ---- end boilerplate.

  addService("testConnection", {
    val methodService = new finagle$Service[TestConnection.Args, TestConnection.SuccessType] {
      def apply(args: TestConnection.Args): Future[TestConnection.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("testConnection")
        }
        iface.testConnection()
      }
    }
  
    filters.testConnection.andThen(methodService)
  })
  addService("storeDataFrame", {
    val methodService = new finagle$Service[StoreDataFrame.Args, StoreDataFrame.SuccessType] {
      def apply(args: StoreDataFrame.Args): Future[StoreDataFrame.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeDataFrame")
        }
        iface.storeDataFrame(args.df, args.experimentRunId)
      }
    }
  
    filters.storeDataFrame.andThen(methodService)
  })
  addService("pathForTransformer", {
    val methodService = new finagle$Service[PathForTransformer.Args, PathForTransformer.SuccessType] {
      def apply(args: PathForTransformer.Args): Future[PathForTransformer.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("pathForTransformer")
        }
        iface.pathForTransformer(args.transformerId)
      }
    }
  
    filters.pathForTransformer.andThen(methodService)
  })
  addService("storeFitEvent", {
    val methodService = new finagle$Service[StoreFitEvent.Args, StoreFitEvent.SuccessType] {
      def apply(args: StoreFitEvent.Args): Future[StoreFitEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeFitEvent")
        }
        iface.storeFitEvent(args.fe)
      }
    }
  
    filters.storeFitEvent.andThen(methodService)
  })
  addService("storeMetricEvent", {
    val methodService = new finagle$Service[StoreMetricEvent.Args, StoreMetricEvent.SuccessType] {
      def apply(args: StoreMetricEvent.Args): Future[StoreMetricEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeMetricEvent")
        }
        iface.storeMetricEvent(args.me)
      }
    }
  
    filters.storeMetricEvent.andThen(methodService)
  })
  addService("getFilePath", {
    val methodService = new finagle$Service[GetFilePath.Args, GetFilePath.SuccessType] {
      def apply(args: GetFilePath.Args): Future[GetFilePath.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getFilePath")
        }
        iface.getFilePath(args.t, args.experimentRunId, args.filename)
      }
    }
  
    filters.getFilePath.andThen(methodService)
  })
  addService("storeTransformEvent", {
    val methodService = new finagle$Service[StoreTransformEvent.Args, StoreTransformEvent.SuccessType] {
      def apply(args: StoreTransformEvent.Args): Future[StoreTransformEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeTransformEvent")
        }
        iface.storeTransformEvent(args.te)
      }
    }
  
    filters.storeTransformEvent.andThen(methodService)
  })
  addService("storeRandomSplitEvent", {
    val methodService = new finagle$Service[StoreRandomSplitEvent.Args, StoreRandomSplitEvent.SuccessType] {
      def apply(args: StoreRandomSplitEvent.Args): Future[StoreRandomSplitEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeRandomSplitEvent")
        }
        iface.storeRandomSplitEvent(args.rse)
      }
    }
  
    filters.storeRandomSplitEvent.andThen(methodService)
  })
  addService("storePipelineEvent", {
    val methodService = new finagle$Service[StorePipelineEvent.Args, StorePipelineEvent.SuccessType] {
      def apply(args: StorePipelineEvent.Args): Future[StorePipelineEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storePipelineEvent")
        }
        iface.storePipelineEvent(args.pipelineEvent)
      }
    }
  
    filters.storePipelineEvent.andThen(methodService)
  })
  addService("storeCrossValidationEvent", {
    val methodService = new finagle$Service[StoreCrossValidationEvent.Args, StoreCrossValidationEvent.SuccessType] {
      def apply(args: StoreCrossValidationEvent.Args): Future[StoreCrossValidationEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeCrossValidationEvent")
        }
        iface.storeCrossValidationEvent(args.cve)
      }
    }
  
    filters.storeCrossValidationEvent.andThen(methodService)
  })
  addService("storeGridSearchCrossValidationEvent", {
    val methodService = new finagle$Service[StoreGridSearchCrossValidationEvent.Args, StoreGridSearchCrossValidationEvent.SuccessType] {
      def apply(args: StoreGridSearchCrossValidationEvent.Args): Future[StoreGridSearchCrossValidationEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeGridSearchCrossValidationEvent")
        }
        iface.storeGridSearchCrossValidationEvent(args.gscve)
      }
    }
  
    filters.storeGridSearchCrossValidationEvent.andThen(methodService)
  })
  addService("storeAnnotationEvent", {
    val methodService = new finagle$Service[StoreAnnotationEvent.Args, StoreAnnotationEvent.SuccessType] {
      def apply(args: StoreAnnotationEvent.Args): Future[StoreAnnotationEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeAnnotationEvent")
        }
        iface.storeAnnotationEvent(args.ae)
      }
    }
  
    filters.storeAnnotationEvent.andThen(methodService)
  })
  addService("storeProjectEvent", {
    val methodService = new finagle$Service[StoreProjectEvent.Args, StoreProjectEvent.SuccessType] {
      def apply(args: StoreProjectEvent.Args): Future[StoreProjectEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeProjectEvent")
        }
        iface.storeProjectEvent(args.pr)
      }
    }
  
    filters.storeProjectEvent.andThen(methodService)
  })
  addService("storeExperimentEvent", {
    val methodService = new finagle$Service[StoreExperimentEvent.Args, StoreExperimentEvent.SuccessType] {
      def apply(args: StoreExperimentEvent.Args): Future[StoreExperimentEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeExperimentEvent")
        }
        iface.storeExperimentEvent(args.er)
      }
    }
  
    filters.storeExperimentEvent.andThen(methodService)
  })
  addService("storeExperimentRunEvent", {
    val methodService = new finagle$Service[StoreExperimentRunEvent.Args, StoreExperimentRunEvent.SuccessType] {
      def apply(args: StoreExperimentRunEvent.Args): Future[StoreExperimentRunEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeExperimentRunEvent")
        }
        iface.storeExperimentRunEvent(args.er)
      }
    }
  
    filters.storeExperimentRunEvent.andThen(methodService)
  })
  addService("storeLinearModel", {
    val methodService = new finagle$Service[StoreLinearModel.Args, StoreLinearModel.SuccessType] {
      def apply(args: StoreLinearModel.Args): Future[StoreLinearModel.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeLinearModel")
        }
        iface.storeLinearModel(args.modelId, args.model)
      }
    }
  
    filters.storeLinearModel.andThen(methodService)
  })
  addService("getDataFrameAncestry", {
    val methodService = new finagle$Service[GetDataFrameAncestry.Args, GetDataFrameAncestry.SuccessType] {
      def apply(args: GetDataFrameAncestry.Args): Future[GetDataFrameAncestry.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getDataFrameAncestry")
        }
        iface.getDataFrameAncestry(args.dataFrameId)
      }
    }
  
    filters.getDataFrameAncestry.andThen(methodService)
  })
  addService("getCommonAncestor", {
    val methodService = new finagle$Service[GetCommonAncestor.Args, GetCommonAncestor.SuccessType] {
      def apply(args: GetCommonAncestor.Args): Future[GetCommonAncestor.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getCommonAncestor")
        }
        iface.getCommonAncestor(args.dfId1, args.dfId2)
      }
    }
  
    filters.getCommonAncestor.andThen(methodService)
  })
  addService("getCommonAncestorForModels", {
    val methodService = new finagle$Service[GetCommonAncestorForModels.Args, GetCommonAncestorForModels.SuccessType] {
      def apply(args: GetCommonAncestorForModels.Args): Future[GetCommonAncestorForModels.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getCommonAncestorForModels")
        }
        iface.getCommonAncestorForModels(args.modelId1, args.modelId2)
      }
    }
  
    filters.getCommonAncestorForModels.andThen(methodService)
  })
  addService("getTrainingRowsCount", {
    val methodService = new finagle$Service[GetTrainingRowsCount.Args, GetTrainingRowsCount.SuccessType] {
      def apply(args: GetTrainingRowsCount.Args): Future[GetTrainingRowsCount.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getTrainingRowsCount")
        }
        iface.getTrainingRowsCount(args.modelId)
      }
    }
  
    filters.getTrainingRowsCount.andThen(methodService)
  })
  addService("getTrainingRowsCounts", {
    val methodService = new finagle$Service[GetTrainingRowsCounts.Args, GetTrainingRowsCounts.SuccessType] {
      def apply(args: GetTrainingRowsCounts.Args): Future[GetTrainingRowsCounts.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getTrainingRowsCounts")
        }
        iface.getTrainingRowsCounts(args.modelIds)
      }
    }
  
    filters.getTrainingRowsCounts.andThen(methodService)
  })
  addService("compareHyperparameters", {
    val methodService = new finagle$Service[CompareHyperparameters.Args, CompareHyperparameters.SuccessType] {
      def apply(args: CompareHyperparameters.Args): Future[CompareHyperparameters.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("compareHyperparameters")
        }
        iface.compareHyperparameters(args.modelId1, args.modelId2)
      }
    }
  
    filters.compareHyperparameters.andThen(methodService)
  })
  addService("compareFeatures", {
    val methodService = new finagle$Service[CompareFeatures.Args, CompareFeatures.SuccessType] {
      def apply(args: CompareFeatures.Args): Future[CompareFeatures.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("compareFeatures")
        }
        iface.compareFeatures(args.modelId1, args.modelId2)
      }
    }
  
    filters.compareFeatures.andThen(methodService)
  })
  addService("groupByProblemType", {
    val methodService = new finagle$Service[GroupByProblemType.Args, GroupByProblemType.SuccessType] {
      def apply(args: GroupByProblemType.Args): Future[GroupByProblemType.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("groupByProblemType")
        }
        iface.groupByProblemType(args.modelIds)
      }
    }
  
    filters.groupByProblemType.andThen(methodService)
  })
  addService("similarModels", {
    val methodService = new finagle$Service[SimilarModels.Args, SimilarModels.SuccessType] {
      def apply(args: SimilarModels.Args): Future[SimilarModels.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("similarModels")
        }
        iface.similarModels(args.modelId, args.compMetrics, args.numModels)
      }
    }
  
    filters.similarModels.andThen(methodService)
  })
  addService("linearModelFeatureImportances", {
    val methodService = new finagle$Service[LinearModelFeatureImportances.Args, LinearModelFeatureImportances.SuccessType] {
      def apply(args: LinearModelFeatureImportances.Args): Future[LinearModelFeatureImportances.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("linearModelFeatureImportances")
        }
        iface.linearModelFeatureImportances(args.modelId)
      }
    }
  
    filters.linearModelFeatureImportances.andThen(methodService)
  })
  addService("compareLinearModelFeatureImportances", {
    val methodService = new finagle$Service[CompareLinearModelFeatureImportances.Args, CompareLinearModelFeatureImportances.SuccessType] {
      def apply(args: CompareLinearModelFeatureImportances.Args): Future[CompareLinearModelFeatureImportances.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("compareLinearModelFeatureImportances")
        }
        iface.compareLinearModelFeatureImportances(args.model1Id, args.model2Id)
      }
    }
  
    filters.compareLinearModelFeatureImportances.andThen(methodService)
  })
  addService("iterationsUntilConvergence", {
    val methodService = new finagle$Service[IterationsUntilConvergence.Args, IterationsUntilConvergence.SuccessType] {
      def apply(args: IterationsUntilConvergence.Args): Future[IterationsUntilConvergence.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("iterationsUntilConvergence")
        }
        iface.iterationsUntilConvergence(args.modelIds, args.tolerance)
      }
    }
  
    filters.iterationsUntilConvergence.andThen(methodService)
  })
  addService("rankModels", {
    val methodService = new finagle$Service[RankModels.Args, RankModels.SuccessType] {
      def apply(args: RankModels.Args): Future[RankModels.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("rankModels")
        }
        iface.rankModels(args.modelIds, args.metric)
      }
    }
  
    filters.rankModels.andThen(methodService)
  })
  addService("confidenceIntervals", {
    val methodService = new finagle$Service[ConfidenceIntervals.Args, ConfidenceIntervals.SuccessType] {
      def apply(args: ConfidenceIntervals.Args): Future[ConfidenceIntervals.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("confidenceIntervals")
        }
        iface.confidenceIntervals(args.modelId, args.sigLevel)
      }
    }
  
    filters.confidenceIntervals.andThen(methodService)
  })
  addService("modelsWithFeatures", {
    val methodService = new finagle$Service[ModelsWithFeatures.Args, ModelsWithFeatures.SuccessType] {
      def apply(args: ModelsWithFeatures.Args): Future[ModelsWithFeatures.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("modelsWithFeatures")
        }
        iface.modelsWithFeatures(args.featureNames)
      }
    }
  
    filters.modelsWithFeatures.andThen(methodService)
  })
  addService("modelsDerivedFromDataFrame", {
    val methodService = new finagle$Service[ModelsDerivedFromDataFrame.Args, ModelsDerivedFromDataFrame.SuccessType] {
      def apply(args: ModelsDerivedFromDataFrame.Args): Future[ModelsDerivedFromDataFrame.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("modelsDerivedFromDataFrame")
        }
        iface.modelsDerivedFromDataFrame(args.dfId)
      }
    }
  
    filters.modelsDerivedFromDataFrame.andThen(methodService)
  })
  addService("getProjectIds", {
    val methodService = new finagle$Service[GetProjectIds.Args, GetProjectIds.SuccessType] {
      def apply(args: GetProjectIds.Args): Future[GetProjectIds.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getProjectIds")
        }
        iface.getProjectIds(args.keyValuePairs)
      }
    }
  
    filters.getProjectIds.andThen(methodService)
  })
  addService("getModelIds", {
    val methodService = new finagle$Service[GetModelIds.Args, GetModelIds.SuccessType] {
      def apply(args: GetModelIds.Args): Future[GetModelIds.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getModelIds")
        }
        iface.getModelIds(args.keyValuePairs)
      }
    }
  
    filters.getModelIds.andThen(methodService)
  })
  addService("updateProject", {
    val methodService = new finagle$Service[UpdateProject.Args, UpdateProject.SuccessType] {
      def apply(args: UpdateProject.Args): Future[UpdateProject.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("updateProject")
        }
        iface.updateProject(args.projectId, args.key, args.value)
      }
    }
  
    filters.updateProject.andThen(methodService)
  })
  addService("createOrUpdateScalarField", {
    val methodService = new finagle$Service[CreateOrUpdateScalarField.Args, CreateOrUpdateScalarField.SuccessType] {
      def apply(args: CreateOrUpdateScalarField.Args): Future[CreateOrUpdateScalarField.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("createOrUpdateScalarField")
        }
        iface.createOrUpdateScalarField(args.modelId, args.key, args.value, args.valueType)
      }
    }
  
    filters.createOrUpdateScalarField.andThen(methodService)
  })
  addService("createVectorField", {
    val methodService = new finagle$Service[CreateVectorField.Args, CreateVectorField.SuccessType] {
      def apply(args: CreateVectorField.Args): Future[CreateVectorField.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("createVectorField")
        }
        iface.createVectorField(args.modelId, args.vectorName, args.vectorConfig)
      }
    }
  
    filters.createVectorField.andThen(methodService)
  })
  addService("updateVectorField", {
    val methodService = new finagle$Service[UpdateVectorField.Args, UpdateVectorField.SuccessType] {
      def apply(args: UpdateVectorField.Args): Future[UpdateVectorField.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("updateVectorField")
        }
        iface.updateVectorField(args.modelId, args.key, args.valueIndex, args.value, args.valueType)
      }
    }
  
    filters.updateVectorField.andThen(methodService)
  })
  addService("appendToVectorField", {
    val methodService = new finagle$Service[AppendToVectorField.Args, AppendToVectorField.SuccessType] {
      def apply(args: AppendToVectorField.Args): Future[AppendToVectorField.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("appendToVectorField")
        }
        iface.appendToVectorField(args.modelId, args.vectorName, args.value, args.valueType)
      }
    }
  
    filters.appendToVectorField.andThen(methodService)
  })
  addService("getModel", {
    val methodService = new finagle$Service[GetModel.Args, GetModel.SuccessType] {
      def apply(args: GetModel.Args): Future[GetModel.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getModel")
        }
        iface.getModel(args.modelId)
      }
    }
  
    filters.getModel.andThen(methodService)
  })
  addService("getRunsInExperiment", {
    val methodService = new finagle$Service[GetRunsInExperiment.Args, GetRunsInExperiment.SuccessType] {
      def apply(args: GetRunsInExperiment.Args): Future[GetRunsInExperiment.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getRunsInExperiment")
        }
        iface.getRunsInExperiment(args.experimentId)
      }
    }
  
    filters.getRunsInExperiment.andThen(methodService)
  })
  addService("getRunsAndExperimentsInProject", {
    val methodService = new finagle$Service[GetRunsAndExperimentsInProject.Args, GetRunsAndExperimentsInProject.SuccessType] {
      def apply(args: GetRunsAndExperimentsInProject.Args): Future[GetRunsAndExperimentsInProject.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getRunsAndExperimentsInProject")
        }
        iface.getRunsAndExperimentsInProject(args.projId)
      }
    }
  
    filters.getRunsAndExperimentsInProject.andThen(methodService)
  })
  addService("getProjectOverviews", {
    val methodService = new finagle$Service[GetProjectOverviews.Args, GetProjectOverviews.SuccessType] {
      def apply(args: GetProjectOverviews.Args): Future[GetProjectOverviews.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getProjectOverviews")
        }
        iface.getProjectOverviews()
      }
    }
  
    filters.getProjectOverviews.andThen(methodService)
  })
  addService("getExperimentRunDetails", {
    val methodService = new finagle$Service[GetExperimentRunDetails.Args, GetExperimentRunDetails.SuccessType] {
      def apply(args: GetExperimentRunDetails.Args): Future[GetExperimentRunDetails.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("getExperimentRunDetails")
        }
        iface.getExperimentRunDetails(args.experimentRunId)
      }
    }
  
    filters.getExperimentRunDetails.andThen(methodService)
  })
  addService("originalFeatures", {
    val methodService = new finagle$Service[OriginalFeatures.Args, OriginalFeatures.SuccessType] {
      def apply(args: OriginalFeatures.Args): Future[OriginalFeatures.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("originalFeatures")
        }
        iface.originalFeatures(args.modelId)
      }
    }
  
    filters.originalFeatures.andThen(methodService)
  })
  addService("storeTreeModel", {
    val methodService = new finagle$Service[StoreTreeModel.Args, StoreTreeModel.SuccessType] {
      def apply(args: StoreTreeModel.Args): Future[StoreTreeModel.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storeTreeModel")
        }
        iface.storeTreeModel(args.modelId, args.model)
      }
    }
  
    filters.storeTreeModel.andThen(methodService)
  })
  addService("storePipelineTransformEvent", {
    val methodService = new finagle$Service[StorePipelineTransformEvent.Args, StorePipelineTransformEvent.SuccessType] {
      def apply(args: StorePipelineTransformEvent.Args): Future[StorePipelineTransformEvent.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("storePipelineTransformEvent")
        }
        iface.storePipelineTransformEvent(args.te)
      }
    }
  
    filters.storePipelineTransformEvent.andThen(methodService)
  })
  addService("computeModelAncestry", {
    val methodService = new finagle$Service[ComputeModelAncestry.Args, ComputeModelAncestry.SuccessType] {
      def apply(args: ComputeModelAncestry.Args): Future[ComputeModelAncestry.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("computeModelAncestry")
        }
        iface.computeModelAncestry(args.modelId)
      }
    }
  
    filters.computeModelAncestry.andThen(methodService)
  })
  addService("extractPipeline", {
    val methodService = new finagle$Service[ExtractPipeline.Args, ExtractPipeline.SuccessType] {
      def apply(args: ExtractPipeline.Args): Future[ExtractPipeline.SuccessType] = {
        if (_root_.com.twitter.finagle.tracing.Trace.isActivelyTracing) {
          _root_.com.twitter.finagle.tracing.Trace.recordRpc("extractPipeline")
        }
        iface.extractPipeline(args.modelId)
      }
    }
  
    filters.extractPipeline.andThen(methodService)
  })
}