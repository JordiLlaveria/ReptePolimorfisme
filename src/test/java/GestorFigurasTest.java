import org.junit.Assert;

public class GestorFigurasTest {
    Rectangle rectangle;
    Cercle cercle;
    TriangleEQ triangleEQ;
    Quadrat quadrat;

    void main() {
        Figura[] figuras = new Figura[4];
        rectangle = new Rectangle();
        rectangle.SetL1(5);
        rectangle.SetL2(3);
        figuras[0] = rectangle;
        cercle = new Cercle();
        cercle.SetRadi(2);
        figuras[1] = cercle;
        triangleEQ = new TriangleEQ();
        triangleEQ.Setbase(2);
        triangleEQ.Setaltura(5);
        figuras[2]=triangleEQ;
        quadrat = new Quadrat(5);
        figuras[3] = quadrat;
    }

    public void areas(){
        Assert.assertEquals(15,rectangle.area(),1);
        Assert.assertEquals(10,rectangle.area(),0);
    }
    public void suma() {
    }

    public void sort() {
    }
}