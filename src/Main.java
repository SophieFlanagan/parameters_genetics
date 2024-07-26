public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(24);
        integerBox.setStoredValue(42);
    }
}