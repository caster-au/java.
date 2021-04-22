public class fibonacci {
    public static void main(String args[])
    {
        int a=0,b=1,x=0,sum=0;
        while(x!=8)
        {
            System.out.print(a+" ");
            sum=b;
            b=a+b;
            a=sum;
            x=x+1;
        }
    }
}
