class kakcha{
    public int a;

    public int method(){
        return 4;
    }
    public void main2(){
        System.out.println("method overriding of class 1 kakcha ");
    }
}
class ee extends kakcha{

    @Override // ye lagana must nahi but recommnded hai yaad rakhne ke liye

    public void main2(){
        System.out.println("this is overriding  2 of ee");
    }

    public void main3(){
        System.out.println("this is method for 3 of main3");
    }

}


public class method_overriding {
    public static void main(String[] args) {


        kakcha ab =new kakcha();
        ab.main2();

ee s=new ee();
s.main2();




    }
}
