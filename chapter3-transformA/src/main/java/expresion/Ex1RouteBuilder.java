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
						//jhai maaa
						//nuu
						//incercare mah
						// helooooworld
						//al doilea commit
						//al treilea commit
						//doi
						//trei
						//al treilea commit
						
						// capatane
						//hei haiducuu
						String reverse=arg0.getIn().getBody(String.class);
						System.out.println(" Marius's way");
						System.out.println(" Jesus's way");
						System.out.println(" God's way");
						System.out.println("your way");
						System.out.println("bahhhhhhhhhhhhhhhhhhhhhhhhhhh");
						System.out.println("bahhhh");
						System.out.println("aloo");
						System.out.println("ce face mah");
						System.out.println("casa");
						System.out.println();
						System.out.println("asdsa");
						System.out.println("masina");
						System.out.println("marius");
						System.out.println("maria");
						System.out.println("bahhhhhhhhhhhhhhhhhhhhhhhhhhh");
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
						
System.out.println("turciaaaa ia bataieeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
System.out.println("bahhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaa");
						System.out.println("turciaaaa ia bataieeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
						System.out.println("bahhhhhhhhhhhhhhhhhhhhhhhhhhh");
						
						System.out.println("bahhhhhhhhhhhhhhhhhhhhhhhhhhh");

						System.out.println("franta ia bataie");
                                                System.out.println("3");
						System.out.println("finia bataie");
						System.out.println("alooo");
                        //alooooooooooooooooooooooooooooooo
						//bbbbbbbbbbbbbbb
                        //alooooooooooooooooooooooooooooooo
						//dd
						
						//ee
						//ff
						//gg
						//hh
						//kk
						System.out.println("alooo");
						System.out.println("alooo");
						System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqlooo");
							System.out.println("prima modificare pe git");
							System.out.println("eu");
						System.out.println("a 90 modificare pe git");
						System.out.println("neata");
						System.out.println("zi");
						System.out.println("a 40 modificare pe git");////casa//mare//gggg
						System.out.println("11111111111111ificare pe git");////casa//mare//gggg
						System.out.println("a vvvvvvvvv0 modificare pe git");////casa//mare//gggg
						System.out.println("a vvvvvvvvv5 modificare pe git");////casa//mare//gggg
						System.out.println("a vvvvvvvvv2 modificare pe git");////casa//mare//gggg
						System.out.println("sunt aici si acolo hhhh wwwaaabb ");
						System.out.println("sunt aici si acolo hhhh wwwaaaddd q");
						System.out.println("sunt aici si acolo hhhh wwwaaaddd wqqqq");
						return (T) new StringBuilder(reverse).reverse().toString();//tuu si Roxanaaaaaaqqq
					}
				}
				
				
				)
		
		
		.to("file:aici");
		
		
	}

}
