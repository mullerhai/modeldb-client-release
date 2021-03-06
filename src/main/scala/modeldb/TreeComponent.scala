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


object TreeComponent extends ValidatingThriftStructCodec3[TreeComponent] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("TreeComponent")
  val WeightField: TField = new TField("weight", TType.DOUBLE, 1)
  val WeightFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val NodesField: TField = new TField("nodes", TType.LIST, 2)
  val NodesFieldManifest: Manifest[Seq[modeldb.TreeNode]] = implicitly[Manifest[Seq[modeldb.TreeNode]]]
  val LinksField: TField = new TField("links", TType.LIST, 3)
  val LinksFieldManifest: Manifest[Seq[modeldb.TreeLink]] = implicitly[Manifest[Seq[modeldb.TreeLink]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      WeightField,
      false,
      false,
      WeightFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      NodesField,
      false,
      false,
      NodesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[modeldb.TreeNode]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      LinksField,
      false,
      false,
      LinksFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[modeldb.TreeLink]]),
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
  def validate(_item: TreeComponent): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: TreeComponent): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.weight)
    buf ++= validateField(item.nodes)
    buf ++= validateField(item.links)
    buf.toList
  }

  def withoutPassthroughFields(original: TreeComponent): TreeComponent =
    new Immutable(
      weight =
        {
          val field = original.weight
          field
        },
      nodes =
        {
          val field = original.nodes
          field.map { field =>
            modeldb.TreeNode.withoutPassthroughFields(field)
          }
        },
      links =
        {
          val field = original.links
          field.map { field =>
            modeldb.TreeLink.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: TreeComponent, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): TreeComponent = {

    var weight: Double = 0.0
    var nodes: Seq[modeldb.TreeNode] = Seq[modeldb.TreeNode]()
    var links: Seq[modeldb.TreeLink] = Seq[modeldb.TreeLink]()

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
              case TType.DOUBLE =>
    
                weight = readWeightValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'weight' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
    
                nodes = readNodesValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'nodes' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
    
                links = readLinksValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'links' (expected=%s, actual=%s).".format(
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
      weight,
      nodes,
      links,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TreeComponent =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): TreeComponent = {
    var weight: Double = 0.0
    var nodes: Seq[modeldb.TreeNode] = Seq[modeldb.TreeNode]()
    var links: Seq[modeldb.TreeLink] = Seq[modeldb.TreeLink]()
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
              case TType.DOUBLE =>
                weight = readWeightValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'weight' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
                nodes = readNodesValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'nodes' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
                links = readLinksValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'links' (expected=%s, actual=%s).".format(
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
      weight,
      nodes,
      links,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    weight: Double,
    nodes: Seq[modeldb.TreeNode] = Seq[modeldb.TreeNode](),
    links: Seq[modeldb.TreeLink] = Seq[modeldb.TreeLink]()
  ): TreeComponent =
    new Immutable(
      weight,
      nodes,
      links
    )

  def unapply(_item: TreeComponent): _root_.scala.Option[_root_.scala.Tuple3[Double, Seq[modeldb.TreeNode], Seq[modeldb.TreeLink]]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readWeightValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeWeightField(weight_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(WeightField)
    writeWeightValue(weight_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeWeightValue(weight_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(weight_item)
  }

  @inline private[modeldb] def readNodesValue(_iprot: TProtocol): Seq[modeldb.TreeNode] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[modeldb.TreeNode](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          modeldb.TreeNode.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeNodesField(nodes_item: Seq[modeldb.TreeNode], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NodesField)
    writeNodesValue(nodes_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNodesValue(nodes_item: Seq[modeldb.TreeNode], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, nodes_item.size))
    nodes_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = nodes_item.size
        while (_i < _size) {
          val nodes_item_element = nodes_item(_i)
          nodes_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        nodes_item.foreach { nodes_item_element =>
          nodes_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[modeldb] def readLinksValue(_iprot: TProtocol): Seq[modeldb.TreeLink] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[modeldb.TreeLink](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          modeldb.TreeLink.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeLinksField(links_item: Seq[modeldb.TreeLink], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(LinksField)
    writeLinksValue(links_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeLinksValue(links_item: Seq[modeldb.TreeLink], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, links_item.size))
    links_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = links_item.size
        while (_i < _size) {
          val links_item_element = links_item(_i)
          links_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        links_item.foreach { links_item_element =>
          links_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[TreeComponent] {
    override def encode(_item: TreeComponent, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TreeComponent = TreeComponent.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TreeComponent] = TreeComponent.metaData
  }

  /**
   * The default read-only implementation of TreeComponent.  You typically should not need to
   * directly reference this class; instead, use the TreeComponent.apply method to construct
   * new instances.
   */
  class Immutable(
      val weight: Double,
      val nodes: Seq[modeldb.TreeNode],
      val links: Seq[modeldb.TreeLink],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TreeComponent {
    def this(
      weight: Double,
      nodes: Seq[modeldb.TreeNode] = Seq[modeldb.TreeNode](),
      links: Seq[modeldb.TreeLink] = Seq[modeldb.TreeLink]()
    ) = this(
      weight,
      nodes,
      links,
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
      val weight: Double,
      val nodes: Seq[modeldb.TreeNode],
      val links: Seq[modeldb.TreeLink],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TreeComponent {

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
   * This Proxy trait allows you to extend the TreeComponent trait with additional state or
   * behavior and implement the read-only methods from TreeComponent using an underlying
   * instance.
   */
  trait Proxy extends TreeComponent {
    protected def _underlying_TreeComponent: TreeComponent
    override def weight: Double = _underlying_TreeComponent.weight
    override def nodes: Seq[modeldb.TreeNode] = _underlying_TreeComponent.nodes
    override def links: Seq[modeldb.TreeLink] = _underlying_TreeComponent.links
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_TreeComponent._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.TreeComponent.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait TreeComponent
  extends ThriftStruct
  with _root_.scala.Product3[Double, Seq[modeldb.TreeNode], Seq[modeldb.TreeLink]]
  with ValidatingThriftStruct[TreeComponent]
  with java.io.Serializable
{
  import TreeComponent._

  def weight: Double
  def nodes: Seq[modeldb.TreeNode]
  def links: Seq[modeldb.TreeLink]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Double = weight
  def _2: Seq[modeldb.TreeNode] = nodes
  def _3: Seq[modeldb.TreeLink] = links

  def toTuple: _root_.scala.Tuple3[Double, Seq[modeldb.TreeNode], Seq[modeldb.TreeLink]] = {
    (
      weight,
      nodes,
      links
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
                writeWeightValue(weight, _oprot)
                _root_.scala.Some(TreeComponent.WeightField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (nodes ne null) {
                writeNodesValue(nodes, _oprot)
                _root_.scala.Some(TreeComponent.NodesField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (links ne null) {
                writeLinksValue(links, _oprot)
                _root_.scala.Some(TreeComponent.LinksField)
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
  def setField(_blob: TFieldBlob): TreeComponent = {
    var weight: Double = this.weight
    var nodes: Seq[modeldb.TreeNode] = this.nodes
    var links: Seq[modeldb.TreeLink] = this.links
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        weight = readWeightValue(_blob.read)
      case 2 =>
        nodes = readNodesValue(_blob.read)
      case 3 =>
        links = readLinksValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      weight,
      nodes,
      links,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TreeComponent = {
    var weight: Double = this.weight
    var nodes: Seq[modeldb.TreeNode] = this.nodes
    var links: Seq[modeldb.TreeLink] = this.links

    _fieldId match {
      case 1 =>
        weight = 0.0
      case 2 =>
        nodes = Seq[modeldb.TreeNode]()
      case 3 =>
        links = Seq[modeldb.TreeLink]()
      case _ =>
    }
    new Immutable(
      weight,
      nodes,
      links,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetWeight: TreeComponent = unsetField(1)

  def unsetNodes: TreeComponent = unsetField(2)

  def unsetLinks: TreeComponent = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    TreeComponent.validate(this)
    _oprot.writeStructBegin(Struct)
    writeWeightField(weight, _oprot)
    if (nodes ne null) writeNodesField(nodes, _oprot)
    if (links ne null) writeLinksField(links, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    weight: Double = this.weight,
    nodes: Seq[modeldb.TreeNode] = this.nodes,
    links: Seq[modeldb.TreeLink] = this.links,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TreeComponent =
    new Immutable(
      weight,
      nodes,
      links,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TreeComponent]

  private def _equals(x: TreeComponent, y: TreeComponent): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[TreeComponent])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.weight
    case 1 => this.nodes
    case 2 => this.links
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TreeComponent"

  def _codec: ValidatingThriftStructCodec3[TreeComponent] = TreeComponent
}

