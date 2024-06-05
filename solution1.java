package Question1;
public class solution1{
    public static void main(String []args){
             int num=123;
             int rev=0;
             System.out.println("Original number: "+num);
             while(num!=0)
             {
                int temp=num%10;
                rev=rev*10+temp;
                num=num/10;
             }
             System.out.println("reverse no is :"+rev);
    }
}