package day2;
class Hii
{ 
    void display()
    {
        System.out.println("this is display");

    }
    static void display2()
    {
        System.out.println("noo objects are required for initialization");
    }
    int number(int a,int b)
    { 
       
        return a+b;      
    }

}
class Hello
{
    public static void main(String[] args) 
    {
        Hii obj1 = new Hii();
        obj1.display();

        Hii.display2();

        int a = obj1.number(10, 15);
        System.out.println(a);
    }

}

        