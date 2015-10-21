import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Scanner;

public class Prb2_TriangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double sideAX=sc.nextDouble();
        double sideAY=sc.nextDouble();
        double sideBX=sc.nextDouble();
        double sideBY=sc.nextDouble();
        double sideCX=sc.nextDouble();
        double sideCY=sc.nextDouble();

        double lenghtSideA= Math.sqrt( Math.pow((sideBX - sideAX), 2)+Math.pow((sideBY - sideAY), 2));
        double lenghtSideB= Math.sqrt( Math.pow((sideCX - sideBX), 2)+Math.pow((sideCY - sideBY), 2));
        double lenghtSideC= Math.sqrt( Math.pow((sideAX - sideCX), 2)+Math.pow((sideAY - sideCY), 2));


        if (lenghtSideA+lenghtSideB>lenghtSideC && lenghtSideB+lenghtSideC>lenghtSideA && lenghtSideC+lenghtSideA>lenghtSideB) {

            double halfTrianglePerimeterr = (lenghtSideA + lenghtSideB + lenghtSideC) / 2;
            double areaOtTriangle = Math.sqrt(halfTrianglePerimeterr*(halfTrianglePerimeterr-lenghtSideA)*(halfTrianglePerimeterr-lenghtSideB)*(halfTrianglePerimeterr-lenghtSideC));
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(3);
            System.out.print(nf.format(areaOtTriangle));

        } else{
            System.out.println("0");
        }

    }
}
