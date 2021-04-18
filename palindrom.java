public class palindrom {
 public static void main(String args[])
 {
     int n=153,n1,r,sum=0;
     n1=n;
     while(n!=0)
     {
         r=n%10;
        sum=sum*10+r;
        n=n/10;
     }
     if(n1==sum)
     {
         System.out.println("palindrome");
     }
     else{
         System.out.println("non-palindrome");
     }
 }   
}