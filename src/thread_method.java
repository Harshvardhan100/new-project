class mynewthr extends Thread {


    public void run() {
        int i = 34;
        while (i < 50) {
            System.out.println("Thank you");
            try{
                Thread.sleep(666);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
i++;
        }
    }
}
class mynewthr2 extends Thread {


    public void run() {
        int i = 34;
        while (i < 50) {
            System.out.println("im sorry babu");
i++;
        }
    }
}
        public class thread_method {
    public static void main(String[] args) {

mynewthr h=new mynewthr();
mynewthr2 j=new mynewthr2();
h.start();
try{
    h.join();
}
catch(Exception e){
            System.out.println(e);
        }

j.start();


    }
}
