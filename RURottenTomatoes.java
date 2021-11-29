/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:Joseph T. McQuigg
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int ratings[][] = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		int arg = 2;
		for(int i = 0;i<Integer.parseInt(args[0]);i++){
			for(int j = 0; j < Integer.parseInt(args[1]); j++){
				ratings[i][j] = Integer.parseInt(args[arg]);
				arg++;
			}
		}

		
		int sumhigh = 0;
		int runningsum = 0;
		int movieindex = 0;
		
		for(int movie= 0; movie<Integer.parseInt(args[1]); movie++)
		{
			for(int reviewer = 0; reviewer < Integer.parseInt(args[0]); reviewer++)
			{
				runningsum += ratings[reviewer][movie];
		

					if(runningsum > sumhigh)
					{
						sumhigh = runningsum;
						movieindex = movie;
					}
					
			
			}
			runningsum = 0;
		}

		System.out.println(movieindex);		
	}
}
