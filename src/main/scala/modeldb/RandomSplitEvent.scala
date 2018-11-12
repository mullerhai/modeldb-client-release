/**
 * Generated by Scrooge
 *   version: 18.10.0
 *   rev: dda071e1412b53f4bfdebc19e474f584e475d475
 *   built at: 20181018-174244
 */
package modeldb

import com.twitter.io.Buf
import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport, TIOStreamTransport}
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.concurrent.atomic.AtomicInteger
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object RandomSplitEvent extends ValidatingThriftStructCodec3[RandomSplitEvent] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("RandomSplitEvent")
  val OldDataFrameField: TField = new TField("oldDataFrame", TType.STRUCT, 1)
  val OldDataFrameFieldManifest: Manifest[modeldb.DataFrame] = implicitly[Manifest[modeldb.DataFrame]]
  val WeightsField: TField = new TField("weights", TType.LIST, 2)
  val WeightsFieldManifest: Manifest[Seq[Double]] = implicitly[Manifest[Seq[Double]]]
  val SeedField: TField = new TField("seed", TType.I64, 3)
  val SeedFieldManifest: Manifest[Long] = implicitly[Manifest[Long]]
  val SplitDataFramesField: TField = new TField("splitDataFrames", TType.LIST, 4)
  val SplitDataFramesFieldManifest: Manifest[Seq[modeldb.DataFrame]] = implicitly[Manifest[Seq[modeldb.DataFrame]]]
  val ExperimentRunIdField: TField = new TField("experimentRunId", TType.I32, 5)
  val ExperimentRunIdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      OldDataFrameField,
      false,
      false,
      OldDataFrameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      WeightsField,
      false,
      false,
      WeightsFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[Double]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      SeedField,
      false,
      false,
      SeedFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      SplitDataFramesField,
      false,
      false,
      SplitDataFramesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[modeldb.DataFrame]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ExperimentRunIdField,
      false,
      false,
      ExperimentRunIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: RandomSplitEvent): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: RandomSplitEvent): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.oldDataFrame)
    buf ++= validateField(item.weights)
    buf ++= validateField(item.seed)
    buf ++= validateField(item.splitDataFrames)
    buf ++= validateField(item.experimentRunId)
    buf.toList
  }

  def withoutPassthroughFields(original: RandomSplitEvent): RandomSplitEvent =
    new Immutable(
      oldDataFrame =
        {
          val field = original.oldDataFrame
          modeldb.DataFrame.withoutPassthroughFields(field)
        },
      weights =
        {
          val field = original.weights
          field.map { field =>
            field
          }
        },
      seed =
        {
          val field = original.seed
          field
        },
      splitDataFrames =
        {
          val field = original.splitDataFrames
          field.map { field =>
            modeldb.DataFrame.withoutPassthroughFields(field)
          }
        },
      experimentRunId =
        {
          val field = original.experimentRunId
          field
        }
    )

  override def encode(_item: RandomSplitEvent, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): RandomSplitEvent = {

    var oldDataFrame: modeldb.DataFrame = null
    var weights: Seq[Double] = Seq[Double]()
    var seed: Long = 0L
    var splitDataFrames: Seq[modeldb.DataFrame] = Seq[modeldb.DataFrame]()
    var experimentRunId: Int = 0

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                oldDataFrame = readOldDataFrameValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'oldDataFrame' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
    
                weights = readWeightsValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'weights' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I64 =>
    
                seed = readSeedValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'seed' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.LIST =>
    
                splitDataFrames = readSplitDataFramesValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'splitDataFrames' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
    
                experimentRunId = readExperimentRunIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'experimentRunId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): RandomSplitEvent =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): RandomSplitEvent = {
    var oldDataFrame: modeldb.DataFrame = null
    var weights: Seq[Double] = Seq[Double]()
    var seed: Long = 0L
    var splitDataFrames: Seq[modeldb.DataFrame] = Seq[modeldb.DataFrame]()
    var experimentRunId: Int = 0
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
                oldDataFrame = readOldDataFrameValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'oldDataFrame' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
                weights = readWeightsValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'weights' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I64 =>
                seed = readSeedValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'seed' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.LIST =>
                splitDataFrames = readSplitDataFramesValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'splitDataFrames' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
                experimentRunId = readExperimentRunIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'experimentRunId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    oldDataFrame: modeldb.DataFrame,
    weights: Seq[Double] = Seq[Double](),
    seed: Long,
    splitDataFrames: Seq[modeldb.DataFrame] = Seq[modeldb.DataFrame](),
    experimentRunId: Int
  ): RandomSplitEvent =
    new Immutable(
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId
    )

  def unapply(_item: RandomSplitEvent): _root_.scala.Option[_root_.scala.Tuple5[modeldb.DataFrame, Seq[Double], Long, Seq[modeldb.DataFrame], Int]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readOldDataFrameValue(_iprot: TProtocol): modeldb.DataFrame = {
    modeldb.DataFrame.decode(_iprot)
  }

  @inline private def writeOldDataFrameField(oldDataFrame_item: modeldb.DataFrame, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(OldDataFrameField)
    writeOldDataFrameValue(oldDataFrame_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeOldDataFrameValue(oldDataFrame_item: modeldb.DataFrame, _oprot: TProtocol): Unit = {
    oldDataFrame_item.write(_oprot)
  }

  @inline private[modeldb] def readWeightsValue(_iprot: TProtocol): Seq[Double] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[Double](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          _iprot.readDouble()
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeWeightsField(weights_item: Seq[Double], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(WeightsField)
    writeWeightsValue(weights_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeWeightsValue(weights_item: Seq[Double], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.DOUBLE, weights_item.size))
    weights_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = weights_item.size
        while (_i < _size) {
          val weights_item_element = weights_item(_i)
          _oprot.writeDouble(weights_item_element)
          _i += 1
        }
      case _ =>
        weights_item.foreach { weights_item_element =>
          _oprot.writeDouble(weights_item_element)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[modeldb] def readSeedValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeSeedField(seed_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(SeedField)
    writeSeedValue(seed_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeSeedValue(seed_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(seed_item)
  }

  @inline private[modeldb] def readSplitDataFramesValue(_iprot: TProtocol): Seq[modeldb.DataFrame] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[modeldb.DataFrame](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          modeldb.DataFrame.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeSplitDataFramesField(splitDataFrames_item: Seq[modeldb.DataFrame], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(SplitDataFramesField)
    writeSplitDataFramesValue(splitDataFrames_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeSplitDataFramesValue(splitDataFrames_item: Seq[modeldb.DataFrame], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, splitDataFrames_item.size))
    splitDataFrames_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = splitDataFrames_item.size
        while (_i < _size) {
          val splitDataFrames_item_element = splitDataFrames_item(_i)
          splitDataFrames_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        splitDataFrames_item.foreach { splitDataFrames_item_element =>
          splitDataFrames_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[modeldb] def readExperimentRunIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeExperimentRunIdField(experimentRunId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ExperimentRunIdField)
    writeExperimentRunIdValue(experimentRunId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExperimentRunIdValue(experimentRunId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(experimentRunId_item)
  }


  object Immutable extends ThriftStructCodec3[RandomSplitEvent] {
    override def encode(_item: RandomSplitEvent, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): RandomSplitEvent = RandomSplitEvent.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[RandomSplitEvent] = RandomSplitEvent.metaData
  }

  /**
   * The default read-only implementation of RandomSplitEvent.  You typically should not need to
   * directly reference this class; instead, use the RandomSplitEvent.apply method to construct
   * new instances.
   */
  class Immutable(
      val oldDataFrame: modeldb.DataFrame,
      val weights: Seq[Double],
      val seed: Long,
      val splitDataFrames: Seq[modeldb.DataFrame],
      val experimentRunId: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends RandomSplitEvent {
    def this(
      oldDataFrame: modeldb.DataFrame,
      weights: Seq[Double] = Seq[Double](),
      seed: Long,
      splitDataFrames: Seq[modeldb.DataFrame] = Seq[modeldb.DataFrame](),
      experimentRunId: Int
    ) = this(
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId,
      Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val oldDataFrame: modeldb.DataFrame,
      val weights: Seq[Double],
      val seed: Long,
      val splitDataFrames: Seq[modeldb.DataFrame],
      val experimentRunId: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends RandomSplitEvent {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the RandomSplitEvent trait with additional state or
   * behavior and implement the read-only methods from RandomSplitEvent using an underlying
   * instance.
   */
  trait Proxy extends RandomSplitEvent {
    protected def _underlying_RandomSplitEvent: RandomSplitEvent
    override def oldDataFrame: modeldb.DataFrame = _underlying_RandomSplitEvent.oldDataFrame
    override def weights: Seq[Double] = _underlying_RandomSplitEvent.weights
    override def seed: Long = _underlying_RandomSplitEvent.seed
    override def splitDataFrames: Seq[modeldb.DataFrame] = _underlying_RandomSplitEvent.splitDataFrames
    override def experimentRunId: Int = _underlying_RandomSplitEvent.experimentRunId
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_RandomSplitEvent._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.RandomSplitEvent.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait RandomSplitEvent
  extends ThriftStruct
  with _root_.scala.Product5[modeldb.DataFrame, Seq[Double], Long, Seq[modeldb.DataFrame], Int]
  with ValidatingThriftStruct[RandomSplitEvent]
  with java.io.Serializable
{
  import RandomSplitEvent._

  def oldDataFrame: modeldb.DataFrame
  def weights: Seq[Double]
  def seed: Long
  def splitDataFrames: Seq[modeldb.DataFrame]
  def experimentRunId: Int

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: modeldb.DataFrame = oldDataFrame
  def _2: Seq[Double] = weights
  def _3: Long = seed
  def _4: Seq[modeldb.DataFrame] = splitDataFrames
  def _5: Int = experimentRunId

  def toTuple: _root_.scala.Tuple5[modeldb.DataFrame, Seq[Double], Long, Seq[modeldb.DataFrame], Int] = {
    (
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (oldDataFrame ne null) {
                writeOldDataFrameValue(oldDataFrame, _oprot)
                _root_.scala.Some(RandomSplitEvent.OldDataFrameField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (weights ne null) {
                writeWeightsValue(weights, _oprot)
                _root_.scala.Some(RandomSplitEvent.WeightsField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writeSeedValue(seed, _oprot)
                _root_.scala.Some(RandomSplitEvent.SeedField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (splitDataFrames ne null) {
                writeSplitDataFramesValue(splitDataFrames, _oprot)
                _root_.scala.Some(RandomSplitEvent.SplitDataFramesField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (true) {
                writeExperimentRunIdValue(experimentRunId, _oprot)
                _root_.scala.Some(RandomSplitEvent.ExperimentRunIdField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): RandomSplitEvent = {
    var oldDataFrame: modeldb.DataFrame = this.oldDataFrame
    var weights: Seq[Double] = this.weights
    var seed: Long = this.seed
    var splitDataFrames: Seq[modeldb.DataFrame] = this.splitDataFrames
    var experimentRunId: Int = this.experimentRunId
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        oldDataFrame = readOldDataFrameValue(_blob.read)
      case 2 =>
        weights = readWeightsValue(_blob.read)
      case 3 =>
        seed = readSeedValue(_blob.read)
      case 4 =>
        splitDataFrames = readSplitDataFramesValue(_blob.read)
      case 5 =>
        experimentRunId = readExperimentRunIdValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): RandomSplitEvent = {
    var oldDataFrame: modeldb.DataFrame = this.oldDataFrame
    var weights: Seq[Double] = this.weights
    var seed: Long = this.seed
    var splitDataFrames: Seq[modeldb.DataFrame] = this.splitDataFrames
    var experimentRunId: Int = this.experimentRunId

    _fieldId match {
      case 1 =>
        oldDataFrame = null
      case 2 =>
        weights = Seq[Double]()
      case 3 =>
        seed = 0L
      case 4 =>
        splitDataFrames = Seq[modeldb.DataFrame]()
      case 5 =>
        experimentRunId = 0
      case _ =>
    }
    new Immutable(
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetOldDataFrame: RandomSplitEvent = unsetField(1)

  def unsetWeights: RandomSplitEvent = unsetField(2)

  def unsetSeed: RandomSplitEvent = unsetField(3)

  def unsetSplitDataFrames: RandomSplitEvent = unsetField(4)

  def unsetExperimentRunId: RandomSplitEvent = unsetField(5)


  override def write(_oprot: TProtocol): Unit = {
    RandomSplitEvent.validate(this)
    _oprot.writeStructBegin(Struct)
    if (oldDataFrame ne null) writeOldDataFrameField(oldDataFrame, _oprot)
    if (weights ne null) writeWeightsField(weights, _oprot)
    writeSeedField(seed, _oprot)
    if (splitDataFrames ne null) writeSplitDataFramesField(splitDataFrames, _oprot)
    writeExperimentRunIdField(experimentRunId, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    oldDataFrame: modeldb.DataFrame = this.oldDataFrame,
    weights: Seq[Double] = this.weights,
    seed: Long = this.seed,
    splitDataFrames: Seq[modeldb.DataFrame] = this.splitDataFrames,
    experimentRunId: Int = this.experimentRunId,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): RandomSplitEvent =
    new Immutable(
      oldDataFrame,
      weights,
      seed,
      splitDataFrames,
      experimentRunId,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[RandomSplitEvent]

  private def _equals(x: RandomSplitEvent, y: RandomSplitEvent): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[RandomSplitEvent])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 5

  override def productElement(n: Int): Any = n match {
    case 0 => this.oldDataFrame
    case 1 => this.weights
    case 2 => this.seed
    case 3 => this.splitDataFrames
    case 4 => this.experimentRunId
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "RandomSplitEvent"

  def _codec: ValidatingThriftStructCodec3[RandomSplitEvent] = RandomSplitEvent
}
