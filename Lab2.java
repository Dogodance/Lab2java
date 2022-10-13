import java.util.Scanner;

public class Lab2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Point3D a = inputPoint3d();
        Point3D b = inputPoint3d();
        Point3D c = inputPoint3d();

        if (a.equalsPoint(b) || a.equalsPoint(c) || b.equalsPoint(c))
            System.out.println("Wrong! Some points is equals");
        else
            System.out.println("Area between 3 point is: " + computeArea(a,b,c));
    }

    public static Point3D inputPoint3d()
    {
        Point3D obj = new Point3D();

        System.out.print("Input coord x: ");
        if (sc.hasNextDouble())
            obj.setxCoord(sc.nextDouble());
        else
            obj.setxCoord(0);

        System.out.print("Input coord y: ");
        if (sc.hasNextDouble())
            obj.setyCoord(sc.nextDouble());
        else
            obj.setyCoord(0);

        System.out.print("Input coord z: ");
        if (sc.hasNextDouble())
            obj.setzCoord(sc.nextDouble());
        else
            obj.setzCoord(0);

        return obj;
    }

    public static double computeArea(Point3D p1, Point3D p2, Point3D p3)
    {
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p1);
        double s = ((sideA) + (sideB) + (sideC))/2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    private static double distanceBetweenPoint(Point3D p1, Point3D p2)
    {
        return Math.sqrt(
                Math.pow((p1.getxCoord() - p2.getxCoord()), 2) +
                Math.pow(p1.getyCoord() - p2.getyCoord(), 2) +
                Math.pow(p1.getzCoord() - p2.getzCoord(), 2));
    }

}
