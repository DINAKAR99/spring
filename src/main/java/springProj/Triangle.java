package springProj;

public class Triangle implements Shape {

    private point PointA;
    private point PointB;
    private point PointC;

    public Triangle() {
    }

    public Triangle(point pointA, point pointB, point pointC) {
        PointA = pointA;
        PointB = pointB;
        PointC = pointC;
    }

    public void draw() {

        System.out.println("pointA=" + PointA.getX() + "," + PointA.getY());
        System.out.println("pointB=" + PointB.getX() + "," + PointB.getY());
        System.out.println("pointC=" + PointC.getX() + "," + PointC.getY());
    }

    public point getPointA() {
        return PointA;
    }

    public void setPointA(point pointA) {
        PointA = pointA;
    }

    public point getPointB() {
        return PointB;
    }

    public void setPointB(point pointB) {
        PointB = pointB;
    }

    public point getPointC() {
        return PointC;
    }

    public void setPointC(point pointC) {
        PointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle [PointA=" + PointA + ", PointB=" + PointB + ", PointC=" + PointC + "]";
    }

    // @Override
    // public void afterPropertiesSet() throws Exception {

    // System.out.println("init.... bean init meth call for triangle");

    // }

    // @Override
    // public void destroy() throws Exception {
    // System.out.println("in destroy");
    // }

}
