//                     private

/* 
class sus

{
   
    
      private  int a ;
      private String name;
       
      public void set()
      {
        a=10;
        name= "lolu";
      }
         public void show()
        {
            System.out.println(a +" "+ name);
        }
    
}

class en
{
    public static void main(String[] args)
    {

        sus bj=new sus();

        bj.set();
        bj.show();
    }
}

*/

//          shadowing problem and  this keyword


/* 
class sus

{
   
    
      private  int age ;
      private String name;
       
      public void set(int age)
      {
        this.age=age;
        
      }
      public void set2(String name)
      {
        this.name=name;         //this is use when both local and instance variable is name is same
        
      }
         public void show()
        {
            System.out.println(age +" "+ name);
        }
    
}

class en
{
    public static void main(String[] args)
    {

        sus bj=new sus();
         sus bj2= new sus();
        bj.set(18);
        bj2.set(66);
        bj2.set2("harsh");
        bj.set2("baby");
        bj.show();
        bj2.show();
    }
}

*/

/* 

//                           setter or getter
class sus

{
   
    
      private  int age ;
      private String name;
      
      public void setAge(int age)
      {
        this.age=age;

      }

      public int getAge()
      {
        return age;
      }
      public void setName(String name)
      {
        this.name=name;
      }
      public String getName()
      {
          return name;
      }
       
}

class en
{
    public static void main(String[] args)
    {

        sus bj=new sus();
         sus bj2= new sus();
        bj.setAge(18);
        bj2.setAge(66);
        bj2.setName("harsh");
        bj.setName("baby");
       
        int Study1 =bj2.getAge(); 
        int Study2 =bj.getAge(); 
        String Study3 =bj2.getName();
        System.out.println(Study1);
        System.out.println(Study2);
        System.out.println(Study3);
         
    }
}

*/

//                                                 constructor


/* 
class sus
        {

          private int a;
          String name ;

          sus(int a,String name)
          {
             this.a=a;
             this.name =name;
          }

          public void dis()
          {
            System.out.println(a);
            System.out.println(name);
          }

        }

        class en
        {
          public static void main(String[] args)
          {
            sus bj =new sus(42,"harsh");
            bj.dis();

          }
        }

        */


//                             costructor overloading

/* 
class sus
        {

          private int a;
          String name ;

          sus()
          {
            System.out.println("its zero cons");
            name ="habibi";
             a = 10;
          }

          sus(int a)
          {
             this.a=a;
             name="wassup";
          }

          sus(int a,String name)
          {
             this.a=a;
             this.name =name;
          }

          public void dis()
          {
            System.out.println(a);
            System.out.println(name);
          }

        }

        class en
        {
          public static void main(String[] args)
          {
            sus bj1  =new sus();
            bj1.dis();

            sus bj2 = new sus(56);
            bj2.dis(); 

            sus bj =new sus(42,"harsh");
            bj.dis();

          }
        }

        */

/*

//                     this 

class sus
        {

          private int a;
          String name ;

          sus()
          {
            System.out.println("its zero cons");
            name ="habibi";
             a = 10;
          }

          sus(int a)
          {
            this();
             this.a=a;
             name="wassup";
          }

          sus(int a,String name)
          {
            this(15);
             this.a=a;
             this.name =name;
          }

          public void dis()
          {
            System.out.println(a);
            System.out.println(name);
          }

        }

        class en
        {
          public static void main(String[] args)
          {
            sus bj1  =new sus();
            bj1.dis();

            sus bj2 = new sus(56);
            bj2.dis(); 

            sus bj =new sus(42,"harsh");
            bj.dis();

          }
}
       
*/

/* 
import java.util.*;
class hub
{
 static int a;
 static String name ;

 int m;
 int c;

 static
 {
Scanner sc=new Scanner(System.in);
System.out.println("enter the va = "+ a);
a =sc.nextInt();
 sc.nextLine();
 System.out.println("enter the name = "+ name);
 name =sc.nextLine();   // (line is use for taking full name )

 }

 {
 System.out.println("its non static");
  m=5;
  c=4;
 }
  static void disp()
  {
    System.out.println("its staic = "+ a);
    System.out.println("its static = " +name);
  } 
   public void disp1()
   {
    System.out.println("its non Staic = "+  m);
    System.out.println("its non Staic = "+ c);
    
    
   }

}

class en
{
  public static void main(String[] args)
  {
    hub bj=new hub();          // its create for non static 
    
    hub.disp();       // static variable no need to (create obj  just call by the class) 
     bj.disp1();

  }
}

*/


