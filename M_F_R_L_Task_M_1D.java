import java.util.Scanner;

class M_F_R_L_Task_M_1D {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your number");  
    int num = scan.nextInt(); 

    sequence(num);
      
  }

  public static void sequence(int ak){

    System.out.println();
    if (ak > 0) {
        for (int i = 0; i <= ak; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " , ");    
            }
            else{}
            
        }
    }
    else if (ak < 0) {
        for (int i = 0; ak <= i; ak++) {
            if (ak % 2 != 0) {
                System.out.print(ak + " , ");
            }
            else{}
        }
    }
    else{}
  }
}  
  