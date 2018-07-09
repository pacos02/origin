package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class helloENSMAMain {
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost/rest/").port(9992).build();
	}
	public static final URI Base_URI = getBaseURI();

	public static void  main(String[] args) {
	ResourceConfig rc=new ResourceConfig();
	rc.packages("soa.jaxrslabs.helloensmarestwebserviceexercice1");
	try {
		HttpServer server=GrizzlyHttpServerFactory.createHttpServer(Base_URI, rc);
		server.start();
		System.out.println(String.format("jersey app", Base_URI, Base_URI));
		System.in.read();
		server.shutdown();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
