
package es.trapasoft.jaxws.servicio.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.trapasoft.jaxws.servicio.cliente package. 
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

    private final static QName _GetPersona_QNAME = new QName("http://servicio.jaxws.trapasoft.es/", "getPersona");
    private final static QName _GetPersonasByDeptResponse_QNAME = new QName("http://servicio.jaxws.trapasoft.es/", "getPersonasByDeptResponse");
    private final static QName _GetPersonaResponse_QNAME = new QName("http://servicio.jaxws.trapasoft.es/", "getPersonaResponse");
    private final static QName _GetPersonas_QNAME = new QName("http://servicio.jaxws.trapasoft.es/", "getPersonas");
    private final static QName _GetPersonasResponse_QNAME = new QName("http://servicio.jaxws.trapasoft.es/", "getPersonasResponse");
    private final static QName _GetPersonasByDept_QNAME = new QName("http://servicio.jaxws.trapasoft.es/", "getPersonasByDept");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.trapasoft.jaxws.servicio.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonasByDeptResponse }
     * 
     */
    public GetPersonasByDeptResponse createGetPersonasByDeptResponse() {
        return new GetPersonasByDeptResponse();
    }

    /**
     * Create an instance of {@link GetPersona }
     * 
     */
    public GetPersona createGetPersona() {
        return new GetPersona();
    }

    /**
     * Create an instance of {@link GetPersonaResponse }
     * 
     */
    public GetPersonaResponse createGetPersonaResponse() {
        return new GetPersonaResponse();
    }

    /**
     * Create an instance of {@link GetPersonasResponse }
     * 
     */
    public GetPersonasResponse createGetPersonasResponse() {
        return new GetPersonasResponse();
    }

    /**
     * Create an instance of {@link GetPersonas }
     * 
     */
    public GetPersonas createGetPersonas() {
        return new GetPersonas();
    }

    /**
     * Create an instance of {@link GetPersonasByDept }
     * 
     */
    public GetPersonasByDept createGetPersonasByDept() {
        return new GetPersonasByDept();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.jaxws.trapasoft.es/", name = "getPersona")
    public JAXBElement<GetPersona> createGetPersona(GetPersona value) {
        return new JAXBElement<GetPersona>(_GetPersona_QNAME, GetPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonasByDeptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.jaxws.trapasoft.es/", name = "getPersonasByDeptResponse")
    public JAXBElement<GetPersonasByDeptResponse> createGetPersonasByDeptResponse(GetPersonasByDeptResponse value) {
        return new JAXBElement<GetPersonasByDeptResponse>(_GetPersonasByDeptResponse_QNAME, GetPersonasByDeptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.jaxws.trapasoft.es/", name = "getPersonaResponse")
    public JAXBElement<GetPersonaResponse> createGetPersonaResponse(GetPersonaResponse value) {
        return new JAXBElement<GetPersonaResponse>(_GetPersonaResponse_QNAME, GetPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.jaxws.trapasoft.es/", name = "getPersonas")
    public JAXBElement<GetPersonas> createGetPersonas(GetPersonas value) {
        return new JAXBElement<GetPersonas>(_GetPersonas_QNAME, GetPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.jaxws.trapasoft.es/", name = "getPersonasResponse")
    public JAXBElement<GetPersonasResponse> createGetPersonasResponse(GetPersonasResponse value) {
        return new JAXBElement<GetPersonasResponse>(_GetPersonasResponse_QNAME, GetPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonasByDept }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.jaxws.trapasoft.es/", name = "getPersonasByDept")
    public JAXBElement<GetPersonasByDept> createGetPersonasByDept(GetPersonasByDept value) {
        return new JAXBElement<GetPersonasByDept>(_GetPersonasByDept_QNAME, GetPersonasByDept.class, null, value);
    }

}
