package ex04.quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("computer-context.xml");
		
		Computer com = ctx.getBean("computer", Computer.class);
		
		com.computerInfo();

	}

}
