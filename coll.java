//                                         ArryaList In JANA  
  
/* 
import java.util.*;
public class coll {
    public static void main(String[] args)
    {
        ArrayList a1 =new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);

        System.out.println(a1);
       
        ArrayList a2 =new ArrayList();

        a2.add("its baddes time");
        a2.add(1.1);
        a2.add(43.3);
        a2.add('j');
        
        System.out.println(a2);

        a2.add(100);

        
        System.out.println(a2);
 
        ArrayList a3=new ArrayList();

        a3.add(1);
        a3.add(2);
        a3.add(3);

        a3.addAll(a2);   //its use to add collection into other collection
        System.out.println(a3);

       a3.add(2,"lol");   // its use to exchange the index
        
       System.out.println(a3);
  



    }
    
}
*/

/* 
import java.util.*;

class coll {
    public static void main(String[] args) {
        ArrayDeque a1 = new ArrayDeque();

        a1.add(100);
        a1.add(200);
        a1.add(300);

        System.out.println(a1);
         a1.addFirst("suckes");

         a1.addLast("baby");

         System.out.println(a1);
         ArrayDeque a2 = new ArrayDeque();

         a2.addFirst(1);
         a2.addLast(97);
         a2.addAll(a1);
         System.out.println(a2);

    }
}

*/

/* 

import java.util.*;
class coll
{
    public static void main(String[] agrs)
    {
     PriorityQueue a1 =new PriorityQueue();

     a1.add(100);
     a1.add(25);
     a1.add(45);
     a1.add(56);

     System.out.println(a1);

     PriorityQueue a2 = new PriorityQueue();

     a2.add(97);
     a2.add(34);
     a2.add(56);

     System.out.println(a2);
     a2.addAll(a1);
     System.out.println(a2);

    }
}

*/

/* 
import java.util.*;
class coll{
    public static void main(String[] args)
    {
        TreeSet n1 =new TreeSet();

        n1.add(67);
        n1.add(90);
        n1.add(40);
        n1.add(70);
        n1.add(50);
        n1.add(42);
        n1.add(28);

        System.out.println(n1);

       // n1.add(90);  // duplicay is not allow

       System.out.println(n1);

       // they both do same woork
       System.out.println(n1.higher(28));
       System.out.println(n1.lower(90));

       System.out.println(n1.ceiling(67));
       System.out.println(n1.floor(42));



        

    }
}
    */

    /* 
    import java.util.*;
    public class coll {
        public static void main(String[] args)
        {
            ArrayList a1 =new ArrayList();

             a1.add(100);
             a1.add(200);
            a1.add(300);
             a1.add(400);
             a1.add(500);

            // for(int i =0; i<a1.size(); i++ )   // a1.size mtlb sara total (4) usa lega 
            // {
            //    //  Object o = a1.get(i);            // obj ma store kiya hai 
            //     System.out.println(a1.get(i));              // bina store ka          // index ka ander ki value access k liya hoga 
            // }

            // for(Object o : a1)
            // {
            //     System.out.println(o);
            // }
            
            // BUT its not applay  in all collecton to fatch data 

            Iterator bj =a1.iterator();
            while(bj.hasNext())
            {
               //  int a = (int)bj.hasNext();    //save as a int 
                 System.out.println(bj.next());
            } 
            ListIterator bp =a1.listIterator(a1.size());

            while(bp.hasPrevious())
            {
                System.out.println(bp.previous());
            }
        }
    }

    */

    /* 
 import java.util.*;

class coll
    {
        public static void main(String[] args)
{
    ArrayList a1 = new ArrayList();

    a1.add(23);
    a1.add(87);
    a1.add(98);
    a1.add(66);

    System.out.println(a1.indexOf(87));

    a1.add(2,'p');
    System.out.println(a1);

}    }
    
    */

/* 
    import java.util.*;

    class coll
        {
            public static void main(String[] args)
    {
       HashMap bj = new HashMap();

       bj.put(1, "suckes");
       bj.put(2, "lol");
       bj.put(3, "aby");
       bj.put(4, "lulo");
       bj.put(5, "habibi");

       System.out.println(bj);


       LinkedHashMap bj2 = new   LinkedHashMap();  // jisa value oder m aya

       bj2.put(1, "suckes");
       bj2.put(2, "lol");
       bj2.put(3, "aby");
       bj2.put(4, "lulo");
       bj2.put(5, "habibi");

       System.out.println(bj2);
    }
}

*/

/* 
import java.util.*;

class coll
    {
        public static void main(String[] args)
{
    Hashtable bj2 = new Hashtable();

    bj2.put(1, "suckes");
      // bj2.put(2, "lol");
       bj2.put(3, "aby");
       bj2.put(4, "lulo");
       bj2.put(5, "habibi");

       bj2.putIfAbsent(2, "baby");  // save value is not there 

       System.out.println(bj2);

       TreeMap bj3 =new TreeMap();


bj3.put(1, "suckes");
      // bj2.put(2, "lol");
       bj3.put(3, "aby");
       bj3.put(4, "lulo");
       bj3.put(5, "habibi");

       bj3.putIfAbsent(2, "baby");  // save value is not allow

       System.out.println(bj3);   // its give return in order




}
    } */

