public class Point3D {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    Point3D()
    {
        xCoord = 0.0;
        yCoord = 0.0;
        zCoord = 0.0;
    }

    //Геттеры
    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public double getzCoord() {
        return zCoord;
    }

    //Устанавливают
    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public void setzCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    public boolean equalsPoint(Point3D obj) {
        if (this.xCoord == obj.getxCoord() && this.yCoord == obj.getyCoord() && this.zCoord == obj.getzCoord())
            return true;
        else return false;
    }
}
