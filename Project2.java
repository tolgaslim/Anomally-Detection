
public class Project2 {
	
	// Standart Deviation Method
	public static double SD(double numArray[]){
        
		
		double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        double mean = mean(numArray);

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    
	// Mean Method
	public static double mean(double[] m) {
	    double sum = 0;
	    for (int i = 0; i < m.length; i++) {
	        sum += m[i];
	    }
	    return sum / (double)m.length;
	}
	
	
	
	public static double[] subsarr(double[] f , double[] s){
		double[] result = new double[s.length]; // we created an empty array
		int w = f.length-s.length; // then we get the length difference
		for(int i=0;i<s.length;i++) {
			result[i] = f[i+w]-s[i]; // we subtract one array from the other
		}
		
		return result;
	}
	
	
	
	
	
	// Moving Average Method
	public static double[] movingAverage(double[] arr ,int window){
		double[] movingAverage=new double[arr.length-window];
		for(int i=0; i<arr.length-window; i++) { 
			double[]temp = new double [window];
			int z=i;
			for(int k=0; k<window; k++) {
				temp[k]=arr[z];
				
			}
		movingAverage[i]=Project1.mean(temp);
		}
		return movingAverage;
	}
	 
	}
    
	
	




















