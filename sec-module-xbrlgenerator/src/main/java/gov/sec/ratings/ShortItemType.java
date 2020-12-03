//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 01:31:41 PM CEST 
//


package gov.sec.ratings;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for shortItemType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="shortItemType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;short"&gt;
 *       &lt;attGroup ref="{http://www.xbrl.org/2003/instance}numericItemAttrs"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shortItemType", propOrder = {
    "value"
})
public class ShortItemType {

  @XmlValue
  protected short value;
  @XmlAttribute(name = "precision")
  protected String precision;
  @XmlAttribute(name = "decimals")
  protected String decimals;
  @XmlAttribute(name = "unitRef", required = true)
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object unitRef;
  @XmlAttribute(name = "contextRef", required = true)
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object contextRef;
  @XmlAttribute(name = "id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Gets the value of the value property.
   */
  public short getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   */
  public void setValue(short value) {
    this.value = value;
  }

  /**
   * Gets the value of the precision property.
   *
   * @return possible object is {@link String }
   */
  public String getPrecision() {
    return precision;
  }

  /**
   * Sets the value of the precision property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPrecision(String value) {
    this.precision = value;
  }

  /**
   * Gets the value of the decimals property.
   *
   * @return possible object is {@link String }
   */
  public String getDecimals() {
    return decimals;
  }

  /**
   * Sets the value of the decimals property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDecimals(String value) {
    this.decimals = value;
  }

  /**
   * Gets the value of the unitRef property.
   *
   * @return possible object is {@link Object }
   */
  public Object getUnitRef() {
    return unitRef;
  }

  /**
   * Sets the value of the unitRef property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setUnitRef(Object value) {
    this.unitRef = value;
  }

  /**
   * Gets the value of the contextRef property.
   *
   * @return possible object is {@link Object }
   */
  public Object getContextRef() {
    return contextRef;
  }

  /**
   * Sets the value of the contextRef property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setContextRef(Object value) {
    this.contextRef = value;
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
