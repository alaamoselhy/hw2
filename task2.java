import java.util.*;
public class task2 {
    public static void main(String[] args){
         System.out.print("please enter the number");
         Scanner Scanner = new Scanner(System.in);
         int x=Scanner.nextInt();
         String str = "";
         String reverse = "";
         while (x>0){
             str = str+ x%10;
             x=x/10;
         }
            for (int i=str.length()-1; i>=0;i--){
                reverse+=str.charAt(i);
            }
               System.out.print("string"+reverse);
               
    }
}
