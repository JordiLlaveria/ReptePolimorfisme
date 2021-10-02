public class Rectangle extends Figura {
    public int l1;
    public int l2;
    private double area;

    public Rectangle(){};

    public Rectangle(int lado, int lado1) {
        super();
        this.l1=lado;
        this.l2=lado;
    }

    public double area() {
        return this.area=l1 * l2;
    }
    public int getL1(){
        return this.l1;
    }

    public int getL2(){
        return this.l2;
    }

    public void setL1(int costat1){
        this.l1=costat1;
    }

    public void setL2(int costat2){
        this.l2=costat2;
    }

}