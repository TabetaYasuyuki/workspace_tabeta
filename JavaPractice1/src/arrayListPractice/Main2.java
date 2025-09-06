package arrayListPractice;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		String[] s1 = {"千葉","滋賀","佐賀"};
		String[] s2 = {"千葉",new String("滋賀"),"佐賀"};
		System.out.println(Arrays.mismatch(s1,s2));
		System.out.println(Arrays.compare(s1, s2));

	}

}
