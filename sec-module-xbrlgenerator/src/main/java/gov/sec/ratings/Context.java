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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="entity" type="{http://www.xbrl.org/2003/instance}contextEntityType"/&gt;
 *         &lt;element name="period" type="{http://www.xbrl.org/2003/instance}contextPeriodType"/&gt;
 *         &lt;element name="scenario" type="{http://www.xbrl.org/2003/instance}contextScenarioType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entity",
    "period",
    "scenario"
})
@XmlRootElement(name = "context")
public class Context {

  @XmlElement(required = true)
  protected ContextEntityType entity;
  @XmlElement(required = true)
  protected ContextPeriodType period;
  protected ContextScenarioType scenario;
  @XmlAttribute(name = "id", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

  /**
   * Gets the value of the entity property.
   *
   * @return possible object is {@link ContextEntityType }
   */
  public ContextEntityType getEntity() {
    return entity;
  }

  /**
   * Sets the value of the entity property.
   *
   * @param value allowed object is {@link ContextEntityType }
   */
  public void setEntity(ContextEntityType value) {
    this.entity = value;
  }

  /**
   * Gets the value of the period property.
   *
   * @return possible object is {@link ContextPeriodType }
   */
  public ContextPeriodType getPeriod() {
    return period;
  }

  /**
   * Sets the value of the period property.
   *
   * @param value allowed object is {@link ContextPeriodType }
   */
  public void setPeriod(ContextPeriodType value) {
    this.period = value;
  }

  /**
   * Gets the value of the scenario property.
   *
   * @return possible object is {@link ContextScenarioType }
   */
  public ContextScenarioType getScenario() {
    return scenario;
  }

  /**
   * Sets the value of the scenario property.
   *
   * @param value allowed object is {@link ContextScenarioType }
   */
  public void setScenario(ContextScenarioType value) {
    this.scenario = value;
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
