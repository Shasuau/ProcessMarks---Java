import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ProcessMarks {

    // the below variables are used to count the times the Grades appear. 
    static int CountA = 0;
    static int CountB = 0;
    static int CountC = 0;
    static int CountD = 0;
    static int CountE = 0;
    static int CountF = 0;

    static void gradeDistn() { // gradeDistn method, to output the ammount the letter occure. 
        System.out.println("A: " + CountA);
        System.out.println("B: " + CountB);
        System.out.println("C: " + CountC);
        System.out.println("D: " + CountD);
        System.out.println("E: " + CountE);
        System.out.println("F: " + CountF);
    }
// the below method turns the array of number into the letter grades, it also adds to the count of the letters for the gradeDistn() method. 
    public static char[] grades(int[] marks){
        int[] bounds = {90,75,60,50,45}; // set the bounds for the Grades such as A lower bound of 90. 
        char[] grades = new char[marks.length];
        for(int i=0; i<marks.length; i++){
        if(marks[i] >= bounds[0]){
        grades[i] = 'A';
        CountA = CountA + 1;
        } 
        else if(marks[i]<bounds[0] && marks[i]>=bounds[1]){ // use the bounds to assign letter grades 
        grades[i] = 'B'; // assign letter grades 
        CountB = CountB + 1; // increase letter counts for GradeDistn(). 
        }
        else if(marks[i]<bounds[1] && marks[i]>=bounds[2]){
        grades[i] = 'C';
        CountC = CountC + 1;
        }
        else if(marks[i]<bounds[2] && marks[i]>=bounds[3]){
        grades[i] = 'D';
        CountD = CountD + 1;
        }
        else if(marks[i]<bounds[3] && marks[i]>=bounds[4]){
        grades[i] = 'E';
        CountE = CountE + 1;
        }
        else if(marks[i] <= bounds[4]){
        grades[i] = 'F';
        CountF = CountF + 1;
        }
        }
        return grades;
        }

    static int Mode(int[] is, int n) { // Used to establish the mode of the array of marks.
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
               if (Marks.getMarks()[j] == Marks.getMarks()[i])
               ++count;
            }
   
            if (count > maxCount) {
               maxCount = count;
               maxValue = Marks.getMarks()[i];
            }
         }
         return maxValue;
    }

     public static void main(String[] args) {

    // TestMarks - Create the array of random Marks. Code was provided by Marks.java
    int[] testMarks = Marks.getMarks();
		for (int n = 0; n < testMarks.length; n++) {
			System.out.print(testMarks[n] + " ");
			if (n % 10 == 9)
				System.out.println();       
        }
    System.out.println(); // blank line for formating. 

   IntSummaryStatistics stats = Arrays.stream(Marks.getMarks()).summaryStatistics(); // Use java util to get stats of array. 

   System.out.println("The Maximum Mark for the class is: " + stats.getMax()); // Output the Maximum marks 
   System.out.println("The Minimum Mark for the class is: " + stats.getMin()); // Output the minimum mark.
   
   // Get the range of the array
   int Max = stats.getMax(); // store the maximum Mark
   int Min = stats.getMin(); // Store the Minimum Mark 
   int Range = Max - Min;
   System.out.println("The range of the marks is: " + Range); // show the range of the marks. 

   System.out.println("The average of the calss is: " + stats.getAverage()); // Get the avereage of the marks 

   // Get the Median of the marks 
   Arrays.sort(Marks.getMarks());
   Double Median;
   if (Marks.getMarks().length % 2 == 0)
    Median = ((double)Marks.getMarks()[Marks.getMarks().length/2] + (double)Marks.getMarks()[Marks.getMarks().length/2 -1]/2); // provide the median if number is even
   else 
    Median = (double) Marks.getMarks()[Marks.getMarks().length/2]; // provide median if number is odd. 

    System.out.println("The Median of the marks is: " + Median); // Print a line for the Median 

    int n = Marks.getMarks().length; // Create the N Variable for the Mode method.
    System.out.println("The Mode for the class is: " + Mode(Marks.getMarks(),n)); // Print a line for the mode. 

    int [] marks = Marks.getMarks(); // allow marks to equal getMarks values for chracters. 
    System.out.println();
    System.out.println("the grades are :");
    char[] grades = grades(marks);
    for(int i=0; i<grades.length; i++){
    System.out.print(grades[i]+" ");
    if(i%10 == 9){
    System.out.println(); // show the output of Numbers as letters 
    }
   }
   System.out.println(); // Blank line for formating.
   gradeDistn();// Call the gradeDistn() methode to show letter count. 
 }  
 
}


    


        

        
    
 
 

        
        
    
    



