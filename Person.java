
public class Person extends NameHolder {
	private String lastName;
	
	public Person() throws NameException
	{
		String temp1 = "Bo";
		String temp2 = "Alex";
		lastName = temp1;
		super.setFirstName(temp2);
	}
	
	public Person (String firstName, String lastName) throws NameException
	{
		super.setFirstName(firstName);
		
		this.lastName = lastName;
	}

	@Override
	public String describeSelf() {
		String description = "First Name: " + super.getFirstName()
				+ "Last name: " + lastName;
		return description;

	}
	
	protected String getLastName()
	{
		return new String (lastName);
	}

}
