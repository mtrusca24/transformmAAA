package expresion;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class euuu {

	public static void main(String[] args) throws Exception {
	
		CamelContext context=new DefaultCamelContext();
		
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				
				//from("direct:a")
			   // .marshal(new ReverseDataFormat())
			  //  .log("${body}");
			///	
			}
			
		});
		
		// am sters ce am scri sin master
		// ce facem aici
		
		context.start();
		
		ProducerTemplate template=context.createProducerTemplate();
		
		template.sendBody("direct:a", "marius");
		
		context.stop();
		
		
	}
	

}
