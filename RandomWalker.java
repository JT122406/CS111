import javax.lang.model.util.ElementScanner6;

/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:Joseph T. McQuigg
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

    // WRITE YOUR CODE HERE

    int n = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    System.out.println("(0,0)");

    for(int i = 0;i < n;i++){
        int direction = (int) Math.ceil(Math.random() * 4);
        if(direction == 1)
        y++;
        else if(direction == 2)
        y--;
        else if(direction == 3)
        x++;
        else if(direction == 4)
        x--;
    System.out.println("(" + x + "," + y + ")");    
    } 
    System.out.println(((double)(Math.pow(x, 2)+Math.pow(y, 2))));
    





    
    }
}
