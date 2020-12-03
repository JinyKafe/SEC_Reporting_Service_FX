//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 01:31:41 PM CEST 
//


package gov.sec.ratings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}schemaRef" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}linkbaseRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}roleRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}arcroleRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.xbrl.org/2003/instance}item"/&gt;
 *           &lt;element ref="{http://www.xbrl.org/2003/instance}tuple"/&gt;
 *           &lt;element ref="{http://www.xbrl.org/2003/instance}context"/&gt;
 *           &lt;element ref="{http://www.xbrl.org/2003/instance}unit"/&gt;
 *           &lt;element ref="{http://www.xbrl.org/2003/linkbase}footnoteLink"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='http://www.w3.org/XML/1998/namespace'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schemaRef",
    "linkbaseRef",
    "roleRef",
    "arcroleRef",
    "itemOrTupleOrContext"
})
@XmlRootElement(name = "xbrl")
public class Xbrl {

  @XmlElement(namespace = "http://www.xbrl.org/2003/linkbase", required = true)
  protected List<SimpleType> schemaRef;
  @XmlElement(namespace = "http://www.xbrl.org/2003/linkbase")
  protected List<LinkbaseRef> linkbaseRef;
  @XmlElement(namespace = "http://www.xbrl.org/2003/linkbase")
  protected List<RoleRef> roleRef;
  @XmlElement(namespace = "http://www.xbrl.org/2003/linkbase")
  protected List<ArcroleRef> arcroleRef;
  @XmlElementRefs({
      @XmlElementRef(name = "item", namespace = "http://www.xbrl.org/2003/instance", type = JAXBElement.class, required = false),
      @XmlElementRef(name = "tuple", namespace = "http://www.xbrl.org/2003/instance", type = JAXBElement.class, required = false),
      @XmlElementRef(name = "context", namespace = "http://www.xbrl.org/2003/instance", type = Context.class, required = false),
      @XmlElementRef(name = "unit", namespace = "http://www.xbrl.org/2003/instance", type = Unit.class, required = false),
      @XmlElementRef(name = "footnoteLink", namespace = "http://www.xbrl.org/2003/linkbase", type = JAXBElement.class, required = false)
  })
  protected List<Object> itemOrTupleOrContext;
  @XmlAttribute(name = "id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Gets the value of the schemaRef property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside
   * the JAXB object. This is why there is not a <CODE>set</CODE> method for the schemaRef property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSchemaRef().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SimpleType }
   */
  public List<SimpleType> getSchemaRef() {
    if (schemaRef == null) {
      schemaRef = new ArrayList<SimpleType>();
    }
    return this.schemaRef;
  }

  /**
   * Gets the value of the linkbaseRef property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside
   * the JAXB object. This is why there is not a <CODE>set</CODE> method for the linkbaseRef property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLinkbaseRef().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link LinkbaseRef }
   */
  public List<LinkbaseRef> getLinkbaseRef() {
    if (linkbaseRef == null) {
      linkbaseRef = new ArrayList<LinkbaseRef>();
    }
    return this.linkbaseRef;
  }

  /**
   * Gets the value of the roleRef property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside
   * the JAXB object. This is why there is not a <CODE>set</CODE> method for the roleRef property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRoleRef().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link RoleRef }
   */
  public List<RoleRef> getRoleRef() {
    if (roleRef == null) {
      roleRef = new ArrayList<RoleRef>();
    }
    return this.roleRef;
  }

  /**
   * Gets the value of the arcroleRef property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside
   * the JAXB object. This is why there is not a <CODE>set</CODE> method for the arcroleRef property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getArcroleRef().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ArcroleRef }
   */
  public List<ArcroleRef> getArcroleRef() {
    if (arcroleRef == null) {
      arcroleRef = new ArrayList<ArcroleRef>();
    }
    return this.arcroleRef;
  }

  /**
   * Gets the value of the itemOrTupleOrContext property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside
   * the JAXB object. This is why there is not a <CODE>set</CODE> method for the itemOrTupleOrContext property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getItemOrTupleOrContext().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link SECCategoryItemType }{@code >} {@link JAXBElement }{@code
   * <}{@link LeiItemType }{@code >} {@link JAXBElement }{@code <}{@link CentralIndexKey2ItemType }{@code >} {@link JAXBElement }{@code <}{@link
   * SECCategoryItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link RAC }{@code >} {@link
   * JAXBElement }{@code <}{@link PureItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link OBT
   * }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement
   * }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link BooleanItemType }{@code >} {@link JAXBElement }{@code <}{@link
   * MonetaryItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >}
   * {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link DateItemType }{@code >} {@link JAXBElement }{@code
   * <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link DateItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code
   * >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link IssuerIdentifierSchemeItemType }{@code >} {@link
   * JAXBElement }{@code <}{@link DateItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link
   * StringItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >}
   * {@link JAXBElement }{@code <}{@link INIS }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link
   * StringItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link StringItemType }{@code >}
   * {@link JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link IssuerIdentifierSchemeItemType }{@code >} {@link
   * JAXBElement }{@code <}{@link StringItemType }{@code >} {@link JAXBElement }{@code <}{@link CusipItemType }{@code >} {@link JAXBElement }{@code <}{@link
   * DateItemType }{@code >} {@link JAXBElement }{@code <}{@link Object }{@code >} {@link JAXBElement }{@code <}{@link RatingDetailType }{@code >} {@link
   * JAXBElement }{@code <}{@link IND }{@code >} {@link JAXBElement }{@code <}{@link ISD }{@code >} {@link JAXBElement }{@code <}{@link RatingDetailType }{@code
   * >} {@link JAXBElement }{@code <}{@link ROCRA }{@code >} {@link JAXBElement }{@code <}{@link OD }{@code >} {@link JAXBElement }{@code <}{@link Object
   * }{@code >} {@link Context } {@link Unit } {@link JAXBElement }{@code <}{@link FootnoteLink }{@code >}
   */
  public List<Object> getItemOrTupleOrContext() {
    if (itemOrTupleOrContext == null) {
      itemOrTupleOrContext = new ArrayList<Object>();
    }
    return this.itemOrTupleOrContext;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets a map that contains attributes that aren't bound to any typed property on this class.
   *
   * <p>
   * the map is keyed by the name of the attribute and the value is the string value of the attribute.
   * <p>
   * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
   *
   * @return always non-null
   */
  public Map<QName, String> getOtherAttributes() {
    return otherAttributes;
  }

}
