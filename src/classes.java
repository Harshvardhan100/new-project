class mmythr extends Thread {
    public mmythr(String name) {
        super(name);}
    public void run(){
       // int i=34;
        System.out.println("thank you");
//        while(true){
//            System.out.println("i am thread ");
//        }
    }
}
public class classes{
    public static void main(String[] args) {
        mmythr j=new mmythr("hARSH");
        mmythr j2=new mmythr("VARDHAN");

      //  j.start();
        System.out.println("the id of thread is "+j.getId());
        System.out.println("the id of thread is "+j.getName());
        System.out.println("the id of thread is "+j2.getId());
        System.out.println("the id of thread is "+j2.getName());

    }
}
