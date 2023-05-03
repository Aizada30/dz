import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

Myclass myclass=new Myclass("Aizada","Abdyrazakova",20,new String[]{"Technik","Praktik","English"});
Myclass myclass1=new Myclass("Abdyrazakova",18,"Aizada",new String[] {"Algebra","Lenguege","Chemish"});
        System.out.println(myclass.name+"\n"+myclass.lastname+"\n"+myclass.age+"\n"+ Arrays.toString(myclass.lessons));
        System.out.println("\n"+myclass1.nameofStudent+"\n"+myclass1.ageofStrudent+"\n"+myclass1.lastnameofStudent+"\n"+ Arrays.toString(myclass1.lessons));


    }
}