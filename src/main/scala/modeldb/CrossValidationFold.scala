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


object CrossValidationFold extends ValidatingThriftStructCodec3[CrossValidationFold] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("CrossValidationFold")
  val ModelField: TField = new TField("model", TType.STRUCT, 1)
  val ModelFieldManifest: Manifest[modeldb.Transformer] = implicitly[Manifest[modeldb.Transformer]]
  val ValidationDfField: TField = new TField("validationDf", TType.STRUCT, 2)
  val ValidationDfFieldManifest: Manifest[modeldb.DataFrame] = implicitly[Manifest[modeldb.DataFrame]]
  val TrainingDfField: TField = new TField("trainingDf", TType.STRUCT, 3)
  val TrainingDfFieldManifest: Manifest[modeldb.DataFrame] = implicitly[Manifest[modeldb.DataFrame]]
  val ScoreField: TField = new TField("score", TType.DOUBLE, 4)
  val ScoreFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ModelField,
      false,
      false,
      ModelFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ValidationDfField,
      false,
      false,
      ValidationDfFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TrainingDfField,
      false,
      false,
      TrainingDfFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ScoreField,
      false,
      false,
      ScoreFieldManifest,
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
  def validate(_item: CrossValidationFold): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: CrossValidationFold): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.model)
    buf ++= validateField(item.validationDf)
    buf ++= validateField(item.trainingDf)
    buf ++= validateField(item.score)
    buf.toList
  }

  def withoutPassthroughFields(original: CrossValidationFold): CrossValidationFold =
    new Immutable(
      model =
        {
          val field = original.model
          modeldb.Transformer.withoutPassthroughFields(field)
        },
      validationDf =
        {
          val field = original.validationDf
          modeldb.DataFrame.withoutPassthroughFields(field)
        },
      trainingDf =
        {
          val field = original.trainingDf
          modeldb.DataFrame.withoutPassthroughFields(field)
        },
      score =
        {
          val field = original.score
          field
        }
    )

  override def encode(_item: CrossValidationFold, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): CrossValidationFold = {

    var model: modeldb.Transformer = null
    var validationDf: modeldb.DataFrame = null
    var trainingDf: modeldb.DataFrame = null
    var score: Double = 0.0

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
    
                model = readModelValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'model' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                validationDf = readValidationDfValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'validationDf' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                trainingDf = readTrainingDfValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'trainingDf' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
    
                score = readScoreValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'score' (expected=%s, actual=%s).".format(
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
      model,
      validationDf,
      trainingDf,
      score,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): CrossValidationFold =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): CrossValidationFold = {
    var model: modeldb.Transformer = null
    var validationDf: modeldb.DataFrame = null
    var trainingDf: modeldb.DataFrame = null
    var score: Double = 0.0
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
                model = readModelValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'model' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                validationDf = readValidationDfValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'validationDf' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRUCT =>
                trainingDf = readTrainingDfValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'trainingDf' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
                score = readScoreValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'score' (expected=%s, actual=%s).".format(
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
      model,
      validationDf,
      trainingDf,
      score,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    model: modeldb.Transformer,
    validationDf: modeldb.DataFrame,
    trainingDf: modeldb.DataFrame,
    score: Double
  ): CrossValidationFold =
    new Immutable(
      model,
      validationDf,
      trainingDf,
      score
    )

  def unapply(_item: CrossValidationFold): _root_.scala.Option[_root_.scala.Tuple4[modeldb.Transformer, modeldb.DataFrame, modeldb.DataFrame, Double]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readModelValue(_iprot: TProtocol): modeldb.Transformer = {
    modeldb.Transformer.decode(_iprot)
  }

  @inline private def writeModelField(model_item: modeldb.Transformer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ModelField)
    writeModelValue(model_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeModelValue(model_item: modeldb.Transformer, _oprot: TProtocol): Unit = {
    model_item.write(_oprot)
  }

  @inline private[modeldb] def readValidationDfValue(_iprot: TProtocol): modeldb.DataFrame = {
    modeldb.DataFrame.decode(_iprot)
  }

  @inline private def writeValidationDfField(validationDf_item: modeldb.DataFrame, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ValidationDfField)
    writeValidationDfValue(validationDf_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeValidationDfValue(validationDf_item: modeldb.DataFrame, _oprot: TProtocol): Unit = {
    validationDf_item.write(_oprot)
  }

  @inline private[modeldb] def readTrainingDfValue(_iprot: TProtocol): modeldb.DataFrame = {
    modeldb.DataFrame.decode(_iprot)
  }

  @inline private def writeTrainingDfField(trainingDf_item: modeldb.DataFrame, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TrainingDfField)
    writeTrainingDfValue(trainingDf_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTrainingDfValue(trainingDf_item: modeldb.DataFrame, _oprot: TProtocol): Unit = {
    trainingDf_item.write(_oprot)
  }

  @inline private[modeldb] def readScoreValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeScoreField(score_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ScoreField)
    writeScoreValue(score_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeScoreValue(score_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(score_item)
  }


  object Immutable extends ThriftStructCodec3[CrossValidationFold] {
    override def encode(_item: CrossValidationFold, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): CrossValidationFold = CrossValidationFold.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[CrossValidationFold] = CrossValidationFold.metaData
  }

  /**
   * The default read-only implementation of CrossValidationFold.  You typically should not need to
   * directly reference this class; instead, use the CrossValidationFold.apply method to construct
   * new instances.
   */
  class Immutable(
      val model: modeldb.Transformer,
      val validationDf: modeldb.DataFrame,
      val trainingDf: modeldb.DataFrame,
      val score: Double,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends CrossValidationFold {
    def this(
      model: modeldb.Transformer,
      validationDf: modeldb.DataFrame,
      trainingDf: modeldb.DataFrame,
      score: Double
    ) = this(
      model,
      validationDf,
      trainingDf,
      score,
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
      val model: modeldb.Transformer,
      val validationDf: modeldb.DataFrame,
      val trainingDf: modeldb.DataFrame,
      val score: Double,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends CrossValidationFold {

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
   * This Proxy trait allows you to extend the CrossValidationFold trait with additional state or
   * behavior and implement the read-only methods from CrossValidationFold using an underlying
   * instance.
   */
  trait Proxy extends CrossValidationFold {
    protected def _underlying_CrossValidationFold: CrossValidationFold
    override def model: modeldb.Transformer = _underlying_CrossValidationFold.model
    override def validationDf: modeldb.DataFrame = _underlying_CrossValidationFold.validationDf
    override def trainingDf: modeldb.DataFrame = _underlying_CrossValidationFold.trainingDf
    override def score: Double = _underlying_CrossValidationFold.score
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_CrossValidationFold._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.CrossValidationFold.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait CrossValidationFold
  extends ThriftStruct
  with _root_.scala.Product4[modeldb.Transformer, modeldb.DataFrame, modeldb.DataFrame, Double]
  with ValidatingThriftStruct[CrossValidationFold]
  with java.io.Serializable
{
  import CrossValidationFold._

  def model: modeldb.Transformer
  def validationDf: modeldb.DataFrame
  def trainingDf: modeldb.DataFrame
  def score: Double

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: modeldb.Transformer = model
  def _2: modeldb.DataFrame = validationDf
  def _3: modeldb.DataFrame = trainingDf
  def _4: Double = score

  def toTuple: _root_.scala.Tuple4[modeldb.Transformer, modeldb.DataFrame, modeldb.DataFrame, Double] = {
    (
      model,
      validationDf,
      trainingDf,
      score
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
              if (model ne null) {
                writeModelValue(model, _oprot)
                _root_.scala.Some(CrossValidationFold.ModelField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (validationDf ne null) {
                writeValidationDfValue(validationDf, _oprot)
                _root_.scala.Some(CrossValidationFold.ValidationDfField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (trainingDf ne null) {
                writeTrainingDfValue(trainingDf, _oprot)
                _root_.scala.Some(CrossValidationFold.TrainingDfField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (true) {
                writeScoreValue(score, _oprot)
                _root_.scala.Some(CrossValidationFold.ScoreField)
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
  def setField(_blob: TFieldBlob): CrossValidationFold = {
    var model: modeldb.Transformer = this.model
    var validationDf: modeldb.DataFrame = this.validationDf
    var trainingDf: modeldb.DataFrame = this.trainingDf
    var score: Double = this.score
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        model = readModelValue(_blob.read)
      case 2 =>
        validationDf = readValidationDfValue(_blob.read)
      case 3 =>
        trainingDf = readTrainingDfValue(_blob.read)
      case 4 =>
        score = readScoreValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      model,
      validationDf,
      trainingDf,
      score,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): CrossValidationFold = {
    var model: modeldb.Transformer = this.model
    var validationDf: modeldb.DataFrame = this.validationDf
    var trainingDf: modeldb.DataFrame = this.trainingDf
    var score: Double = this.score

    _fieldId match {
      case 1 =>
        model = null
      case 2 =>
        validationDf = null
      case 3 =>
        trainingDf = null
      case 4 =>
        score = 0.0
      case _ =>
    }
    new Immutable(
      model,
      validationDf,
      trainingDf,
      score,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetModel: CrossValidationFold = unsetField(1)

  def unsetValidationDf: CrossValidationFold = unsetField(2)

  def unsetTrainingDf: CrossValidationFold = unsetField(3)

  def unsetScore: CrossValidationFold = unsetField(4)


  override def write(_oprot: TProtocol): Unit = {
    CrossValidationFold.validate(this)
    _oprot.writeStructBegin(Struct)
    if (model ne null) writeModelField(model, _oprot)
    if (validationDf ne null) writeValidationDfField(validationDf, _oprot)
    if (trainingDf ne null) writeTrainingDfField(trainingDf, _oprot)
    writeScoreField(score, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    model: modeldb.Transformer = this.model,
    validationDf: modeldb.DataFrame = this.validationDf,
    trainingDf: modeldb.DataFrame = this.trainingDf,
    score: Double = this.score,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): CrossValidationFold =
    new Immutable(
      model,
      validationDf,
      trainingDf,
      score,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[CrossValidationFold]

  private def _equals(x: CrossValidationFold, y: CrossValidationFold): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[CrossValidationFold])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.model
    case 1 => this.validationDf
    case 2 => this.trainingDf
    case 3 => this.score
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "CrossValidationFold"

  def _codec: ValidatingThriftStructCodec3[CrossValidationFold] = CrossValidationFold
}

