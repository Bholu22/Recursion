public class String_Powerset{
	static void powerset(String str, int index, String curr){
		int n=str.length();
		if(index==n){
			System.out.println(curr);
			return;
		}
		powerset(str,index+1,curr+str.charAt(index));
		powerset(str,index+1,curr);
		
	}
	public static void main(String args[]){
		String str="abhi";
		String curr="";
		int index=0;
		powerset(str,index,curr);
	}
}