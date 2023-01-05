public class main {
 
    public static void main(String[] args) {
        Children children = new Children(3, "сергей", "сергеевич", 15, "ктото");
        Mother mother = new Mother(2, "мария", "петровна", 32, "голова");
        Father father = new Father(1, "Папа", "Папин", 40, "Папаин");
        People chel = new People(0, "Кирилл", "Кириллович", 33, "Кириллов");
        
        
        children.Hello();
        mother.Hello();
        mother.Myperents();
        father.Hello();
        chel.Hello();
        chel.Myperents();
                 
        
        
    }



}
