class mythread extends Thread{
    @Override
    public void run() {
        System.out.println("im 1 threads ");
    }
}
class mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println("im a 222 thereads ");
    }
}

public class threadclass {

    public static void main(String[] args) {

        mythread t=new mythread();
        mythread2 t2=new mythread2();
        t.start();
        t.start();
    }
}
