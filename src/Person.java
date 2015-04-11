public class Person
{
	private long personId;
	private String firstName;
	private String lastName;
	

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}
	
	public long getPersonId()
	{
		return this.personId;
	}

	public void setPersonId(long personId)
	{
		this.personId = personId;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
}