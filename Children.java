public class Children extends People {
    private Integer motherId;
    private Integer fatherId;
    
    public Integer getMotherId(){
        return motherId;
    }
    public Integer getFatherId(){
        return fatherId;
    }

    public void setMotherId(){
        this.motherId = motherId;
    }
    public void setFatherId(){
        this.fatherId = fatherId;
    }

 
    public Children(int i, String string, String string2, int j, String string3) {
        super(i, string, string2, j, string3);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Hello(){
        System.out.println("Моя родословная!");
    }
}
