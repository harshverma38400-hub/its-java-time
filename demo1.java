// while  

/* 
   class demo{

    public static void main(String[] args)
    {
     int i =0;
     while(i<7)
     {
        System.out.println(" babes");
        i++;
    
     } 
    }
    }
     
*/

// do while

/* 
class demo
{

    public static void main(String[] args)
    {
        int i=0;
        do {
            System.out.println("babes");
            i++;

        } while(i<7);
    
    }
}

 */

// pattern

/* 
 
class demo
{

   public static void main(String[] args)
   {
     for(int i =0 ; i< 5 ; i++ )
     {
       for(int j = 0; j<4; j++)
       {
       System.out.print("*");
       }
       System.out.println();
     }
     
   }
}

*/

/* 
class demo{

 public static void main(String[] args)
 {
   int n= 5;
   for(int i = 0; i<n; i++ )
   {
     for(int j = 0 ; j<5; j++)
     {
       if(i== 0|| j==0|| i== 4 || j==4)
       {
         System.out.print("*");
       }
       else
       {
         System.out.print(" ");
       }
     }System.out.println();

   }
 }
}

*/

/* 
class demo{

public static void main(String[] args)
{
  int n= 5;
  for(int i = 0; i<n; i++ )
  {
    for(int j = 0 ; j<7; j++)
    {
      if( i== 0 || j==0 || i == 2|| j==6)
      {
        System.out.print("*");
      }
      else
      {
        System.out.print(" ");
      }
    }System.out.println();

  }
}
}

*/

/* 
 class demo{

  public static void main(String[] args)
  {
    int n= 5;
    for(int i = 0; i<n; i++ )
    {
      for(int j = 0 ; j<7; j++)
      {
        if(j==0 || i ==(n-1)/2|| j==6)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }System.out.println();

    }
  }
 }
  */

/*
class demo{

public static void main(String[]args)
{
  int n = 10;

  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
     if(i==0 && j>0 && j<(n-1)/2 || j == 0 && i > 0  || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0)
     {
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
     
    }
    System.out.println();
  }
}
}

*/

/*
class demo{

  public static void main(String[]args)
  {
    int n = 18;

    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
      if(i==0 && j<(n-1)/2 || j == 0 ||i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1)
       {
        System.out.print("*");
       }
       else
       {
        System.out.print(" ");
       }
       
      }
      System.out.println();
    }
  }
}

*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/* 

import java.util.*;
public class demo {

  public static void main(String[] args) {
  
  System.out.println("Enter the value of n");
  Scanner sc =new Scanner(System.in);
  int n =sc.nextInt();
             for(int i=0;i<n;i++)
   {
              for(int j=0;j<n;j++)
              {
                		if ((i==0&&(j>1&&j<=n/2+1))||
                		     (j==0&&(i>1&&i<n-1))||
                		     (i==n-1&&(j>0&&j<=n/2))||
                		     (j==n/2+1&&(i>n/2+1&&i<n-1))||
                		     (i==n/2+1&&(j>=n/2&&j<n-2))||
                		     (i==1&&j==1)
                		     )
                		     {
                				  System.out.print(" * ");
             			    }
                		else
                		    {
                                  System.out.print("   ");
              			  }
              }
              System.out.println();
    }
        
    }

}
    */

/*
    class demo{

      public static void main(String[]args)
      {
        int n = 18;
    
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
          if(i==j)
           {
            System.out.print("*");
           }
           else
           {
            System.out.print(" ");
           }
           
          }
          System.out.println();
        }
      }
    }  
      */

/*
class demo{

  public static void main(String[]args)
  {
    int n = 10;

    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
      if(  i+j==(n-1)/2 || i-j==(n-1)/2 
      || j-i==(n-1)/2 || i+j== n-1+(n-1)/2 
      || i==0 && j>0 && j<(n-1) || j== 0 && i>0 && i<(n-1) 
      || i==(n-1)&& j>0 && j<(n-1)|| j== (n-1) && i>0 && i<(n-1))
       {
        System.out.print("*");
       }
       else
       {
        System.out.print(" ");
       }
       
      }
       
      System.out.println();
    }
  }
}  

*/

/* 
    class demo{

      public static void main(String[]args)
      {
        int n = 40;
    
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
          if(  i+j==(n-1)/2 || i-j==(n-1)/2 
          || j-i==(n-1)/2 || i+j== n-1+(n-1)/2 
          || i==0 && j>0 && j<(n-1) || j== 0 && i>0 && i<(n-1) 
          || i==(n-1)&& j>0 && j<(n-1)|| j== (n-1) && i>0 && i<(n-1) )
           {
            System.out.print("*");
           }
           else
           {
            System.out.print(" ");
           }
           
          }
           
          System.out.println();
        }
      }
    } 

   */
/* 
class demo{

public static void main(String[]args)
{
 int n = 32;

 for(int i=0;i<n;i++)
 {
   for(int j=0;j<n;j++)
   {
   if( i==0 && j<=(n-1)/2 || j== 0 && i<(n-1)/2 
   || i+j<=(n-1)/2 || i==0 && j>(n-1)/2 || j==(n-1) && i<(n-1)/2 
   || j-i>=(n-1)/2 || j==0 && i>(n-1)/2 || i==(n-1) && j<(n-1)/2 
   || i-j >=(n-1)/2 || j==(n-1) && i>(n-1)/2         // negative sing m always > use hoga agar pattern ka sath ka picha vala bhi print krna hai to
   || i ==(n-1) && j>(n-1)/2 || i+j>=(n-1)+(n-1)/2  )   
    {
     System.out.print("*");
    }
    else
    {
     System.out.print(" ");
    }
    
   }
    
   System.out.println();
 }
}
} 


*/
/* 
class demo{

  public static void main(String[]args)
  {
    int n = 10;

    for(int i=1;i<n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
          System.out.println();
    }
  }
}
    
      

   */

/*
     class demo{

      public static void main(String[]args)
      {
        int n = 10;
    
        for(int i=n;i>=1;i--)
        {
          for(int j=1;j<=i;j++)
          {
            System.out.print("*");
          }
              System.out.println();
        }
      }
    }
       
  
*/
/*
class demo {
  public static void main(String[] args) {
      int n = 15;
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              if (j<=0&&i<(n)/2 ||
                  i==(n/2)&&j<=(n)/2 ||
                  j<=i&&j<(n)/2&&i<(n)/2 ||
                  j==0&&i>=(n)/2||
                  (i>=n/2) && i+j <= (n-1) ||
                  j==(n-1)|| i+j >= (n-1)&& i<=(n/2)||
                  j>=i&&i>=n/2&&j>=n/2
                  

              ) {

                  System.out.print(" * ");
              } else {
                  System.out.print("   ");
              }
          }
          System.out.println();
      }
  }
}


*/

/* 

//                                     object


class demo{
  int a = 5;
  String name = "harsh";
  public static void main(String[]args)
  {
    demo lol1 = new demo();
     demo lol2 = new demo();
     lol2.name = "babes" ;
      System.out.println(lol1.a);
      System.out.println(lol2.name);

  }
}
  */

//                                     METHOD OVERLOADING                

/*
class calc
{
  public int add(int a,int b)
  {                                                          // agar value return krni hai to (int) ka use krna hoga
     int result = a+b ;
     return result;
     
  }
  public float add(float a,float b ,float c)
  {
    float result = a+b+c;
    return result;
  }
  public Double add(Double a , double b ,Double c,double d)
  {
    Double result = a+b+c+d;
    return result;
  }
}
 class demo
 {
  public static void main(String[] args)
  {
    calc bj = new calc();
    int result1 = bj.add(4,5);
    float result2 = bj.add( 4,4,6);
    Double result3 =  bj.add(3.9,4.2,8.9,4.4);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);



  }
 }

*/
/* 
class calc
 {
   public void show(byte n)
   {
     System.out.println("byte" + n);        // (byte) is liya jisa print hota hua pta lga ki vo byte hai

   }
   public void show(int n)
   {
     System.out.println("int" + n);        // (int) is liya jisa print hota hua pta lga ki vo int hai

   }
   public void show(short n)
   {
     System.out.println("short" + n);        // (byte) is liya jisa print hota hua pta lga ki vo byte hai

   }
   
   
 }
  class demo
  {
   public static void main(String[] args)
   {
    
      calc bj = new calc();
      //byte n =2;
       bj.show(5);                    // (int) is liya print hua kyu ki java bydefault value ko int ma leta hai
  }                                      //agar  int na ho to vo dusra pa switch ho jaya ga like s 
   }                                // ISA HI AUTOMATIC PROMOTION IN OVERLOADING                     

    */

//                                           ARRAY IN JAVA 

//  1D

/* 
class demo
{
  public static void main(String[] args)
  {
    int num[] ={4,5,6,8,9};                    // ya normal form hai value ko assine krna ka
    for(int i=0 ; i<=4; i++)                // i =0 mtlb index value
    {
    System.out.println(num[i]);
    }
    
  }
}
   */
/* 

 class demo
 {
   public static void main(String[] args)
   {
     int num[] =new int[4]; 
     num[0] = 5;
     num[1] = 4;
     num[2] = 9;
     num[3] = 3;

     for(int i=0 ; i<=4; i++)                
     {
     System.out.println(num[i]);
     }
     
   }
 }
*/

// 2D

/* 
class demo{

  public static void main(String[] args)
  {
    int num [][] = new int[4][6];            // agar ham bydefault arrya ki value n dala to vo (0) print kra gaf
    
    for(int i =0; i<=3 ; i++)
    {
      for(int j=0; j<=5; j++)
      {
        System.out.print(num[i][j] + " ");  
      }
      System.out.println( );
    }

  }
}  */

/* 
class demo{

  public static void main(String[] args)
  {
    //int num [][] = new int[3][2]; 
               
    // what if value hma phele sa assine ho

    int num [][] ={
        
      { 5,6},                // [] first one for no. row       n
      {9,7},                 // [] second one for no. caloum   m
      {6,8}

    };


    for(int i =0; i<=2 ; i++)
    {
      for(int j=0; j<=1; j++)
      {
        System.out.print(num[i][j] + " ");  
      }
      System.out.println( );
    }

  }
} 
  */
/* 
   class demo{ 

    public static void main(String[] args)
    {
      // what if value hma phele sa asssine na h0
      int num [][] = new int[3][2]; 
       num [0][1] = 5;
       num [1][0] = 5;
       num [1][1] = 5;
  
      for(int i =0; i<=2 ; i++)
      {
        for(int j=0; j<=1; j++)
        {
          System.out.print(num[i][j] + " ");  
        }
        System.out.println( );
      }
  
    }
  } 
    
*/

// jagged array

/* 
class demo{

  public static void main(String[] args)
  {
   
               
    
    int num [][] ={
        
      { 5,6,9,2},                   // jagged means no. of rows to pta ho pss caloum na ho pta  jab use hota hai
      {9,7},                 
      {6,8,4}               

    };


    for(int i =0; i<=2 ; i++)
    {
      for(int j=0; j<num[i].length; j++)      // .length use ho rha hai har ROW ka calum kitna hai chech krna ka liya 
      {                                          // agar ham (j) mai = ka use kra ga to out of boundary dikhaya ga kyo mi vo (0123) chla ga but y (1234) lega
        System.out.print(num[i][j] + " ");  
      }
      System.out.println( );
    }

  }
}
*/

/* 
class demo{

    public static void main(String[] args)
    {
      
      int num [][] = new int[3][];   // if we dont know no.calum leave it empty
      num [0] = new int[4];
      num [1] = new int[2];             //  its is size of calum
      num [2] = new int[2];
     

       num [0][0] = 5;
       num [0][1] = 5;
       num [2][1] = 5;
      for(int i =0; i<=2 ; i++)
      {
        for(int j=0; j<num[i].length; j++)
        {
          System.out.print(num[i][j] + " ");  
        }
        System.out.println( );
      }
  
    }
  }
    
   */

// length use for check thr no. value in array
// length() for string it does the same thing 
// like 
/* class demo{
  public static void main(String[] args)

  {
    int num[] = { 4,5,5};

    System.out.println(num.length);

  }
}
   */

//                   Enhanace for loop

/* 
class demo{
  public static void main(String[] args)
  {
    int num[][] =
    {
      {4,5,6,7},
      {5,6},
      {6,7,8,9,8},
      {4}
      
    };
       for (int a[] : num)               // isma hama error nhi aya ga kyu ki y Apna Aap chla ga or (variable) ki value (a) ja rhi hai 
       {
        for(int b :a)                      // yha hama no.calum ka liya arjust krna ki jurat nhi hai (value b ma assine noka print hogi)
      {
        System.out.print(b + " ");
       } 
       System.out.println( );

       }
    
      }
   }
  */

/* 


class demo{
  int a = 5;
  String name = "harsh";
  public static void main(String[]args)
  {
    demo lol1 = new demo();
     demo lol2 = new demo();
     lol2.name = "babes" ;
      System.out.println(lol1.a);
      System.out.println(lol2.name);

  }
}

*/

/* 

import java.util.*;

class Simple {
    double principal, rate, yr;

    Simple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        principal = sc.nextDouble();

        System.out.println("Enter the rate of interest:");
        rate = sc.nextDouble();

        System.out.println("Enter time (in years):");
        yr = sc.nextDouble();

        sc.close();
    }

    public double calculate() {
        return (principal * rate * yr) / 100;
    }

    public void disp() {
        System.out.println("***********************");
        System.out.println("Principal : " + principal);
        System.out.println("Rate      : " + rate);
        System.out.println("Time      : " + yr);
        System.out.println("Simple Interest : " + calculate());
    }
  }
  
 class  SimpleInterestCalculator {
   
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.disp();
    }
}

*/

import java.util.*;

class Simple {
    double principal, rate, yr;

    Simple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        principal = sc.nextDouble();

        System.out.println("Enter the rate of interest:");
        rate = sc.nextDouble();

        System.out.println("Enter time (in years):");
        yr = sc.nextDouble();

        //sc.close();
    }

    public double calculate() {
        return (principal * rate * yr) / 100;
    }

    public void disp() {
        System.out.println("***********************");
        System.out.println("Principal : " + principal);
        System.out.println("Rate      : " + rate);
        System.out.println("Time      : " + yr);
        System.out.println("Simple Interest : " + calculate());
    }
  }
  
 class  demo {
   
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.disp();
    }
}