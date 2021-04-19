public class armstrong {
    public static void main(String args[])
    {
        int n=1531,n1,r,sum=0;
        n1=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+ r*r*r;
            n=n/10;
        }
        if (n1==sum)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("non-armstrong");
        }
    }
}
