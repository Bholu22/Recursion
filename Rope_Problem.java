public class Rope_Problem {
	static int getmax(int n, int a, int b, int c){
		if(n<0)
			return -1;
		if(n==0)
			return 0;
		int ca=getmax(n-a,a,b,c);
		int cb=getmax(n-b,a,b,c);
		int cc=getmax(n-c,a,b,c);
		int result=max(ca,cb,cc);
		if(result==-1)
			return -1;
		else
			return  result+1;
	}
	static int max(int x, int y, int z){
		int max=x;
		if(y>max)
			max=y;
		else if(z>max && z>y)
			max=z;
		
		return max;
	}
	public static void main(String args[]){
		int n=5, a=4, b=6, c=3;
		System.out.println(getmax(n,a,b,c));
	}
}