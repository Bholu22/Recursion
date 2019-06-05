/*
 Given a sequence of numbers between [2-9],print all possible cobinations of words formed from
 mobile keypad have some digits associated with each key. 
*/
import java.util.*;
public class FindCombinations{
	static void combinations(List<List<? extends Object>> keypad,int[] input,String res,int index){
		if(index==-1)
		{
			System.out.println(res+" "); return;
		}
		int digit=input[index];
		int len=keypad.get(digit).size();
		for(int i=0;i<len;i++)
		   combinations(keypad,input,keypad.get(digit).get(i)+res,index-1);
	}
	
	public static void main(String args[]){
		List<List<? extends Object>> keypad = Arrays.asList(
				// 0 and 1 digit don't have any characters associated
				Arrays.asList(),
				Arrays.asList(),
				Arrays.asList( 'A', 'B', 'C' ),
				Arrays.asList( 'D', 'E', 'F' ),
				Arrays.asList( 'G', 'H', 'I' ),
				Arrays.asList( 'J', 'K', 'L' ),
				Arrays.asList( 'M', 'N', 'O' ),
				Arrays.asList( 'P', 'Q', 'R', 'S'),
				Arrays.asList( 'T', 'U', 'V' ),
				Arrays.asList( 'W', 'X', 'Y', 'Z')
		);

			
		int input[]={2,3,4};
		combinations(keypad,input," ",input.length-1);
		
					
	}
}