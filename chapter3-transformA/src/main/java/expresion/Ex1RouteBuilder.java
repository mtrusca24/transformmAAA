package expresion;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;

public class Ex1RouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		
		from("direct:start")
		.transform(
				
				
				new Expression() {
					
					public <T> T evaluate(Exchange arg0, Class<T> arg1) {
						
						String reverse=arg0.getIn().getBody(String.class);
						System.out.println("bahhhh");
						System.out.println("ce face mah");
						System.out.println();
						System.out.println("asdsa");
						return (T) new StringBuilder(reverse).reverse().toString();
					}
				}
				
				
				)
		
		
		.to("file:aici");
		
		
	}

}
