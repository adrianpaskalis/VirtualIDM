package demoLog4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	private static Logger logg = LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n coba lagi  \n");
		logg.trace("trace nih");
		logg.info("info message ");
		logg.error("eror nih"); 
		logg.warn("warning nih");
		logg.fatal("fatal nih");
		
		System.out.println("done");
	}

}
