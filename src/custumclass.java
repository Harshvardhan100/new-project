class Employe1{
        int id;
        String name;

        double salary;
        int age=18;

        public void depart(){
        System.out.println("your id is :" + id);
            System.out.println("your name is : "+name);
            System.out.println(" salary :"+salary);
            System.out.println("your are shoud be age "+age);
    }
    }
    public class custumclass {
    public static void main(String[] args) {

        Employe1 harsh=new Employe1();//instantiating a new employe object
        Employe1 chetan =new Employe1();//instantiating a new employe object

        Employe1 amar=new Employe1();//instantiating a new employe object
//setting Attributs
        harsh.id=45;
        harsh.name="vardhan";
        harsh.salary=3.5D;

        chetan.id=34;
        chetan.name="nind";
            chetan.salary=4.5d;

        System.out.println();
//Attributs
chetan.depart();
        System.out.println();
        harsh.depart();
        System.out.println();
amar.depart();
    }
}
