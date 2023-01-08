import java.util.jar.Attributes.Name;

public class Mother extends People {

    public Mother(int i, String name, String string12, int j, String string13) {
        super(i, name, string12, j, string13);
        // TODO Auto-generated constructor stub
    }

    public void placeBirths(String placeBirths) {
        System.out.println("Я родилась" + placeBirths);
    }

    @Override
    public void Hello(){
        System.out.println("Привет, я мать!");
    }
    
}
