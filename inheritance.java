//package inheritance;

//                       single level

/* 

class human
{
    private String name;
    int age;

    human()
    {
        System.out.println("yoyo mr po");
    }
    void sus()
    {
        age = 19;
        System.out.println("hello babes");
        System.out.println("babes how are you");
    }
}

class honey extends human
{

    void disp()
    {
        System.out.println(age);
    }

}

public class inheritance
{
    public static void main(String[] args)
    {
        honey bj = new honey();
        bj.sus();
        bj.disp();
    }
} 

 */

 //                     multi level

 /* 
 class demo

{
    void dis()
    {
        System.out.println("wassup");
    }
}

class demo2 extends demo
{

}

class demo3 extends demo2
{

}

class inheritance 
{
    public static void main(String[] args)
    {
       demo3 bj =new demo3();
       bj.dis();

    }
}

*/

//                     hierachical level 

/* 
class demo

{
    void dis()
    {
        System.out.println("wassup");
    }
}

class demo2 extends demo
{

}

class demo3 extends demo
{

}
class demo4 extends demo
{

}

class inheritance 
{
    public static void main(String[] args)
    {
       demo3 bj =new demo3();
       bj.dis();
       demo4 bj2 =new demo4();
       bj2.dis();

    }
}



*/

//        BY USING METHODS

/* 

class airplane 
{
    public void takeoff()
    {
        System.out.println("the flight is ready for takeoff");

    }

    public void fly ()
    {
          System.out.println("airplnae is flying");  // overriden
    }
}

class cargoplane   extends airplane 
{
    public void fly()
    {
      System.out.println("airplane apna hai baby");  //overriding
    }

    public void carrygoods()
    {
        System.out.println("airplane carry goods");   // specialized
    }
}

class passengerplane extends airplane
{
    public void fly()
    {
        System.out.println("fly baby");   //overroding
    }
    public void passenger()
    {
        System.out.println("carry passengers ");  // specialized
    }
}

class inheritance
{
    public static void main(String[] args)
    {
        cargoplane bj =new cargoplane();

        bj.fly();
        bj.carrygoods();

        passengerplane bj2 =new passengerplane();
         bj2.fly();
         bj2.passenger();


    }
}
    */
   

    //  constructor and this method in inheritance


    /* 
     class demo1
     {
        public demo1()
        {
                System.out.println("how is the place");
                int a =4;
                int b =1;
        }
        public demo1(int x,int y)
        {
            System.out.println("uthiya na ");
        }
     }

     class demo2 extends demo1
     {
        public demo2()
        { 
            this(5,2);                 // same class m dhud tha hai
            //super(10,24);             // agar bina obj create kra call krna ho to super use bss (2par)
            System.out.println("everything made by god");
        }

        public demo2(int x,int y)
        {
            System.out.println("baby");
        }

     }

     class inheritance
     {
        public static void main(String[] args)
        {
            demo2 bj =new demo2();            // ya bhi sirf single parameter hi laga duri class sa 
            
            //  demo2 bj3 = new demo2(10,14);       // extends use krna k bad bhi (2 parameter vala ) dusri class ki access nhi hoga onli (0 parameter)vala
        }
     }
        */