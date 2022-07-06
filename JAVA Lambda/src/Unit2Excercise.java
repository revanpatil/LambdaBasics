import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit2Excercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dicness",45),
				new Person("Lewis","Caroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charolette","Brones",49),
				new Person("Mathew","Arnold",65)
				);
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println("Printing all persons");
		
		printAll(people);
		printConditionally(people, p -> p.getLastName().startsWith("C"));

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p: people){
			System.out.println(p);
		}
		
	}
	
	interface Condition{
		boolean test(Person p);
	}

}
