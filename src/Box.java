public class Box<T> {

    private T storedValue;
    private String name;

    public Box(T storedValue, String name) {
        this.storedValue = storedValue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
