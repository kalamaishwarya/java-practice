//Write a Java program to check if a given number is a palindrome or not. A number is a palindrome if it remains the same when its digits are reversed.
   

public class Palindrome{
	public static void main(String args[]){
		int x= 121;
		int reverse=0;
		int org=x;
		while (x>0){
			int digit =x%10;
			reverse = reverse*10 +x;
			x=x/10;
		}
		if (org==reverse){
     			System.out.println(org+" is a palaindrom number");
		}
		else {
			System.out.println(org+"is not palaindrom number");
		}
	}
}
