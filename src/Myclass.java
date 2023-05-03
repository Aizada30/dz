public class Myclass {

    String name;
    String lastname;
    int age;
    String[] lessons;
    String nameofStudent;
    int ageofStrudent;
    String lastnameofStudent;


    public Myclass(String name,String lastname,int age,String[] lessons){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.lessons=lessons;

    }
    public Myclass(String nameofStudent,int ageofStrudent,String lastnameofStudent,String[] lessons){
        this.nameofStudent= nameofStudent;
        this.ageofStrudent=ageofStrudent;
        this.lastnameofStudent=lastnameofStudent;
        this.lessons=lessons;

    }

}
