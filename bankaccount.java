public class bankaccount{
    public double SimpleInterest(double principle,double rate,double time){
        return(principle*rate*time)/100;
    }
    public static void main(String args[]){
        bankaccount myobject=new bankaccount();
        myobject.SimpleInterest(100000,5, 5);
        System.out.println("Simple interest is:" + myobject.SimpleInterest(100000, 5, 5));
    }
}