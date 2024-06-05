package Question2;

import java.util.Scanner;

public class solution2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");

        int b=sc.nextInt();
        
        System.out.println("Enter c:");
        int c=sc.nextInt();
          
        seriesgenerate(a,b,c);
    }
    public static void seriesgenerate(int a,int b, int c){
        int sum=a;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c;i++){
            sum=sum+(1<<i)*b;
            sb.append(sum).append((" "));

        }
        System.out.println(sb.toString());
    }
}
