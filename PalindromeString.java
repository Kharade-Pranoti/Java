// Accept a string from the user. Check if the string is palindrome.
// If yes, then print "Yes" otherwise print "No"

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any word:");
		String input = sc.next();
		String reverse = "";
		
		for(int i=0; i<input.length(); i++) {
			String ch = input.substring(i, i+1);
			reverse = ch + reverse;
		}
		System.out.println(input.equals(reverse)? "Yes, it is palindrome" : "No, it's not palindrome");
		
		sc.close();

	}

}
