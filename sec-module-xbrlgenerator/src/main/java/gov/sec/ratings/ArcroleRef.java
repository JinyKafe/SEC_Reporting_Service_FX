//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 01:31:41 PM CEST 
//


package gov.sec.ratings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xbrl.org/2003/XLink}simpleType"&gt;
 *       &lt;attribute name="arcroleURI" use="required" type="{http://www.xbrl.org/2003/XLink}nonEmptyURI" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='http://www.w3.org/XML/1998/namespace'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ArcroleRef
    extends SimpleType {

  @XmlAttribute(name = "arcroleURI", required = true)
  protected String arcroleURI;

  /**
   * Gets the value of the arcroleURI property.
   *
   * @return possible object is {@link String }
   */
  public String getArcroleURI() {
    return arcroleURI;
  }

  /**
   * Sets the value of the arcroleURI property.
   *
   * @param value allowed object is {@link String }
   */
  public void setArcroleURI(String value) {
    this.arcroleURI = value;
  }

}