import java.math.MathContext;

public class Cercle extends Figura {
    private int r;

    public int Getr(){
        return this.r;
    }

    public void SetRadi(int radi){
        this.r=radi;
    }
    public double area() {
        return (Math.PI*r*r);
    }

    public int compareTo(Figura o) {
        return (int)(this.area() - o.area());
    }
}