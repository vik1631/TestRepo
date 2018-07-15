import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestWhat {

	public static void main(String[] args) {
		int[] arr= {45, 65, 55, 75, 55 ,85, 65};
		
		List<int[]> list=Arrays.asList(arr);
		
		Set<int[]> set=new HashSet<int[]>(list);
		
	for(Object i:set) {
		System.out.println(i);
		System.out.println("test");
	}
	}
	
	
}
