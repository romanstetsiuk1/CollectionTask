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

//    Task 3. Dictionary pl/en based on HashMap
    public static void dictionary() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("kot", "cat");
        dictionary.put("pies", "dog");
        dictionary.put("ma", "have");
        dictionary.put("ludzi", "people");

        Scanner user_text = new Scanner(System.in);
        String userText = user_text.nextLine();

        String[] wordArray = userText.split(" ");
        for (String item : wordArray) {
            if (dictionary.containsKey(item)) {
                System.out.println(dictionary.get(item));
            } else {
                System.out.println(item);
            }
        }
    }

//    Task 4. Convert String to set, return set size
    public static void stringToSet() {
        String word = "aa fff vvv nn c a";
        char[] myWordchar = word.toCharArray();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < myWordchar.length; i++){
            set.add(myWordchar[i]);
        }
        System.out.println("Your string has " + myWordchar.length + " charakters");
        System.out.println(set.size() + " characters never repeat.");
    }


    public static void main(String[] args) {

        randomFloatList();
        findNameByID();
        dictionary();
        stringToSet();


    }

}
