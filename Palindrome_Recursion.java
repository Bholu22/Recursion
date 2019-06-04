public class Palindrome_Recursion{
	static boolean palindrome(char ch[],int l, int r){
		if(l==r)
			return true;
		if(ch[l]!=ch[r])
			return false;
		
		if(l<r+1){
			palindrome(ch,l+1,r-1);
		}
		return true;
	}
	public static void main(String args[]){
		String str="malayalam";
		char ch[]=str.toCharArray();
		int n=ch.length;
		System.out.println(palindrome(ch,0,n-1));
	}
}