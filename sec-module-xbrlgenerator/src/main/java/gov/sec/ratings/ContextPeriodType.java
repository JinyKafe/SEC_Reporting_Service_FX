//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 01:31:41 PM CEST 
//


package gov.sec.ratings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The type for the period element, used to describe the reporting date info.
 *
 *
 * <p>Java class for contextPeriodType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="contextPeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="startDate" type="{http://www.xbrl.org/2003/instance}dateUnion"/&gt;
 *           &lt;element name="endDate" type="{http://www.xbrl.org/2003/instance}dateUnion"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="instant" type="{http://www.xbrl.org/2003/instance}dateUnion"/&gt;
 *         &lt;element name="forever"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextPeriodType", propOrder = {
    "startDate",
    "endDate",
    "instant",
    "forever"
})
public class ContextPeriodType {

  protected String startDate;
  protected String endDate;
  protected String instant;
  protected Forever forever;

  /**
   * Gets the value of the startDate property.
   *
   * @return possible object is {@link String }
   */
  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the value of the startDate property.
   *
   * @param value allowed object is {@link String }
   */
  public void setStartDate(String value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the endDate property.
   *
   * @return possible object is {@link String }
   */
  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the value of the endDate property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEndDate(String value) {
    this.endDate = value;
  }

  /**
   * Gets the value of the instant property.
   *
   * @return possible object is {@link String }
   */
  public String getInstant() {
    return instant;
  }

  /**
   * Sets the value of the instant property.
   *
   * @param value allowed object is {@link String }
   */
  public void setInstant(String value) {
    this.instant = value;
  }

  /**
   * Gets the value of the forever property.
   *
   * @return possible object is {@link Forever }
   */
  public Forever getForever() {
    return forever;
  }

  /**
   * Sets the value of the forever property.
   *
   * @param value allowed object is {@link Forever }
   */
  public void setForever(Forever value) {
    this.forever = value;
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class Forever {


  }

}
