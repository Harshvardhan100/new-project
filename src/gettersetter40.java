class Myemploye{
    private int id;
    private String name;

    public void getid(int n){
        id=n;
    }

    public int setid(){
        return id;
    }
    public void getname(String a){
        name =a;
    }

    public String setname(){

        return name;
    }
}


public class gettersetter40 {
    public static void main(String[] args) {
        Myemploye hp=new Myemploye();
        hp.getid(32);
        hp.getname("harsh");


        System.out.println(hp.setid());
        System.out.println(hp.setname());
    }
}
