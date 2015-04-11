import com.google.gson.*;
public class MainClass
{
	public static void main(String[] args) {
		System.out.println("Executing from ant");
		Person person = new Person();
		person.setFirstName("Amit");
		person.setLastName("Bhoraniya");

		Gson gson = new Gson();
		System.out.println("String in JSON Format:"+gson.toJson(person));
		System.out.println("Executing end");
	}
}