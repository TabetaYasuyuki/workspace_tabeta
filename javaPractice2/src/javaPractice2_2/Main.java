package javaPractice2_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*double[][] arr = {{0.1,0.2,0.3},{4,5,6}};
		for (double[] d : arr) {
			for (double dd: d) {
				System.out.print(dd+" ");
			}
		}
		
		for (var v : arr) {
			for (var w : v) {
				System.out.print(w +" ");
			}
		}
		*/
		var v = new ArrayList<>();
		v.add("Object");
		v.add(1);
		v.add(2.0);
		System.out.println(v);

	}

}
