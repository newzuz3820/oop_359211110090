package midterm;
import java.util.Scanner;
public class m_3_2 {
    public static void main(String[] args) {
        int id = getId();
        String name = getName();
        float salary = getSalary();
        float OverTime = getOverTime();
        showDatainfo(id, name, salary, OverTime);
    }
    private static int getId() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you ID :");
        int ID = in.nextInt();
        return ID;
    }
    private static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Name :");
        String Name = in.nextLine();
        return Name;
    }
    private static float getSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Salary :");
        float Salary = in.nextFloat();
        return Salary;
    }
    private static float getOverTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you OverTime :");
        float Overtime = in.nextFloat();
        return Overtime;
    }
    private static int total(float s,float y){
        float sum=y+s;
        if (sum >=100000) {
            return 10;
        }
        else if (sum>=70000){
            return 7;
        }
        else if (sum>=50000){
            return 5;
        }
        else if (sum>=30000){
            return 3;
        }
        else {
            return 1;
        }
    }
    private static void showDatainfo(int id, String name, float salary, float overtime){
        m_3_2 i = new m_3_2();
        System.out.println("ID :"+ id);
        System.out.println("Name :"+ name);
        System.out.println("salary :"+ salary);
        System.out.println("OverTime :"+ overtime);
        System.out.println("Tax is :"+ i.total(salary,overtime)+"%");
    }

}
