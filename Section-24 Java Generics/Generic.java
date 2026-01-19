public class Generic {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Value: " + strBox.getItem());
    }
}

//Notes:
// A generic class Box that can hold any type of object
// T is a type parameter that will be replaced with a real type when an object of Box is created
// In the main method, we create Box objects for Integer and String types
// and demonstrate setting and getting values of those types.
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
//Hinglish Explanation:
// Ye code ek generic class Box banata hai jo kisi bhi type ka object rakh sakta hai.
// T ek type parameter hai jo Box ka object create karte waqt kisi real type se replace ho jayega.
// Main method mein, hum Integer aur String types ke liye Box objects banate hain
// aur un types ke values set aur get karte hain.