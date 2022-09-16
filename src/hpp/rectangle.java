package hpp;

class rectanglee{
    private int lenth;
    private  int breadth;

    public rectanglee() {
        this.lenth = 5;
        this.breadth=6;
    }
    public rectanglee(int lenth, int breadth) {
        this.lenth = lenth;
        this.breadth = breadth;
    }
    public int getLenth() {
        return lenth;
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }
    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}
public class rectangle {
    public static void main(String[] args) {
rectanglee r=new rectanglee(6,7);
        System.out.println(r.getBreadth());
        System.out.println(r.getLenth());
    }
}




