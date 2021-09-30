import java.util.*;
import java.lang.*;

class GestorFiguras {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        System.out.println("Me llamo Jordi\n");
        Rectangle rectangle = new Rectangle();
        rectangle.SetL1(5);
        rectangle.SetL2(3);
        figuras[0] = rectangle;
        Cercle cercle = new Cercle();
        cercle.SetRadi(2);
        figuras[1] = cercle;
        TriangleEQ triangleEQ = new TriangleEQ();
        triangleEQ.Setbase(2);
        triangleEQ.Setaltura(5);
        figuras[2]=triangleEQ;
        Quadrat quadrat = new Quadrat(5);
        figuras[3] = quadrat;
        double suma = suma(figuras);
        System.out.printf("La suma de las areas es: %f\n",suma);
        Figura[] llistaordenada = sort(figuras);
    }

    public static double suma(Figura[] listfiguras)
    {
        int i=0;
        double suma=0;
        while (i<listfiguras.length) {
            suma = listfiguras[i].area() + suma;
            i=i+1;
        }
        return suma;
    }

    public static Figura[] sort (Figura[] listfiguras){
        Arrays.sort(listfiguras);
        return listfiguras;
    }

}

