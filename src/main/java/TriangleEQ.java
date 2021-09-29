public class TriangleEQ extends Figura {
    private int b;
    private int h;

    public double area() {

        return (b*h)/2;
    }

    public int Getbase(){
        return this.b;
    }

    public void Setbase(int base){
        this.b=base;
    }

    public int Getaltura(){
        return this.h;
    }

    public void Setaltura(int altura){
        this.h=altura;
    }
}
