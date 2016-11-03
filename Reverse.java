/**
 * leetcode 344. Reverse
 * Created by fusama on 16/11/2.
 */
public class Reverse {

	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		System.out.print(reverse.reverseString("String"));
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
