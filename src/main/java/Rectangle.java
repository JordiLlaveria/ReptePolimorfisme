public class Rectangle extends Figura {
    public int l1;
    public int l2;

    public Rectangle(){};

    public Rectangle(int lado, int lado1) {
        super();
        this.l1=lado;
        this.l2=lado;
    }

    public double area() {
        return l1 * l2;
    }
    public int GetL1 (){
        return this.l1;
    }

    public int GetL2(){
        return this.l2;
    }

    public void SetL1(int costat1){
        this.l1=costat1;
    }

    public void SetL2(int costat2){
        this.l2=costat2;
    }

    public int compareTo(Figura o) {
        return (int)(this.area() - o.area());
    }
}