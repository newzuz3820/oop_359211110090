package ooplab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Input total score : ");
        int Score = Integer.parseInt(reader.readLine());

        String Grade;
        if(Score >= 80){
            Grade = "A";
        }
        else if(Score >= 70){
            Grade = "B";
        }
        else if(Score >= 60){
            Grade = "C";
        }
        else if(Score >= 50){
            Grade = "D";
        }
        else{
            Grade = "F";
        }

        System.out.println(" The Grade is " + Grade);

    }

//    score 0-49 grade F
//    score 50-59 grade D
//    score 60-69 grade C
//    score 70-79 grade B
//    score 80-100 grade A
}