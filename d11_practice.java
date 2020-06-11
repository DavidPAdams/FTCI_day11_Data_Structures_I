// use in repl.it

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Arrays are just arrays
    String[] myArray = {"Harold", "James", "Frank", "Ralph"};
    System.out.printf("%s\n", myArray[0]);
    int size = myArray.length;
    System.out.println(size);

    // ArrayLists are collections
    ArrayList<Integer> myIntegers = new ArrayList<Integer>(2);
    Integer myInts = myIntegers.size();
    System.out.println(myIntegers);
    System.out.println(myInts);

    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> otherNames = new ArrayList<String>(5);
    names.add("Jack");
    names.add("Doug");
    names.add("Phil");
    names.add("Joe");
    System.out.println(names.size());
    System.out.println(otherNames.size());

    names.add(3, "Danielle");
    System.out.println(names.size());

    String aName = names.get(3);
    System.out.println(aName);

    for(String name : names)System.out.println(name);

    names.remove("Phil");
    for(String name : names)System.out.println(name);

    Collections.reverse(names);
    boolean check = names.contains("Robert");
    System.out.println(check);
    boolean otherCheck = names.contains("Danielle");
    System.out.println(otherCheck);

    for(String name : names)System.out.println(name);
    names.clear();
    System.out.println(names.size());

    String youSay = "Ice cream is da bomb!";
    String str[] = youSay.split(" ");
    for(String word : str) System.out.println(word);
    List<String> arrStr = new ArrayList<String>();
    arrStr = Arrays.asList(str);
    for(String werd : arrStr) System.out.println(werd);

    ArrayList fruitList = new ArrayList(Arrays.asList("Apple", "Banana", "Strawberry"));
    System.out.println(fruitList.size());

    Object[] fruitArray = fruitList.toArray();
    System.out.println(fruitArray.length);

    String fruitString = Arrays.toString(fruitArray);
    System.out.println(fruitString);
    System.out.println(Arrays.toString(fruitArray).replace("[","").replace("]","").replace(",", " "));

    // HashMaps are not collections they are Maps
    HashMap<String, Integer> person = new HashMap<>();
    person.put("James", 18);
    person.put("Henry", 23);
    person.put("Zack", 12);
    person.put("Juan", 45);

    System.out.println(person);
    Integer ageJonny = person.get("Henry");
    System.out.println(ageJonny);

    person.remove("Juan");
    System.out.println(person);

    for(Map.Entry<String, Integer> entry : person.entrySet()){
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.printf("%s is age %d\n", key, value);
    }
  }
}