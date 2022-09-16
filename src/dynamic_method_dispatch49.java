//super class
class phone{
    public void greet(){
        System.out.println("greet method");
    }
    public void math2(){
        System.out.println("my phone is ringing..........");
    }
}
//sub class
class smartphone extends phone {
    public void math2(){
        System.out.println("my Smartphone is ringging.........");
    }
    public void math3(){
        System.out.println("call function this.......;");
    }
}



public class dynamic_method_dispatch49 {
    public static void main(String[] args) {

        phone obj =new smartphone();//its allowed
        //obj=refrence
        //phone =super class
        //smartphone=object of subclass

        obj.math2();


        //obj.math3();    not allowed

      //  smartphone oj=new phone();  not allowed




    }
}
