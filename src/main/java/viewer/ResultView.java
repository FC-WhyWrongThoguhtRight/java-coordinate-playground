package viewer;

public class ResultView {
    public static void outputBetween(Double length) {
        System.out.println("두 점 사이 거리는 " + Math.round(length * 1000000) / 1000000d);
    }

    public static void outputAreaSquare(Double area) {
        System.out.println("사각형 넓이는 " + Math.round(area));
    }

    public static void outputAreaTriangle(Double area) {
        System.out.println("삼각형 넓이는 " + Math.round(area * 10) / 10d);
    }
}
