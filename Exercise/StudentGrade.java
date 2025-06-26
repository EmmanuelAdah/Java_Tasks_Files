import java.util.Scanner;

public class StudentGrade {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 1;

while(gradeCounter <= 10){
System.out.print("Enter student grades: ");
int grade = input.nextInt();

total = total + grade;
gradeCounter = gradeCounter + 1;
}

int classAverage = total / 10;

System.out.printf("%n The class total is %.0f", total);
System.out.printf("%n The class average is %.1f", classAverage);
}
}