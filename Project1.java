/*resources:
https://www.programiz.com/java-programming/examples/standard-deviation
https://stackoverflow.com/questions/4191687/how-to-calculate-mean-median-mode-and-range-from-a-set-of-numbers
*/
/*
sddlfjgdsndlgbskjldbsfkbkjdfhlsjafdksafþak*/


import java.util.ArrayList;
import edu.princeton.cs.algs4.*;

public class Project1 extends Project2 {
	
        public static void main(String[]args) {
		
		
		
		In a = new In("messages.txt"); // First we get the data from messages.txt
		double [] messages=a.readAllDoubles(); // we put that data to a double array
		int window = 10;
		double[] c=Project1.movingAverage(messages,window); // we applied the moving average 
		double [] de_mean_messages=Project1.subsarr(messages,c); // we subtract the moving average from messages array
		
		double m=Project1.mean(de_mean_messages); // we find the mean of the array
		double std= Project1.SD(de_mean_messages); // we find the standard deviation of the array
		ArrayList<Integer> anomaly_days=new ArrayList<Integer>(); // we store anomaly days in integer array list
		
		for(int i=0; i<de_mean_messages.length;i++) { // we applied the sigma rule to the array and
			if((Math.abs(de_mean_messages[i]-m))>(3*std)) {
				anomaly_days.add(i+window); // find the anomalies and add them to the list
			}
		}
		
		for(int f:anomaly_days) {
			System.out.println(f); // then we print them
			
		}
	}
}
	    
	    


