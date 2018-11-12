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


object CrossValidationFoldResponse extends ValidatingThriftStructCodec3[CrossValidationFoldResponse] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("CrossValidationFoldResponse")
  val ModelIdField: TField = new TField("modelId", TType.I32, 1)
  val ModelIdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val ValidationIdField: TField = new TField("validationId", TType.I32, 2)
  val ValidationIdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val TrainingIdField: TField = new TField("trainingId", TType.I32, 3)
  val TrainingIdFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ModelIdField,
      false,
      false,
      ModelIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ValidationIdField,
      false,
      false,
      ValidationIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TrainingIdField,
      false,
      false,
      TrainingIdFieldManifest,
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
  def validate(_item: CrossValidationFoldResponse): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: CrossValidationFoldResponse): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.modelId)
    buf ++= validateField(item.validationId)
    buf ++= validateField(item.trainingId)
    buf.toList
  }

  def withoutPassthroughFields(original: CrossValidationFoldResponse): CrossValidationFoldResponse =
    new Immutable(
      modelId =
        {
          val field = original.modelId
          field
        },
      validationId =
        {
          val field = original.validationId
          field
        },
      trainingId =
        {
          val field = original.trainingId
          field
        }
    )

  override def encode(_item: CrossValidationFoldResponse, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): CrossValidationFoldResponse = {

    var modelId: Int = 0
    var validationId: Int = 0
    var trainingId: Int = 0

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
              case TType.I32 =>
    
                modelId = readModelIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'modelId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I32 =>
    
                validationId = readValidationIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'validationId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
    
                trainingId = readTrainingIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'trainingId' (expected=%s, actual=%s).".format(
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
      modelId,
      validationId,
      trainingId,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): CrossValidationFoldResponse =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): CrossValidationFoldResponse = {
    var modelId: Int = 0
    var validationId: Int = 0
    var trainingId: Int = 0
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
              case TType.I32 =>
                modelId = readModelIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'modelId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I32 =>
                validationId = readValidationIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'validationId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
                trainingId = readTrainingIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'trainingId' (expected=%s, actual=%s).".format(
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
      modelId,
      validationId,
      trainingId,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    modelId: Int,
    validationId: Int,
    trainingId: Int
  ): CrossValidationFoldResponse =
    new Immutable(
      modelId,
      validationId,
      trainingId
    )

  def unapply(_item: CrossValidationFoldResponse): _root_.scala.Option[_root_.scala.Tuple3[Int, Int, Int]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readModelIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeModelIdField(modelId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ModelIdField)
    writeModelIdValue(modelId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeModelIdValue(modelId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(modelId_item)
  }

  @inline private[modeldb] def readValidationIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeValidationIdField(validationId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ValidationIdField)
    writeValidationIdValue(validationId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeValidationIdValue(validationId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(validationId_item)
  }

  @inline private[modeldb] def readTrainingIdValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeTrainingIdField(trainingId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TrainingIdField)
    writeTrainingIdValue(trainingId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTrainingIdValue(trainingId_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(trainingId_item)
  }


  object Immutable extends ThriftStructCodec3[CrossValidationFoldResponse] {
    override def encode(_item: CrossValidationFoldResponse, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): CrossValidationFoldResponse = CrossValidationFoldResponse.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[CrossValidationFoldResponse] = CrossValidationFoldResponse.metaData
  }

  /**
   * The default read-only implementation of CrossValidationFoldResponse.  You typically should not need to
   * directly reference this class; instead, use the CrossValidationFoldResponse.apply method to construct
   * new instances.
   */
  class Immutable(
      val modelId: Int,
      val validationId: Int,
      val trainingId: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends CrossValidationFoldResponse {
    def this(
      modelId: Int,
      validationId: Int,
      trainingId: Int
    ) = this(
      modelId,
      validationId,
      trainingId,
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
      val modelId: Int,
      val validationId: Int,
      val trainingId: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends CrossValidationFoldResponse {

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
   * This Proxy trait allows you to extend the CrossValidationFoldResponse trait with additional state or
   * behavior and implement the read-only methods from CrossValidationFoldResponse using an underlying
   * instance.
   */
  trait Proxy extends CrossValidationFoldResponse {
    protected def _underlying_CrossValidationFoldResponse: CrossValidationFoldResponse
    override def modelId: Int = _underlying_CrossValidationFoldResponse.modelId
    override def validationId: Int = _underlying_CrossValidationFoldResponse.validationId
    override def trainingId: Int = _underlying_CrossValidationFoldResponse.trainingId
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_CrossValidationFoldResponse._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.CrossValidationFoldResponse.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait CrossValidationFoldResponse
  extends ThriftStruct
  with _root_.scala.Product3[Int, Int, Int]
  with ValidatingThriftStruct[CrossValidationFoldResponse]
  with java.io.Serializable
{
  import CrossValidationFoldResponse._

  def modelId: Int
  def validationId: Int
  def trainingId: Int

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Int = modelId
  def _2: Int = validationId
  def _3: Int = trainingId

  def toTuple: _root_.scala.Tuple3[Int, Int, Int] = {
    (
      modelId,
      validationId,
      trainingId
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
              if (true) {
                writeModelIdValue(modelId, _oprot)
                _root_.scala.Some(CrossValidationFoldResponse.ModelIdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (true) {
                writeValidationIdValue(validationId, _oprot)
                _root_.scala.Some(CrossValidationFoldResponse.ValidationIdField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writeTrainingIdValue(trainingId, _oprot)
                _root_.scala.Some(CrossValidationFoldResponse.TrainingIdField)
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
  def setField(_blob: TFieldBlob): CrossValidationFoldResponse = {
    var modelId: Int = this.modelId
    var validationId: Int = this.validationId
    var trainingId: Int = this.trainingId
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        modelId = readModelIdValue(_blob.read)
      case 2 =>
        validationId = readValidationIdValue(_blob.read)
      case 3 =>
        trainingId = readTrainingIdValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      modelId,
      validationId,
      trainingId,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): CrossValidationFoldResponse = {
    var modelId: Int = this.modelId
    var validationId: Int = this.validationId
    var trainingId: Int = this.trainingId

    _fieldId match {
      case 1 =>
        modelId = 0
      case 2 =>
        validationId = 0
      case 3 =>
        trainingId = 0
      case _ =>
    }
    new Immutable(
      modelId,
      validationId,
      trainingId,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetModelId: CrossValidationFoldResponse = unsetField(1)

  def unsetValidationId: CrossValidationFoldResponse = unsetField(2)

  def unsetTrainingId: CrossValidationFoldResponse = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    CrossValidationFoldResponse.validate(this)
    _oprot.writeStructBegin(Struct)
    writeModelIdField(modelId, _oprot)
    writeValidationIdField(validationId, _oprot)
    writeTrainingIdField(trainingId, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    modelId: Int = this.modelId,
    validationId: Int = this.validationId,
    trainingId: Int = this.trainingId,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): CrossValidationFoldResponse =
    new Immutable(
      modelId,
      validationId,
      trainingId,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[CrossValidationFoldResponse]

  private def _equals(x: CrossValidationFoldResponse, y: CrossValidationFoldResponse): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[CrossValidationFoldResponse])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.modelId
    case 1 => this.validationId
    case 2 => this.trainingId
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "CrossValidationFoldResponse"

  def _codec: ValidatingThriftStructCodec3[CrossValidationFoldResponse] = CrossValidationFoldResponse
}

