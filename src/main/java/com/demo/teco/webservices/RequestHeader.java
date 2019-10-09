//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RequestHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consumer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="credentials"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="userCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="channel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="message"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="consumerMessageId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0", propOrder = {
    "consumer",
    "message"
})
public class RequestHeader {

    @XmlElement(required = true)
    protected RequestHeader.Consumer consumer;
    @XmlElement(required = true)
    protected RequestHeader.Message message;

    /**
     * Obtiene el valor de la propiedad consumer.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader.Consumer }
     *     
     */
    public RequestHeader.Consumer getConsumer() {
        return consumer;
    }

    /**
     * Define el valor de la propiedad consumer.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader.Consumer }
     *     
     */
    public void setConsumer(RequestHeader.Consumer value) {
        this.consumer = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader.Message }
     *     
     */
    public RequestHeader.Message getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader.Message }
     *     
     */
    public void setMessage(RequestHeader.Message value) {
        this.message = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="credentials"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="userCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="channel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userID",
        "credentials"
    })
    public static class Consumer {

        @XmlElement(namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0", required = true)
        protected String userID;
        @XmlElement(namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0", required = true)
        protected RequestHeader.Consumer.Credentials credentials;
        @XmlAttribute(name = "code", required = true)
        protected String code;
        @XmlAttribute(name = "channel", required = true)
        protected String channel;
        @XmlAttribute(name = "additionalData")
        protected String additionalData;

        /**
         * Obtiene el valor de la propiedad userID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Define el valor de la propiedad userID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserID(String value) {
            this.userID = value;
        }

        /**
         * Obtiene el valor de la propiedad credentials.
         * 
         * @return
         *     possible object is
         *     {@link RequestHeader.Consumer.Credentials }
         *     
         */
        public RequestHeader.Consumer.Credentials getCredentials() {
            return credentials;
        }

        /**
         * Define el valor de la propiedad credentials.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestHeader.Consumer.Credentials }
         *     
         */
        public void setCredentials(RequestHeader.Consumer.Credentials value) {
            this.credentials = value;
        }

        /**
         * Obtiene el valor de la propiedad code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Define el valor de la propiedad code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Obtiene el valor de la propiedad channel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Define el valor de la propiedad channel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannel(String value) {
            this.channel = value;
        }

        /**
         * Obtiene el valor de la propiedad additionalData.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalData() {
            return additionalData;
        }

        /**
         * Define el valor de la propiedad additionalData.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalData(String value) {
            this.additionalData = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="userCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "userCertificate",
            "userPassword"
        })
        public static class Credentials {

            @XmlElement(namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0")
            protected String userCertificate;
            @XmlElement(namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0")
            protected String userPassword;

            /**
             * Obtiene el valor de la propiedad userCertificate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserCertificate() {
                return userCertificate;
            }

            /**
             * Define el valor de la propiedad userCertificate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserCertificate(String value) {
                this.userCertificate = value;
            }

            /**
             * Obtiene el valor de la propiedad userPassword.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserPassword() {
                return userPassword;
            }

            /**
             * Define el valor de la propiedad userPassword.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserPassword(String value) {
                this.userPassword = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="consumerMessageId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timestamp"
    })
    public static class Message {

        @XmlElement(namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "messageId")
        protected String messageId;
        @XmlAttribute(name = "consumerMessageId")
        protected String consumerMessageId;

        /**
         * Obtiene el valor de la propiedad timestamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Define el valor de la propiedad timestamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Obtiene el valor de la propiedad messageId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageId() {
            return messageId;
        }

        /**
         * Define el valor de la propiedad messageId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageId(String value) {
            this.messageId = value;
        }

        /**
         * Obtiene el valor de la propiedad consumerMessageId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsumerMessageId() {
            return consumerMessageId;
        }

        /**
         * Define el valor de la propiedad consumerMessageId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsumerMessageId(String value) {
            this.consumerMessageId = value;
        }

    }

}
