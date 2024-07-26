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

    public <U> T castValue(U input) {
        T castedBox = ((T) input);
        if (input instanceof Box) {
            return castedBox;
        } else {
            throw new ClassCastException("Error. Try Again!");
        }
    }

}
