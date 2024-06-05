package Question4;

public class Solution4 {
    public static void main(String [] args)
    {
       int ans1= printPrisonerToWarn(5,2,1);
       System.out.println(ans1);

       int ans2=printPrisonerToWarn(5,2,2);
       System.out.println(ans2);
              
    }
    public static  int printPrisonerToWarn(int n,int m,int s)
    { 

        int lpost=(s+m-1)%n;
        if(lpost==0){
            lpost=n;
        }
        return lpost;

    }
}
