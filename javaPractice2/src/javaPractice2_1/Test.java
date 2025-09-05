package javaPractice2_1;

public class Test {
	public String test(String... s) throws Exception{
		try {
			if(s[0].length()>0) {
				return "Hello "+s[0].toString();
			}else {
				return "Hello default";
			}
			//return s;
		
		}catch(IndexOutOfBoundsException  e) {
			return "Hello Error";
			
		}
		
	}

}
