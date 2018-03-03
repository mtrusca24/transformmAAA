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
						System.out.println("aloo");
						System.out.println("ce face mah");
						System.out.println("casa");
						System.out.println();
						System.out.println("asdsa");
						System.out.println("masina");
						System.out.println("marius");
						System.out.println("maria");
						
						System.out.println("albert");
						System.out.println("tomat");
						System.out.println("am modificat iar");
						System.out.println("modificare dupa git hub");
						System.out.println("o modicare in eclispe");
						System.out.println("exalton");
						System.out.println("bala");
						System.out.println("bluee");
						System.out.println("yellow");
						
						System.out.println("romania va castiga");
						
						System.out.println("turciaaaa ia bataie");
						
						
						

						return (T) new StringBuilder(reverse).reverse().toString();
					}
				}
				
				
				)
		
		
		.to("file:aici");
		
		
	}

}
