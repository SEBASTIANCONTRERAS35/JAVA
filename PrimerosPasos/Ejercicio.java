public class Ejercicio {
    public static void main(String args[]) {
        int base,altura,radio,areaCuadrado,areaRectangulo,areaTriangulo;
        double areaCirculo;
        base=10;
        altura=5;
        radio=15;
        areaCirculo= (3.1416*(radio*radio));
        areaCuadrado=base*base;
        areaRectangulo=base*altura;
        areaTriangulo=(base*altura)/2;
        System.out.println("Circulo: "+areaCirculo);
        System.out.println("Cuadrado: "+areaCuadrado);
        System.out.println("Triangulo: "+areaTriangulo);
        System.out.println("Rectangulo: "+areaRectangulo);
        
    }
}
