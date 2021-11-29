/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:Joseph T. McQuigg
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        
    int largest =  Integer.parseInt(args[0]);
    for(int i = 1; i < args.length; i++){
        if(largest < Integer.parseInt(args[i])){
            largest = Integer.parseInt(args[i]);
        }
    }
    System.out.println(largest);








    }
}