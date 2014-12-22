
public class ReverseMyName {

	public static void main(String[] args) {
		
		
		String str = "vijaya";
	    char[] arr = str.toCharArray();
	    char[] reversedarr = new char[6];
 		for (int i = arr.length-1; i >= 0; i--) {
			reversedarr[i] = arr[i];
			System.out.print(reversedarr[i]);
		}
   	}

}
