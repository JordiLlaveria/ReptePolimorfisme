import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestorFigurasTest {
    Figura[] figuras ;

    @Before
    public void setUp  () {
        Rectangle rectangle;
        Cercle cercle;
        TriangleEQ triangleEQ;
        Quadrat quadrat;
        figuras = new Figura[4];
        rectangle = new Rectangle();
        rectangle.setL1(5);
        rectangle.setL2(3);
        figuras[0] = rectangle;
        cercle = new Cercle();
        cercle.setRadi(2);
        figuras[1] = cercle;
        triangleEQ = new TriangleEQ();
        triangleEQ.setBase(2);
        triangleEQ.setAltura(5);
        figuras[2]=triangleEQ;
        quadrat = new Quadrat(5);
        figuras[3] = quadrat;
    }

    @Test
    public void areas(){
        Assert.assertEquals(10,this.figuras[0].area(),1);
    }

    @Test
    public void suma() {
        Assert.assertEquals(57, GestorFiguras.suma(this.figuras),2);
    }

    @Test
    public void sort() {

        GestorFiguras.sort(this.figuras);
        Assert.assertEquals(TriangleEQ.class, this.figuras[0].getClass());
    }
}