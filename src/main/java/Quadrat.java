public class Quadrat extends Rectangle {

    private int lado;

    public Quadrat (int lado1){
        super(lado1,lado1);
        this.lado=lado1;
    }

    public double area() {
        return lado*lado;
    }

    public int Getlado(){
        return this.lado;
    }

    public void SetL1(int costat){
        this.lado=costat;
    }

}
