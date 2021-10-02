import java.math.MathContext;

public class Cercle extends Figura {
    private int r;
    private double area;

    public int getR(){
        return this.r;
    }

    public void setRadi(int radi){
        this.r=radi;
    }
    public double area() {
        return this.area=(Math.PI*r*r);
    }
}