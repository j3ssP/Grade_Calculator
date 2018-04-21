
package lettergrade;
import java.util.Scanner; 

public class LetterGrade {

   
    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a grade from 0 to 100: "); 
        grade = input.nextInt(); 
        
        if(grade >= 85)
        {
            System.out.println("That is an 'A'");
        }
        else if(grade >= 75)
        {    
            System.out.println("That is a 'B'");
        }
        else if(grade >= 60)
        {
            System.out.println("That is a 'C'");
        }
        else if(grade >= 50)
        {
            System.out.println("That is a 'D'");
        }
        else
        {
            System.out.println("That is a 'F'");
        }    
        
    }
    
}