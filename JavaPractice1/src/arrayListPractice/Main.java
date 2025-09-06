package arrayListPractice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("りんご");
		l1.add("なし");
		l1.add("みかん");
		l1.add("ぶどう");
		System.out.println(l1);
		l1.add(0,"もも");
		l1.add(null);
		System.out.println(l1);
		System.out.println(l1.set(1, "パッションフルーツ"));
		System.out.println(l1);
		
		System.out.println(l1.remove(0));
		System.out.println(l1);
		System.out.println(l1.remove("なし"));
		System.out.println(l1);
		System.out.println(l1.remove(null));
		System.out.println(l1);
		

	}

}
