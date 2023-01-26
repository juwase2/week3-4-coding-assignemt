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
	  
		
	}
	 
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
}	
     
	
	 
      
          
         
    	    	

	

 