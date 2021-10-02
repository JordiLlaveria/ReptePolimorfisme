public class Quadrat extends Rectangle {

    private int lado;
    private double area;

    public Quadrat (int lado1){
        super(lado1,lado1);
        this.lado=lado1;
    }

    public double area() {
        return this.area=lado*lado;
    }

    public int getLado(){
        return this.lado;
    }

    public void setL1(int costat){
        this.lado=costat;
    }

}
