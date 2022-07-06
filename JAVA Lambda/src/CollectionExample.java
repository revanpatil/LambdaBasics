import java.util.Arrays;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dicness",45),
				new Person("Lewis","Caroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charolette","Brones",49),
				new Person("Mathew","Arnold",65)
				);
		
		System.out.println("for loop");
		for(int i=0;i<people.size();i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("for each loop");
		for(Person p :people){
			System.out.println(p);
		}
		
		System.out.println("for each loop");
		people.forEach((p)->System.out.println(p));
	}

}
