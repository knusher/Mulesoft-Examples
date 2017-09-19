package sample.apis;

//Simple class to represent a Contact DTO
public class Contact {
	private String name;
	
	public Contact()
	{
		name = "kyle";
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "\"name\"" + "\"" + this.name + "\"";
	}

}
