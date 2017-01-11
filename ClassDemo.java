//Set doesn't allow repetition so the arraylist is copied into set and then displayed the output
import java.util.*;
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(3);
		
		System.out.println(list);
		
	
		
		HashSet<Integer> a1 = new HashSet<Integer>();
		a1.addAll(list);
		
		
		System.out.println(a1);
	
		
	}

}
