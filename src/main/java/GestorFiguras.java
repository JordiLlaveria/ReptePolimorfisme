import java.util.*;
import java.lang.*;

class GestorFiguras {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        System.out.println("Me llamo Jordi\n");
        Rectangle rectangle = new Rectangle();
        rectangle.setL1(5);
        rectangle.setL2(3);
        figuras[0] = rectangle;
        Cercle cercle = new Cercle();
        cercle.setRadi(2);
        figuras[1] = cercle;
        TriangleEQ triangleEQ = new TriangleEQ();
        triangleEQ.setBase(20);
        triangleEQ.setAltura(5);
        figuras[2]=triangleEQ;
        Quadrat quadrat = new Quadrat(5);
        figuras[3] = quadrat;
        double suma = suma(figuras);
        System.out.printf("La suma de las areas es: %f\n",suma);
        sort(figuras);
        System.out.printf("La suma de las areas es: %f\n",suma);
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

