/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author:Joseph T. McQuigg
 *
 *  That takes two double command-line arguments temperature and velocity 
 *  and prints the wind chill (a double) according to the following:
 *
 *  w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) v^0.16
 *
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *
 *  Assume the inputs are valid values
 *
 *
 *************************************************************************/

public class WindChill {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    double Tempature = Double.parseDouble(args[0]);
    double Velocity = Double.parseDouble(args[1]);
    double windchill = 35.74 + (0.6215 * Tempature) + ((.4275 * Tempature) - 35.75)*(Math.pow(Velocity, .16));
    System.out.println(windchill);
    }
}
