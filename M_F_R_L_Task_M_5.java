import java.util.Scanner;

class M_F_R_L_Task_M_5 {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your age : ");  
    int num_a = scan.nextInt(); 

    System.out.println("Enter your salary : ");  
    int num_s = scan.nextInt();

    double t = calcTax(num_a , num_s);
    System.out.println();
    System.out.println(t);


  }

  public static double calcTax(int ak , int pk){
    double tax = 0.0;

    if (ak < 18) {
        //tax = 0.0;
    }
    else if (ak >= 18) {
        if (pk < 10000) {
            //tax = 0.0;
        }
        else if (pk >= 10000 && pk < 20000) {
            tax = (pk * 7) / 100;
        }
        else if (pk >= 20000) {
            tax = (pk * 14) / 100; 
        }
        else{}
    }
    else{};
    return tax;
    
  }  

}  
  