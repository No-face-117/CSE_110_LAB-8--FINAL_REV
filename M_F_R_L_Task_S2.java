import java.util.Scanner;

class M_F_R_L_Task_S2 {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter String S : ");
    String nk1 = scan.nextLine();

    System.out.println("Enter String S1 : ");
    String nk2 = scan.nextLine();

    System.out.println("Enter String S2 : ");
    String nks = scan.nextLine();

    modifyStrings(nks, nk2, nks);
  }

  public static void modifyStrings(String S, String S1, String S2) {
    String result = "";

    int i = 0;
    while (i < S.length()) {
        // Check if substring S1 starts at the current position
        if (i <= S.length() - S1.length() && S.substring(i, i + S1.length()).equals(S1)) {
            // If we find S1, add S2 to the result and move the index forward by the length of S1
            result += S2;
            i += S1.length();
        } else {
            // If S1 is not found, add the current character and move to the next
            result += S.charAt(i);
            i++;
        }
    }

    // Print the modified string
    System.out.println(result);
}

}  
  