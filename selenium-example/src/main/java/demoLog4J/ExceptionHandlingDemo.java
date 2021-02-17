package demoLog4J;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		
	} 
	
	public static void ExceptionHandling() {
		try {
			System.out.println("ExceptionHandling");
			int i = 1/0; 
			System.out.println("Completed");
		}
		catch(Exception exp) {
			System.out.println("catch 1");
			System.out.println("Erornya : " + exp.getMessage()); 
			System.out.println("Penyebabnya : " + exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("done");
		}
	}

}
