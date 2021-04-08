//unary operator
class Operator{
public static void main(String args[]){
    int a=10,b,c,d;
    b=a++;
    c=++b;
    d=c++;
    a=++d;
    System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}