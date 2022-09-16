class myconstracter{
    private int id;
    private String name;
//constracter
    //constructer name must be similar as class name

  //  public myconstracter(){
        //without arguments
        //  id=34;
        //name="harsh

  //  }
    public myconstracter(String hp,int jj){
        //with arguments

        name=hp;
        id=jj;


    }
    public int getid(){
        return id;

    }
    public String getName(){
        return name;
    }
}



public class CONSTRACTER41 {
    public static void main(String[] args) {

//object without arguments
    //    myconstracter hp=new myconstracter();


        //object with arguments

        myconstracter hp=new myconstracter("vardhan",34);

        System.out.println(hp.getid());
        System.out.println(hp.getName());
    }
}
