//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 01:31:41 PM CEST 
//


package gov.sec.ratings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}definition" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}usedOn" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="roleURI" use="required" type="{http://www.xbrl.org/2003/XLink}nonEmptyURI" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "definition",
    "usedOn"
})
@XmlRootElement(name = "roleType", namespace = "http://www.xbrl.org/2003/linkbase")
public class RoleType {

  @XmlElement(namespace = "http://www.xbrl.org/2003/linkbase")
  protected String definition;
  @XmlElement(namespace = "http://www.xbrl.org/2003/linkbase", required = true)
  protected List<QName> usedOn;
  @XmlAttribute(name = "roleURI", required = true)
  protected String roleURI;
  @XmlAttribute(name = "id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

  /**
   * Gets the value of the definition property.
   *
   * @return possible object is {@link String }
   */
  public String getDefinition() {
    return definition;
  }

  /**
   * Sets the value of the definition property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDefinition(String value) {
    this.definition = value;
  }

  /**
   * Gets the value of the usedOn property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside
   * the JAXB object. This is why there is not a <CODE>set</CODE> method for the usedOn property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUsedOn().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link QName }
   */
  public List<QName> getUsedOn() {
    if (usedOn == null) {
      usedOn = new ArrayList<QName>();
    }
    return this.usedOn;
  }

  /**
   * Gets the value of the roleURI property.
   *
   * @return possible object is {@link String }
   */
  public String getRoleURI() {
    return roleURI;
  }

  /**
   * Sets the value of the roleURI property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRoleURI(String value) {
    this.roleURI = value;
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

}
