package hashSetPractice;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> l2 = new HashSet<>();
		l2.add("あんこ");
		l2.add("うぐいす");
		l2.add("あんこ");
		l2.add("チョコレート");
		System.out.println(l2);
		System.out.println(l2.size());
		l2.remove("あんこ");
		System.out.println(l2);

	}

}
