public class Father extends People{
    
    public Father(int i, String string2, String string22, int j, String string23) {
        super(i, string2, string22, j, string23);
        //TODO Auto-generated constructor stub
    }

    public void placeBirths(String placeBirths){
        System.out.println("Я родился" + placeBirths);
    }
    @Override
    public void Hello(){
        System.out.println("Привет, я отец!");
    }
    
}
