public class ifelseifstatement{
  public static void  main (String[] args){

    int marks = 65;

    
    if (marks > 90) {
      System.out.println("Grade A(Above 90) ");
    }

    // checks if number is less than 0
    else if (marks >75) {
      System.out.println(" Grade B(Above 76 to 90)");
    }

    else if (marks >50) {
      System.out.println(" Grade C(51 to 75)");
    }
    
    
    // if both condition is false
    else {
      System.out.println("Then consider as  a fail.");
    }
  }
}
  