public class Box<T> {

    private T storedValue;

    public T getStoredValue(){
        return storedValue;
    }

    public void setStoredValue(T storedValue){
        this.storedValue = storedValue;
    }


    public static <T> T castValue()

   /* public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch(ClassCastException e) {
            return null;
        }
    }*/


}
