
// second parent class of A
public interface Alphabetical_E {

    void show();
}

class A extends B implements Alphabetical_E{ // A inherts B and E properties

    public void MO(){

        System.out.println("We all know 'A' got start!");
        System.out.println();
        System.out.println(" Yeah, Then 'B' comes next, so easy, huh!");
    }

}

class B{// parent class of A

    public void show(){
         }

}
class C extends E { // C inherts E properties
    public void TATA(){

        System.out.println("So, C and D.");
    }
}
class E{// class name 

    public void TOTO(){
        System.out.println("Then, E.");
    }
}

class F{// object 
   public static void main(String[] args) {
    
   
    
     A first = new A();
     C middle= new C();
     E last= new E();
    
    first.MO();
    middle.TATA();
    last.TOTO();
    
    System.out.println();
    System.out.println("THANKS!");   

}
}
/*
 * We all know 'A' got start!

 Yeah, Then 'B' comes next, so easy, huh!
So, C and D.
Then, E.

THANKS!
 */