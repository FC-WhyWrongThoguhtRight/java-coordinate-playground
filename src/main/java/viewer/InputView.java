package viewer;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public static String inputPosition() {
        System.out.println("좌표를 입력하세요");
        return InputView.sc.nextLine();
    }
}
