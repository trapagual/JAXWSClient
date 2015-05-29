package es.trapasoft.jaxws.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import es.trapasoft.jaxws.servicio.cliente.PersonService;
import es.trapasoft.jaxws.servicio.cliente.PersonServiceService;
import es.trapasoft.jaxws.servicio.cliente.Persona;

public class Probador {

	public static void main(String[] args) {

		URL url;
		QName qname;
		
		try {
			url = new URL("http://localhost:8080/JAXWSServer/persons?wsdl");
			qname = new QName("http://trapasoft.es/servicio", "PersonServiceService" );
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		PersonServiceService pss = new PersonServiceService();
		PersonService proxy = pss.getPersonServicePort();
		
		Persona este = proxy.getPersona(26);
		
		System.out.println("============================= GET PERSONA =============================");
		System.out.println("ID: "+este.getID());
		System.out.println("Nombre:   "+este.getFirstName());
		System.out.println("Apellido: "+este.getLastName());
		System.out.println("Ciudad:   "+este.getCity());
		System.out.println("============================= GET PERSONA =============================");
		
		List<Persona> estos = proxy.getPersonas("es");
		System.out.println("============================= GET PERSONAS apellido =============================");
		for (Persona e : estos) {
			
			System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getCity());
		}
		System.out.println("============================= GET PERSONAS apellido =============================");

		List<Persona> losotros = proxy.getPersonasByDept(111);
		System.out.println("============================= GET PERSONAS depto =============================");
		for (Persona e : losotros) {
			System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getCity());
		}
		System.out.println("============================= GET PERSONAS depto =============================");
		
		
		
	}

}
