 class cars{

    public void AN(){

        System.out.println("ALL MUSTANG  ARE CARS");
    }
}
 interface mustang {
    void show ();
}
class challenger extends cars {
    public void  LI(){
        System.out.println("CHALLENGER WHICH PRODUCE HELLCAT.");
    }
}
class hellcat extends challenger implements mustang{
    public void show (){}
    }

class Family_mustang extends hellcat {
 public void FLI(){
    System.out.println("AND THEN THEY FORM A FAMMILY, A SPORT CAR.");
 }
}
class Output{
    public static void main(String[] args) {
        
    
    Family_mustang family_mustang= new Family_hellcat();

    System.out.println();
    family_mustang.AN();
    family_mustang.LI();
    family_mustang.FLI();
    System.out.println();
    


}
}