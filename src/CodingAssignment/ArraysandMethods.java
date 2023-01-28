package CodingAssignment;

public class ArraysandMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Question 1
        int[] ages = new int[8];  // adding a new age of 74 as the last element.
        ages[0] = 3;
        ages[1] = 9;
        ages[2] = 23;
        ages[3] = 64;
        ages[4] = 2;
        ages[5] = 8;
        ages[6] = 28;
        ages[7] = 93;
        //ages[8] = 74;
        
       
        int difference = ages[ages.length-1] - ages[0];
        	System.out.println ( "last element - first element = " + difference );
            	
        	
        	//Average calculations
        double sum = 0;
        	
        for (int age : ages) {
        	sum += age;
        }
         double average = sum / ages.length;
         System.out.println( "Average age = " + average); 
	
	//Question 2
	
	// String array names
	
	 String [] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; 
	 
	 double totalLetters = 0.0;
	 
	 for (int i = 0; i < names.length; i++) {
		 totalLetters += names[i].length();
	 }
	  
	  double averageLetters =  totalLetters/ names.length;
	  System.out.println("Average letter per name = " + averageLetters);  
	  
	  
	  //concatenate all names and print to the console
	  
	  for (int i= 1; i <= 1; i++) {
      System.out.println( names[names.length-1] + " " + names[names.length-2] + " " + names[names.length-3] + " " + names[names.length-4] + " " + names[names.length-5] + " " + names[names.length-6] );
	  }
	  //Question 3
	  // To access the last element of an array use : array[array.lengtg-1] 
	  
	  //Question 4
	  // To access the first element of an array use : array[0]
	  
	  //Question 5
	    int[] nameLengths = new int[names.length]; 
	    for (int i= 0; i < nameLengths.length; i++ )
	    {
	  
		
			nameLengths[i]= names[i].length();
	    }
	  //Question 6
	    
	   int sumOfNameLengths = 0;
	   for ( int nameLength : nameLengths) {
	     sumOfNameLengths += nameLength;
	    
	   }
	   System.out.println(sumOfNameLengths);
	  //Question 7 Write a method
	    
	  System.out.println(createWordNtimes("Hi", 3));
	  
	//Question 8 Write a method to return a full name
	  
	  System.out.println(createFullName("Joviale", "Uwase"));
	  
		
	// 9.	Write a method that takes an array of int and returns true if the sum is 100
	   
	 
	  
	  System.out.println ( addNumbersInTheArray(ages));
	  
	// Question 10. Question 10: method that takes an array of double and returns the average 
	  
	  double [] grades = { 34, 41, 37, 50, 39, 49 }; //new array of doubles created.
	  
	  System.out.println(createAverageGrades(grades)) ;
	  
	  
	// Question 11. Write a method to compare two arrays
	  
	  double [] counts = { 12, 67, 22, 24, 90, 21 }; 
	  
	  System.out.println(createAverageCounts(counts)) ;
			  
	  System.out.println( FindWhichAverageIsBigger(grades,counts));
	  
	// Question 12: method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
	  
	  boolean isHotOutside = true;
	  double moneyInPocket = 19.5; 
	  
	  System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

	// 13.	Create a method of your own that solves a problem. I created a method to tell me if it is extremely cold or not.
	  
	  int temperatureinF = -10;
	  boolean isColdOutside = true; 
	  
	  System.out.println(weatherNotification(temperatureinF,isColdOutside));
	  
	  
	  
	  
	}
	
	
	
	
	//Question 7 Write a method
	private static String createWordNtimes( String word, int n) {
		
		String answer = "";
		for (int i = 0; i < n; i++) {
			answer+= word;
		}
		return answer;
	}
	
	//Question 8 Write a method to return a full name
	
	private static String createFullName( String FirstName, String LastName) {
		
		return FirstName + " " + LastName;
	   }
	
	//9.	Write a method that takes an array of int and returns true if the sum is 100
	
	
      private static boolean addNumbersInTheArray( int numbers[]) {
		
    	  int sum = 0;
    	  
    	  for (int number : numbers) {
    		  
    		  sum += number;
    	  }
    	  
    	  if (sum > 100) {
    		  return true;
    	  } else {
    		  return false; 
    	  }

   }
      //Question 10: method that takes an array of double and returns the average 
      private static double createAverageGrades( double[] grades) {
  		
    	  int sum = 0;
    	  
    	  for (double grade : grades) {
    		  
    		  sum += grade;
    	  }
    	  
    	  return sum / grades.length; 
 }
      
   // Question 11. Write a method to compare two arrays
      
      
       private static double createAverageCounts( double[] counts) {
  		
    	  int sum = 0;
    	  
          for ( double count : counts) {
        	  sum += count;
        	  
          }
        	 return sum / counts.length;
         }
         
       
       private static boolean FindWhichAverageIsBigger( double[] x , double [] y) {
     		
     	  double average1 = createAverageGrades(x);
     	  double average2 = createAverageCounts(y);
     	  
     	  if (average1 > average2) {
     		  return true;
     	  }else {
     		  return false;
     	  }
     	  }
       // Question 12: method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
 
       private static boolean willBuyDrink( boolean x , double y) {

       if ( (x = true) &&  (y > 10.5) ) {
        	
          return true;
        } else {
        	
        	return false;
        }
 }

      // Question 13: Create a method of your own that solves a problem. 
       
       
       private static String weatherNotification (int x , boolean y) {
    	   
    	   String weather = "it is extremely-cold"; 
    	   String weather1 = "it's cold outside"; 
    	  
           if ( (x < 0 && x > -32) && ( y = true) ) {
            	 return weather;
            
           } else {
        	    return weather1;
           }
            
     
}
     
}
    
 
      

		
      
	


     
	

	 
      
          
         
    	    	

	

 