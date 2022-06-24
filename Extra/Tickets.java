package POO_T10_87965;

public class Tickets {
    private String name;
    private String local;
    private int qty;

    public Tickets(String name, String local, int qty){
        this.name = name;
        this.local = local;
        this.qty = qty;
    }

    //Gets e Sets
    String getName(){return this.name;}
    void  setName(String n){name = n;}

    String getLocal(){return this.local;}
    void setScore(String s){local = s;}

    int getQty(){return this.qty;}
    void setQty(int r){qty = r;}

    @Override
    public String toString(){
        return String.format("%-25s %-20s %d", name, local, qty);
    }
    
}
