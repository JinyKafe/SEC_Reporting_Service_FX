//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.19 at 01:31:41 PM CEST 
//


package gov.sec.ratings;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension of the extended link arc type for calculation arcs. Adds a weight attribute to track weights on contributions to summations.
 *
 *
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xbrl.org/2003/XLink}arcType"&gt;
 *       &lt;attribute name="weight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CalculationArc
    extends ArcType {

  @XmlAttribute(name = "weight", required = true)
  protected BigDecimal weight;

  /**
   * Gets the value of the weight property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getWeight() {
    return weight;
  }

  /**
   * Sets the value of the weight property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setWeight(BigDecimal value) {
    this.weight = value;
  }

}
