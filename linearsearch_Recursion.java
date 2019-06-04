public class linearsearch_Recursion{
	static boolean search(int arr[],int l,int r,int x){
		if(l>r)
			return false;
		if(arr[l]==x)
			return true;
		if(arr[r]==x)
			return true;
		
		return	search(arr,l+1,r-1,x);
			 
	} 
	public static void main(String args[]){
		int arr[]={11,22,33,44,55,66,77,88};
		int n=arr.length-1;
		System.out.println(search(arr,0,n,99));
	}
}