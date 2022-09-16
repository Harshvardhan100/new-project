interface mycamera {
    void takesnap();

    void recordvideo();

 private void greet(){
    System.out.println("have a grate day");
}
    default void record4kvideo() {
     greet();
        System.out.println("recording........... 4k video");
    }
}
    interface mywifi{
        String[] getnetwork();
        void connecttonetwork(String network);
    }
class myCellPhone{
        void callNumber(int phoneNumber){
            System.out.println("caslling "+phoneNumber);
        }

        void pickCall(){
            System.out.println("connecting......");
        }

    }

    class MySmartPhonee extends myCellPhone implements mycamera,mywifi {
        public void takesnap(){
            System.out.println("Taking snap....");
        }
       public void  recordvideo(){
            System.out.println("recording audio");
        }
        public  String[] getnetwork() {
            System.out.println("Getting list of networks");
            String[] networklist = {"harry", "paras", "angry chacha"};
            return networklist;

        }
          public void connecttonetwork(String network){
              System.out.println("connecting to"+network);
            }

//            public void  record4kvideo(){
//                System.out.println("quality video");
//            }


}





public class defaultclass{
    public static void main(String[] args) {
        MySmartPhonee s=new MySmartPhonee();
            String [] ar =s.getnetwork();
                        s.record4kvideo();
             for(String item:ar){
                 System.out.println(item);
             }
    }
}
