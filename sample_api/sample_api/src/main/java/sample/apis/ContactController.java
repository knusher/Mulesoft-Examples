package sample.apis;

public class ContactController {
	
	public Contact getContact(String cName)
	{
		//This if block simulates a check for an id.  Real code would be called here
		if (cName.equals("name"))
			{
					System.out.println("Returning new Contact Object");
					return new Contact();
			} else
			{
				System.out.println("Returning null");
				return null;
			}
	}

}
