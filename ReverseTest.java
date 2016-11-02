//leetcode 344
public class ReverseTest {

	public static void main(String[] args) {
		ReverseTest reverset=new ReverseTest();
		System.out.print(reverset.reverseString("String"));
	}
	
	    public String reverseString(String s) {
	        StringBuffer sb=new StringBuffer();
	        for (int i=s.length()-1;i>=0;i--)
	        {
	            sb.append(s.charAt(i));
	        }
	        return sb.toString();
	    }

}
