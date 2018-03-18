package expresion;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class Main {

	public static void main(String[] args) throws Exception {
	
		System.out.println("firstchange");
		System.out.println("alooaa");

		System.out.println("inca unaaaaaaaabbbcggkkkkkkkk");

		System.out.println("inca unaaaaaaaabbbcggkkkkkkkk");
		System.out.println("modificare in main");
	        System.out.println("modifiacare in main dingithug");
		CamelContext context=new DefaultCamelContext();
		
		//context.addRoutes(new Ex1RouteBuilder());
		
		System.out.println("exalto bahh");
		
		System.out.println("ultima modificare in elcispe");
		System.out.println("alaaa");
		System.out.println("red");
		System.out.println("green");
			System.out.println("a doua modficare");
		System.out.println("a 40 modificare pe git");
		System.out.println("seara");
		System.out.println("a 40 modificare pe git");
		System.out.println("aaaaa");
		System.out.println("bb");//tare
		System.out.println("zzzzz");//tare
		System.out.println("cccccc");//f
		context.start();
		
		ProducerTemplate template=context.createProducerTemplate();
		template.sendBody("direct:start", "mariuys");//cico
		template.sendBody("direct:start", "mariuys");//cico animal si caine si elefant si taxaalooocccccccc
		template.sendBody("direct:start", "mariuys");//cico animal si caine si elefant si taxaaloooaaaaaaaaaaaaahaia
		System.out.println("eu sunt in franta si italia si suedia si norvegiaqqqqq   www");
		Thread.sleep(2000);
		
		context.stop();
		

	}

}
