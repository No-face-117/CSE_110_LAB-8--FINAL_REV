import java.util.Scanner;

class M_F_R_L_Task_M_1A {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your number");  
    int num = scan.nextInt(); 

    evenChecker(num);
      
  }

  public static void evenChecker(int ak){
    boolean e_v_o ;

    if (ak % 2 == 0) {
      System.out.println();
      System.out.println("Even!!");
    }
    else if (ak % 2 != 0) {
      System.out.println();
      System.out.println("Odd!!");
    }
    else{}
  }
}  
  
