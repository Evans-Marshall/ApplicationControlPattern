
public class Dispatching {
	private FamilyView familyView; 
    private PersonalView personalView; 
     
    public Dispatching() 
    { 
    	familyView = new FamilyView(); 
    	personalView = new PersonalView(); 
    } 
  
    public void dispatch(String request) 
    { 
        if(request.equalsIgnoreCase("Personal")) 
        { 
            personalView.display(); 
        } 
        else
        { 
            familyView.display(); 
        }     
    } 
}
