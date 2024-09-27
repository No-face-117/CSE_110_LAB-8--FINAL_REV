import java.util.Scanner;

class M_F_R_L_Task_M_4 {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your number");  
    int num = scan.nextInt(); 

    boolean check = isPerfect(num);
    System.out.println(check);

  }

  public static boolean isPerfect(int ak) { 
    int sum = 0; 
    for (int i = 1; i < ak; i++) {
        if (ak % i == 0) {
            sum += i;
        }
        else{}
    }

    if (sum == ak) {
        return true;
    }
    else if (sum != ak) {
        return false;
    }
    else{return false;}
      
  }  

}  
  