public class ReverseArray2 {

  public static void main(String[] args) {
    // Initialize an array of strings
    String[] fruits = {"apple", "banana", "cherry", "mango", "orange"};

    // Print the elements of the array in reverse order using a for-each loop
    for (String fruit : reversed(fruits)) {
      System.out.println(fruit);
    }
  }
}