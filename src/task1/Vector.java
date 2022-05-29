package task1;

public class Vector extends ThreeDimensionalCoords {
    public Vector(double x, double y, double z) {
        super(x, y, z);
    }

    public double vectorLength() {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    public static double scalarMultiplication(Vector vector1, Vector vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ();
    }

    public static double angle(Vector vector1, Vector vector2) {
        double scalarMulti = scalarMultiplication(vector1, vector2);
        double v1Length = Math.sqrt(vector1.getX() * vector1.getX() + vector1.getY() * vector1.getY() +
                vector1.getZ() * vector1.getZ());
        double v2Length = Math.sqrt(vector2.getX() * vector2.getX() + vector2.getY() * vector2.getY() +
                vector2.getZ() * vector2.getZ());
        double res = scalarMulti / (Math.abs(v1Length) * Math.abs(v2Length));
        double cosInRad = Math.cos(res);
        return Math.toDegrees(cosInRad);
    }

    public static double vectorMultiplication(Vector vector1, Vector vector2) {
        double v1Length = vector1.vectorLength();
        double v2Length = vector2.vectorLength();
        double angle = Vector.angle(vector1, vector2);
        return v1Length * v2Length * Math.sin(angle);
    }

    public static Vector vectorSum(Vector vector1, Vector vector2) {
        return new Vector(vector1.getX() + vector2.getX(),
                vector1.getY() + vector2.getY(),
                vector1.getZ() + vector2.getZ());
    }

    public static Vector vectorMinus(Vector vector1, Vector vector2) {
        return new Vector(vector1.getX() - vector2.getX(),
                vector1.getY() - vector2.getY(),
                vector1.getZ() - vector2.getZ());
    }

    public static Vector[] randomVectors(int n) {
        Vector[] arrayOfRandomVectors = new Vector[n];
        for (int i = 0; i < arrayOfRandomVectors.length; i++) {
            arrayOfRandomVectors[i] = new Vector(Math.random()*100 + 1 ,
                                                 Math.random()*100 + 1 ,
                                                 Math.random()*100 + 1);
        }
        return arrayOfRandomVectors;
    }
}
