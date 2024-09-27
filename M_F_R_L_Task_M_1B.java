import java.util.Scanner;

class M_F_R_L_Task_M_1B {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your number");  
    int num = scan.nextInt(); 

    //boolean ev = evenChecker(num);

    if (evenChecker(num) == true) {
      System.out.println();
      System.out.println("true");
    }
    else if (evenChecker(num) == false) {
      System.out.println();
      System.out.println("false");
    }
    else;
      
  }

  public static boolean evenChecker(int ak){
    boolean e_v_o = true;

    if (ak % 2 == 0) {
      e_v_o = true;
    }
    else if (ak % 2 != 0) {
      e_v_o = false;
    }
    else{}
    
    return e_v_o;
  }
}  
  
