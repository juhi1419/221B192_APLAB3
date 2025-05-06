public class Le0
{
    static String Name;
    static int Age;
   
    static void setName(String name)
    {
        Name = name;
    }
   
    static void setAge(int age)
    {
        Age = age;
    }
   
    static void getName()
    {
        System.out.println("Name : " + Name);
    }
   
    static void getAge()
    {
        System.out.println("Age : " + Age);
    }
   
public static void main(String[] args)
{
setName("Junaid");
setAge(21);
   getName();
   getAge();
}
}