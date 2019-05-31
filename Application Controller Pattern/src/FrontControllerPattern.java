
public class FrontControllerPattern {

	 public static void main(String[] args)  
	    { 
	        FrontController frontController = new FrontController(); 
	        frontController.dispatchRequest("Family"); 
	        frontController.dispatchRequest("Personal"); 
	    } 
}
