public class Box<T> {

    private T storedValue;

    public Box(T storedValue) {
        this.storedValue = storedValue;
    }

    public T getStoredValue(){
        return storedValue;
    }

    public void setStoredValue(T storedValue){
        this.storedValue = storedValue;
    }

    public static <T> T castValue(Object o, Class<T> storedValue) {
        try {
            return storedValue.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }

}
