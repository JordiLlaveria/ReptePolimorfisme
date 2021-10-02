public class TriangleEQ extends Figura {
    private int b;
    private int h;
    private double area;

    public double area() {
        return this.area=(b*h)/2;
    }

    public int getBase(){
        return this.b;
    }

    public void setBase(int base){
        this.b=base;
    }

    public int getAltura(){
        return this.h;
    }

    public void setAltura(int altura){
        this.h=altura;
    }

}
