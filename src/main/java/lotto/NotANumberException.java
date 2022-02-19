package lotto;

class NotANumberException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Given input was not a number";
    }
}
