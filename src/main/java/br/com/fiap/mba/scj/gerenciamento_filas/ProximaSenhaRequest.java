//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 08:52:52 PM BRST 
//


package br.com.fiap.mba.scj.gerenciamento_filas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fila" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroPontoAtd" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fila",
    "numeroPontoAtd"
})
@XmlRootElement(name = "proximaSenhaRequest")
public class ProximaSenhaRequest {

    @XmlElement(required = true)
    protected String fila;
    @XmlElement(required = true)
    protected BigInteger numeroPontoAtd;

    /**
     * Gets the value of the fila property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFila() {
        return fila;
    }

    /**
     * Sets the value of the fila property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFila(String value) {
        this.fila = value;
    }

    /**
     * Gets the value of the numeroPontoAtd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroPontoAtd() {
        return numeroPontoAtd;
    }

    /**
     * Sets the value of the numeroPontoAtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroPontoAtd(BigInteger value) {
        this.numeroPontoAtd = value;
    }

}
