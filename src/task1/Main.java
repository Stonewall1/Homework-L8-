package task1;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3, 1, 2);
        double length1 = vector1.vectorLength();
        System.out.printf("Vector1 length = %.3f\n", length1);

        Vector vector2 = new Vector(5, 7, 13);
        double length2 = vector2.vectorLength();
        System.out.printf("Vector2 length = %.3f\n", length2);

        double scalarMulti = Vector.scalarMultiplication(vector1, vector2);
        System.out.println("Scalar multiplication of 2 vectors = " + scalarMulti);

        double angle = Vector.angle(vector1, vector2);
        System.out.printf("Angle between two vectors = %.3f in degrees\n", angle);

        double vectorMulti = Vector.vectorMultiplication(vector1, vector2);
        System.out.printf("Vector multiplication of 2 vectors = %.3f\n", vectorMulti);

        Vector summedVector = Vector.vectorSum(vector1, vector2);
        System.out.println("Result vector after summing 2 vectors = " + summedVector.getX() + ";" +
                summedVector.getY() + ";" + summedVector.getZ());

        Vector substractedVector = Vector.vectorMinus(vector1, vector2);
        System.out.println("Result vector after substracting 2 vectors = " + substractedVector.getX() + ";" +
                substractedVector.getY() + ";" + substractedVector.getZ());

        Vector[] arrayOfRandomVectors = Vector.randomVectors(5);
        for (Vector vector : arrayOfRandomVectors) {
            System.out.printf("Random vector = %.0f;%.0f;%.0f\n", vector.getX(), vector.getY(), vector.getZ());
        }
    }
}
