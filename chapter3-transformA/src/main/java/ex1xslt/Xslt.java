package ex1xslt;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class Xslt {

	public static void main(String[] args) throws Exception {
	CamelContext context=new DefaultCamelContext();
	
		
		
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				
				
				from("file:src/data?noop=true")
				.to("xslt://camelinaction/transform.xsl")
				.to("file:eu");
        
               // ala ca sazpaap
				
	}
			
			
			
		});
		
			
			context.start();
	        Thread.sleep(2000);

	        // stop the CamelContext
	        context.stop();
		

	}

}
