package arrayPractice;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] str = {"茨城","栃木","群馬","埼玉"};
		
		List<String> list1 = Arrays.asList(str);
		List<Integer> list2 = Arrays.asList(5,3,77);
		System.out.println(list1);
		System.out.println(list2);
		list1.set(0, "東京");
		System.out.println(list1);
		//System.out.println(list1.remove("東京"));
		
		List<Integer> list3 = List.of(1,2,3);
		System.out.println(list3);
		//list3.set(0, 5);

	}

}
