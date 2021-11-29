/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:Joseph T. McQuigg
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

    // WRITE YOUR CODE HERE
    double least = Double.parseDouble(args[0]);
    int leastsub = 0;


    for(int i = 0; i < args.length; i++){
        if(Double.parseDouble(args[i]) < least){
            least = Double.parseDouble(args[i]);
            leastsub = i;
        }
    }
    double least2;

    if(leastsub == args.length -1){
        least2 = Double.parseDouble(args[leastsub - 1]);
    }
    else if(leastsub == 0)
    {
        least2 = Double.parseDouble(args[leastsub + 1]);
    }
    else
    {
        least2 = Double.parseDouble(args[leastsub +1 ]);
    }


    
    for(int i = 0; i < args.length; i++)
    {
        if (i == leastsub){
            continue;
        }
        else
        {
        if(Double.parseDouble(args[i]) < least2){
            least2 = Double.parseDouble(args[i]);
        }
        }
    }

    System.out.println(least);
    System.out.println(least2);
    }

}
