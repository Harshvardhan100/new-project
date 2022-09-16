class mythr extends Thread{

    public mythr(String name){
        super(name);

    }

    public void run() {
        int i=34;
        System.out.println("Thank you");

//        while (s<3) {
//            System.out.println("i am thread");
//            s++;
//        }


    }
}
public class thread_with_class{
    public static void main(String[] args) {
        mythr h=new mythr("harsh");
        h.start();

    }
}
