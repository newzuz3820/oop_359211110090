package midterm;
import java.util.Scanner;
public class m_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m_3_1 l = new m_3_1();
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter Year " + i + " :");
            int a = in.nextInt();
            System.out.println("Age" + i + ": " + l.total(a));
        }
        System.out.println("Thank you.");
    }
    public int total (int l){
        int sum;
        return  sum = 2561-l;

    }//main

}//class

