import java.util.*;
import java.util.stream.*;

class StreamApi{
public static void main(String args[]){

	List<Integer> number = Arrays.asList(2,3,4,5);
	List<Integer> nums = new ArrayList<Integer>();
	Scanner scn = new Scanner(System.in);

	for(int j =0; j< 4; j++) {
		nums.add(scn.nextInt());
	}
	System.out.println(nums);
	
	List<Integer> square = number.stream().map(x -> x*x*x).collect(Collectors.toList());
	System.out.println(square);

	List<String> names = Arrays.asList("Arman","Salman","Farhan");

	List<String> result = names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
	System.out.println(result);

	List<String> show = names.stream().sorted().collect(Collectors.toList());
	System.out.println(show);


	List<Integer> numbers = Arrays.asList(2,3,4,5,2);


	nums.stream().filter(x->x%2==0).forEach(System.out::println);

	
	}
}

