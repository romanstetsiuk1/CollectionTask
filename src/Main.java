import java.util.*;

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

        System.out.println("*******************************************************" + "\n");
    }

//    Task 2. Find user name by ID in HashMap, using method toLowerCase
    public static void findNameByID() {
        Map<String, String> people = new HashMap<>();
        people.put("a1245b", "Jan Kowalski");
        people.put("a1234a", "Marek Kowalski");
        people.put("aaa45b", "Kasia Nowak");
        people.put("a124bb", "Jan Nowak");

        Scanner peopleID = new Scanner(System.in);
        System.out.println("Enter ID people: ");
        System.out.println(people.get(peopleID.next().toLowerCase()));
    }

    public static void main(String[] args) {

        randomFloatList();
        findNameByID();

        





    }

}
