//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.10 a las 12:12:58 PM COT 
//


package com.spring.ws.ssl.client.demo1.ticketagent;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.ticketagent package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListFlightsRequest_QNAME = new QName("http://example.org/TicketAgent.xsd", "listFlightsRequest");
    private final static QName _ListFlightsResponse_QNAME = new QName("http://example.org/TicketAgent.xsd", "listFlightsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.ticketagent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TListFlights }
     * 
     */
    public TListFlights createTListFlights() {
        return new TListFlights();
    }

    /**
     * Create an instance of {@link TFlightsResponse }
     * 
     */
    public TFlightsResponse createTFlightsResponse() {
        return new TFlightsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TListFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/TicketAgent.xsd", name = "listFlightsRequest")
    public JAXBElement<TListFlights> createListFlightsRequest(TListFlights value) {
        return new JAXBElement<TListFlights>(_ListFlightsRequest_QNAME, TListFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/TicketAgent.xsd", name = "listFlightsResponse")
    public JAXBElement<TFlightsResponse> createListFlightsResponse(TFlightsResponse value) {
        return new JAXBElement<TFlightsResponse>(_ListFlightsResponse_QNAME, TFlightsResponse.class, null, value);
    }

}
