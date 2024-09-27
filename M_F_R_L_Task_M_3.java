import java.util.Scanner;

class M_F_R_L_Task_M_3 {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your number");  
    int num = scan.nextInt(); 

    boolean check = isPrime(num);
    System.out.println(check);
    
  }

  public static boolean isPrime(int n) {  
    if (n <= 1) {  
        return false;  
    }  
    for (int i = 2; i < Math.sqrt(n); i++) {  
        if (n % i == 0) {  
            return false;  
        }  
    }  
    return true;  
  }  

}  
  