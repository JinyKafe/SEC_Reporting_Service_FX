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
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.xbrl.org/2003/XLink}extendedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/XLink}title"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}documentation"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}loc"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}footnoteArc"/&gt;
 *         &lt;element ref="{http://www.xbrl.org/2003/linkbase}footnote"/&gt;
 *       &lt;/choice&gt;
 *       &lt;anyAttribute processContents='lax' namespace='http://www.w3.org/XML/1998/namespace'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FootnoteLink
    extends ExtendedType {


}
