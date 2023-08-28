package exception;

public enum ErrorCode {
    NOT_VALID_REQUEST("잘못된 요청입니다.");

    public final String message;

    ErrorCode(String message) {
        this.message = message;
    }
}
