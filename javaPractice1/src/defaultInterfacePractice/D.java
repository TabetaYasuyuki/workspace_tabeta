package defaultInterfacePractice;

public class D extends C implements A,B{
	public void x() {
		B.super.x();
	}

}
