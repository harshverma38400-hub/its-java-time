
/* 
class aeroplane 
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

class cargoplane   extends aeroplane 
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

class passengerplane extends aeroplane
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
class supplier extends aeroplane
{
    public void fly(){
        System.out.println("they filling the tank");
    }
    public void dry()
    {
        System.out.println("alcohol is not allow");
    }
}

class airport
{
    public void poly(aeroplane ref)
    {
        ref.takeoff();
        ref.fly();

    } 
}
class poly
{
    public static void main(String[] args)
    {
        cargoplane cc=new cargoplane();

        passengerplane pp =new passengerplane();
        
        aeroplane s =new supplier();

        airport a = new airport();
        a.poly(cc);
        a.poly(pp);
        a.poly(s);

    }
}
    */


    //                     ABSTRACT

   abstract class aeroplane        // class bhbi hogi agar method hai abstract
{
     //abstract public void takeoff();               // method ka koi use na ho rha to body khai krr do or abstract lga do 

    abstract public void fly ();
    
}

class cargoplane   extends aeroplane 
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

class passengerplane extends aeroplane
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
class supplier extends aeroplane
{
    public void fly(){
        System.out.println("they filling the tank");
    }
    public void dry()
    {
        System.out.println("alcohol is not allow");
    }
}


class poly
{
    public static void main(String[] args)
    {
        cargoplane cc=new cargoplane();

        cc.fly();

        passengerplane pp =new passengerplane();
        pp.fly();
        

    
    }
}