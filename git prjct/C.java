class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
}
 
class B extends A
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
}
 
public class C
{
    public static void main(String[] args)
    {
        B b = new B();
 
        System.out.println(b.i);
try{
Class c=C.class.getClassLoader().loadClass("C");
System.out.println(c.getName());
String s1=new String("vamsi");
System.out.println(s1.hashCode());
s1=s1+"lovely";
System.out.println(s1.hashCode());
StringBuilder sd=new StringBuilder();
sd.append("ravali");
System.out.println(sd.hashCode());
sd.append("vamsi");
sd.append("vamsi");
sd.append("vamsi");
sd.append("vamsi");
sd.append("vamsi");
sd.append("vamsi");
sd.append("vamsi");

System.out.println(sd.hashCode());
}
catch(Exception e){
System.out.println(e.getMessage());
    }}
}