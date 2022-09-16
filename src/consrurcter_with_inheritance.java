class bas{
    bas(){
        System.out.println("im a base class constructer ");
    }
    bas(int a){
        System.out.println("im a base class overloaded constructerc  a: "+a);
    }
}
class bus extends bas{

    bus(){
        //1
     // super(4);
        System.out.println("im a bus class constructer");
    }
    //2nd
    bus(int a,int b){
        super(a);
        System.out.println("im a bus class overloaded constructerc  b: "+b);

    }
}
  //3rd
class buschild extends bus{
    buschild(int a,int b,int c){
        super(a,b);
        System.out.println("im a constructer of buschild class c: "+c);

    }

}

public class consrurcter_with_inheritance {
    public static void main(String[] args) {
//1st
      //  bas b=new bas(4);
//2nd
   // bus c=new bus(6,2);
   //3rd
buschild cd =new buschild(3,5,6);

    }
}
