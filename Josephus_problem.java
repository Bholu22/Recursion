public class Josephus_problem{
	static int survivor(int n, int k){
		if(n==1){return 1;}
		return (survivor(n-1,k)+k-1)%n + 1;
	}
	public static void main(String args[]){
		int n=14, k=2;
		System.out.println(survivor(n,k));
	}
}