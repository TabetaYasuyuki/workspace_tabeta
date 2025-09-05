package javaPractice2_1;

public class Main {

	public static void main(String[] args) throws Exception, Error{
		Top[] array = {new Top(),new Bottom()};
		for (Top t : array) {
			t.showInfo();
			t.print();
			System.out.println(t.value + ":");
		}
		

	}

}

class Top {
	int value = 10;
	String name = "top";
	static void showInfo() {
		System.out.println("T");
	}
	void print() {System.out.println(name);}

}
class Bottom extends Top{
	int value = 90;
	String name = "bottom";
	static void showInfo() {
		System.out.println("B");
	}
	void print() {
		System.out.println(name);
	}
}
