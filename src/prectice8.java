//problem 3
class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;

    }
}

//problem 2
//class cellphone{
//    public void ringing(){
//        System.out.println("ringing");
//    }
//
//    public void vibrating() {
//        System.out.println("vivrating");
//    }
//
//    public void cellfriend() {
//
//        System.out.println("celling mukul");
//    }
//}


public class prectice8{
    public static void main(String[] args) {
//problem 2
//     cellphone vivo=new cellphone();
//
//vivo.ringing();
//        vivo.vibrating();
//
//vivo.cellfriend();

        // problem 3
        square sq=new square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


    }
}