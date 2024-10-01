import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the no of rowa: ");
int rows = input.nextInt();

System.out.print("Enter the no of columns:");
int column = input.nextInt();

int[][] arr = new int[rows][column];

int i=0;
while(i<rows){
int j =0 ;
while(j<column){
System.out.print("Enter the no rows"+ (i+1) +": " + "column in a array" + (j+1) +": " );
arr[i][j] = input.nextInt();
j++;
}
i++;
}


i=0;
while(i<rows){
int j =0 ;
while(j<column){
System.out.print(arr[i][j]);
j++;
}
i++;
System.out.println();
}


}





}
