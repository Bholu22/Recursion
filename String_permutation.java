public class String_permutation
{
     private void permute(String str, int l, int r){
        if(l==r){
            System.out.println(str);
        }
        else{
            for(int i=l;i<r;i++){
            str=swap(str,l,i);
            permute(str,l+1,r);
            str=swap(str,l,i);
            }
    }
     }
     public String swap(String str,int i,int j){
        char ch[]=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
	public static void main(String[] args) {
	    String str="abhi";
	    int n=str.length()-1;
	    String_permutation ob=new String_permutation();
	    ob.permute(str,0,n);
	}
}
