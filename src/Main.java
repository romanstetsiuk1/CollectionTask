import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

//      Task 1: Random float list.
    public static void randomFloatList() {
        List<Float> floatList = new LinkedList<Float>();
        Random random = new Random();
        while (Math.random() > 0.01) {
            Float value = random.nextFloat() * 100.0f;
            floatList.add(value);
        }
        floatList
                .forEach(value -> System.out.println("Result: " + Math.PI * value));
    }

    public static void main(String[] args) {

        randomFloatList();






    }

}
