/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:Joseph T. McQuigg
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        long code = Long.parseLong(args[0]);
        int oddcounter = 0;
        int evencounter = 0;

        do{
            long odd;
            odd = code % 10;
            oddcounter+= odd;
            code = code/10;
            
            long even;
            even = code % 10;
            evencounter += even;
            code = code/10;
        }while(code > 0); 
        
        evencounter = evencounter % 10;
        oddcounter = oddcounter % 10;
        evencounter = evencounter * 3;
        evencounter = evencounter % 10;
        System.out.println((evencounter + oddcounter) % 10);

    }
}