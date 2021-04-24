public class Break {
    public static void main(String args[])
    {
    int i=1;
    for(;;)
    {
        if(i>10)
        {
            break;
        }
        System.out.println(i+"\t");
        i++;
    }
    }
}
