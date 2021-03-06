
package es.trapasoft.jaxws.servicio.cliente;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://servicio.jaxws.trapasoft.es/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<es.trapasoft.jaxws.servicio.cliente.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonasByDept", targetNamespace = "http://servicio.jaxws.trapasoft.es/", className = "es.trapasoft.jaxws.servicio.cliente.GetPersonasByDept")
    @ResponseWrapper(localName = "getPersonasByDeptResponse", targetNamespace = "http://servicio.jaxws.trapasoft.es/", className = "es.trapasoft.jaxws.servicio.cliente.GetPersonasByDeptResponse")
    @Action(input = "http://servicio.jaxws.trapasoft.es/PersonService/getPersonasByDeptRequest", output = "http://servicio.jaxws.trapasoft.es/PersonService/getPersonasByDeptResponse")
    public List<Persona> getPersonasByDept(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns es.trapasoft.jaxws.servicio.cliente.Persona
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersona", targetNamespace = "http://servicio.jaxws.trapasoft.es/", className = "es.trapasoft.jaxws.servicio.cliente.GetPersona")
    @ResponseWrapper(localName = "getPersonaResponse", targetNamespace = "http://servicio.jaxws.trapasoft.es/", className = "es.trapasoft.jaxws.servicio.cliente.GetPersonaResponse")
    @Action(input = "http://servicio.jaxws.trapasoft.es/PersonService/getPersonaRequest", output = "http://servicio.jaxws.trapasoft.es/PersonService/getPersonaResponse")
    public Persona getPersona(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<es.trapasoft.jaxws.servicio.cliente.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonas", targetNamespace = "http://servicio.jaxws.trapasoft.es/", className = "es.trapasoft.jaxws.servicio.cliente.GetPersonas")
    @ResponseWrapper(localName = "getPersonasResponse", targetNamespace = "http://servicio.jaxws.trapasoft.es/", className = "es.trapasoft.jaxws.servicio.cliente.GetPersonasResponse")
    @Action(input = "http://servicio.jaxws.trapasoft.es/PersonService/getPersonasRequest", output = "http://servicio.jaxws.trapasoft.es/PersonService/getPersonasResponse")
    public List<Persona> getPersonas(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
