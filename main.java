import java.net.SocketPermission;
import java.util.function.Function;

public class main {
 
    public static void main(String[] args) {
        Children children = new Children(3, "сергей", "сергеевич", 15, "ктото");
        Mother mother = new Mother(2, "мария", "петровна", 32, "голова");
        Father father = new Father(1, "Игорь", "Папин", 40, "Папаин");
        People chel = new People(0, "Кирилл", "Кириллов", 33, "Кириллович");
        
        
        children.Hello();
        mother.Hello();
        mother.Myperents();
        father.Hello();
        father.Myperents();
        chel.Hello();
        
        System.out.println(father.getGender()+" "+father.getName());
        System.out.println(mother.getGender()+" "+mother.getName());
        System.out.println(chel.getGender()+" "+chel.getName());
//лямда с интерфейсом
        Function<Integer, String> age = (x) -> String.valueOf(x) + " года(лет)";
        System.out.println("маме " + age.apply(mother.getAge())); 

        
        
    }



}
