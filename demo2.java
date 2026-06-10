//                     IMUTABLE STRING

/* 
class demo2
{
 public static void main(String[] args)
 {                                              //khali string m hoga 
 String dude = "harsh";                   // string in java is consider as (object)
 System.out.println(dude);              //String is imutable (which u cant add any thing) if u do some changes is will create diff obj for that
 dude.concat("habibi");            /// is use to add some thing in string but(string m add nhi hota because y imutable hai)
 System.out.println(dude); 
 }                                  // ("") ha uski baat hai ya
}

*/
//                MUTABLE STRING

/* 
class demo2
{
 public static void main(String[] args)
 {
    StringBuffer name = new StringBuffer("habibi");    // you can change any thing in obj
    System.out.println(name);
    name.append(" come to dubai");
    System.out.println(name);                         //loke this obj change able
   }
}
   */

  

  //                      (==) or equals concept or (+)


  /* 
  class demo2
{
 public static void main(String[] args)
 {
   String name = new String("habibi");
   String name2 = new String("habibi2");    // heap memory m duplicasy allow hai is liya har bar new obj bna ga 
   System.out.println(name + " " + name2);       // we cant comprison with (new keyword) its create new obj
   System.out.println(name == name2); 

   String s1 = "babes";
   String s2 = "babes";
   System.out.println(s1==s2);        // u can camparison them (because they are in same memory in head called (String constant pool))
 }
}
 */



 /* 
 class demo2
{
 public static void main(String[] args)
 {
     String s1 = "habibi";
     String s2 =new String("habibi");
     String s3 =new String("habibi");
     String s5 = "habibi";
    // System.out.println(s1==s2 || s1==s5 || s1.equals(s2) || s2==s3 ||s3.equals(s5)); ya print(true is liya kiya )kyo ki ak bhi true hoga to y sara ko true lega chaha koi false ho
    System.out.println(s1==s5);
     System.out.println(s1.equals(s2));
     System.out.println(s2==s3);
     System.out.println(s3.equals(s5));

 }
}
  */


  /* 

  class demo2
{
 public static void main(String[] args)
 {
    String s1 = "babes";
    String s2 = s1.concat("wassup");
    String s3 = new String("wasuup");
         s3 = s3.concat("yo yo");
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
 }
}

  */

  /* 
  class demo2
  {
   public static void main(String[] args)
   {
      String s1 = "babes";
      s1=s1.concat("wassup");
      System.out.println(s1);
   }
  }
 */

 /* 

 class demo2
 {
  public static void main(String[] args)
  {
     String s1 = "yoho" + "hehe";
     String s2 = "yoho" + "hehe" + "baby";
     String s3 = "yoho" + "hehe" + "baby" + "wassup";
     String s4 = s1 + s2;       // ya heap m bna ga kyu ki (ham reffrense s1 or s2 sa concat krr rha hai)
     String suu = "pop" + 100 + 99;
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
     System.out.println(s4);
     System.out.println(suu);
      }
}
*/

/* 
class demo2
{
   public static void main(String[] args)
   {
      String str="PW Skill Java";
      System.out.println(str);
      System.out.println(str.toUpperCase());
      System.out.println(str.toLowerCase());
      System.out.println(str.length());
      System.out.println(str.charAt(1));
      //int length=str.length();
      System.out.println(str.substring(3,8));
      System.out.println(str.indexOf("S"));
      System.out.println(str.indexOf("a"));
      System.out.println(str.lastIndexOf("a"));
   }
}

*/

//                       final

/* 

class demo2
{
 public static void main(String[] args)
 {
   final StringBuffer bj = new StringBuffer("harsh");
    bj.append(" babes");   // final cant change mutibility 
    bj=new StringBuffer("verma");
   System.out.println(bj);

 }
}

 */

 /* 

class demo2
{
 public static void main(String[] args)
 {
    StringBuffer bj = new StringBuffer("harsh");
    bj.append(" babes");   // final cant change mutibility 
    bj=new StringBuffer("verma");  // isna value isliya liya kyo ki ham n refernce kisi or ko de diya hai(agar final hoga to change nhi hota)
   System.out.println(bj);

 }
}
 */

 /* 
 class demo2
{
 public static void main(String[] args)
 {
   StringBuffer bj=new StringBuffer();
   bj.append("harsh");
   System.out.println(bj.capacity());  // capacity String ki 16 hoti hai value bado ga to bad jaya gi
   System.out.println(bj);
   System.out.println(bj.charAt(3));     // index k liya
   // System.out.println(bj.setcharAt(2,"p"));  // ya print nj=hi hoga kyo ki char retun type void ha to print nhi ho sakta
   bj.setCharAt(2,'p');
   System.out.println(bj);
 }
}
  */

  /* 
  class demo2
{
 public static void main(String[] args)
 {
   StringBuffer bj=new StringBuffer(200);  //200 is capacity
   System.out.println(bj.capacity()); 
   bj.append("harsh");
   System.out.println(bj); 
   bj.trimToSize();  // ya use hota uthi capacity dene k liya jitna chaiya
   System.out.println(bj.capacity()); 
 }
}

  */

  /* 
  
  class demo2
{
 public static void main(String[] args)
 {
   StringBuffer bj=new StringBuffer();
   bj.append("harsh");
   System.out.println(bj.capacity());  // capacity String ki 16 hoti hai value bado ga to bad jaya gi
   System.out.println(bj);
   System.out.println(bj.charAt(3));     // index k liya
   // System.out.println(bj.setcharAt(2,"p"));  // ya print nj=hi hoga kyo ki char retun type void ha to print nhi ho sakta
   bj.setCharAt(2,'p');
   bj.setCharAt(4,'i');
   System.out.println(bj);
 }
}
 */



 import java.util.*;
  class demo2
  {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
 
        float a,b,c;
        System.out.println("enter the number");
        a =sc.nextInt();
        System.out.println("enter the 2 no");
        b=sc.nextInt();
        System.out.println("enter the 3 no");
        c=sc.nextInt();
        System.out.println("angle a" + a);
        System.out.println("angle b" + b);
        System.out.println("angle c" + c);

        if((a+b+c)==180)
        {
          System.out.println("its form of traingle");
        }
        else
        {
          System.out.println("not form of traingle");
        }


    }
  }
