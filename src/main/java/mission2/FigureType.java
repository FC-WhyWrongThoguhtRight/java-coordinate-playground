package mission2;

public enum FigureType {

    LINE(2),
    SQUARE(4),
    TRIANGLE(3);

    private final int numOfPoint;

    FigureType(int numOfPoint) {
        this.numOfPoint= numOfPoint;
    }

    // 수를 가져오는 함수
    public int getNumOfPoint() {
        return numOfPoint;
    }

    // 수가 일치하는지 확인하는 함수
    public boolean matchNumOfPoint(int num) {
        return numOfPoint == num;
    }
}
