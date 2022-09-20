


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class Unit1Excercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dicness",45),
				new Person("Lewis","Caroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charolette","Brones",49),
				new Person("Mathew","Arnold",65)
				);
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}		
		});
		
		printAll(people);
		
		printLastNameBeginingWithC(people , new Condition(){

			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("C");
			}
			
		});

	}

	/*private static void printLastNameBeginingWithC(List<Person> people) {
		for(Person p : people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
			
		}
		
	}*/
	
	private static void printLastNameBeginingWithC(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p) == true){
				System.out.println(p);
			}
			
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
		
	}
	
	interface Condition{
		boolean test(Person p);
	}

}
