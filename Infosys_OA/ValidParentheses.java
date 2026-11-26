import java.util.*;
import java.lang.*;
import java.io.*;

class ValidParentheses
{
    public static long solution(String s,long a, long b){
        long total = 0;
        
		int open = 0;
		
		for(int i = 0; i<s.length(); i++){
		    
		   char ch = s.charAt(i);
		   
		   if(ch == '('){
		       
		       open++;
		       total += b;
		       
		   } else if(ch == ')'){
		       
		       if(open == 0){
		           total += a;
		          
		       }else{
		            open--;
		            total -= b;
		       }
		   }
		    
		}
		return total;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String s = "())(()";
		long a = 2, b = 3;
		
        System.out.print(solution(s,a,b));
		    
	}
}
