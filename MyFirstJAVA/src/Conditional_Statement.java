
public class Conditional_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* if something is true then I want to do this*/
		//  Conditional Operators = < >= <=  == !=
		// Operators:
		// Binary = +, -, *, /, %
		// Unary = ++, --, !
		
		
     int x = 100;
     int y = 200;
     int z = 300;
     
     if (y>x){
    	 System.out.println( ("y is greater than x"));
     }
     
     //if else
     
     if (y>x){
    	 System.out.println("Y is greater than x");
     } else{
    	 System.out.println("x is greater than y");
     } 
     
     if (x>y & x> z){
    	 System.out.println("x is the Greater!");//"&" this represent an operator sign e.g( < ,>, +, - , /)
     } else if (y>x & y>z){
    	 System.out.println("y is the greater!");
     }else{
    	 System.out.println("z is the greater!");
     }
    
     
	}

}
