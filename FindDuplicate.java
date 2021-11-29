/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:Joseph T. McQuigg
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		//WRITE YOUR CODE HERE
		boolean b = false;
		for(int index = 0;index < args.length;index++){
		
			for(int compare = 0; compare < args.length;compare++){
				if(compare == index){
					continue;
				}
				else if(Integer.parseInt(args[index]) == Integer.parseInt(args[compare]))
				{
					b = true;
					break;
				}
				else
				{
				continue;
				}
			}
			if(b == true)
			{
			break;
			}

			
		}


		System.out.println(b);
	}
}
