package expresion;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class Main {

	public static void main(String[] args) throws Exception {
	
		System.out.println("firstchange");
		System.out.println("aloo");
		CamelContext context=new DefaultCamelContext();
		
		context.addRoutes(new Ex1RouteBuilder());
		
		
		context.start();
		
		ProducerTemplate template=context.createProducerTemplate();
		template.sendBody("direct:start", "mariuys");
		
		Thread.sleep(2000);
		
		context.stop();
		

	}

}
