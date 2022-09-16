class cyllender {
    private int hight;
    private int radius;


    public void sethight(int n){
        this.hight=n;
    }
    public int gethight(){
        return hight;
    }
    public void setradius(int a){
        this.radius=a;

    }



    public int getradius(){
        return radius;
    }
    public double surcufrence(){

        return  2*3.142*radius*hight+2*3.142*radius*radius;
        //or
       // return 2*Math.PI*radius*hight+2*Math.PI*radius*radius;
    }
    public double volume(){

        //return 3.142*radius*radius*hight;
        //or
         return Math.PI*radius*radius*hight;

    }

    }




public class cylender {
    public static void main(String[] args) {
        cyllender lpg=new cyllender();
        lpg.setradius(5);
        lpg.sethight(6);
//
//        System.out.println(lpg.getradius());
//       int j= lpg.gethight();
//        System.out.println(j);
        System.out.println(lpg.surcufrence());
        System.out.println(lpg.volume());
    }
}
