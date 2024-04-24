public class Triangle {
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (!isValidTriangle(side1, side2, side3)) {
            return "NotATriangle";
        }

        if (isEquilateral(side1, side2, side3)) {
            return "Equilateral";
        }

        if (isIsosceles(side1, side2, side3)) {
            return "Isosceles";
        }

        if (isRightTriangle(side1, side2, side3)) {
            return "RightTriangle";
        }

        return "Scalene";
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    private static boolean isEquilateral(int side1, int side2, int side3) {
        return side1 == side2 && side2 == side3;
    }

    private static boolean isIsosceles(int side1, int side2, int side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        int maxSide = Math.max(side1, Math.max(side2, side3));
        return (maxSide * maxSide) == (side1 * side1) + (side2 * side2) + (side3 * side3) - (maxSide * maxSide);
    }
}