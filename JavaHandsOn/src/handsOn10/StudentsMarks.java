package handsOn10;
import java.util.*;

public class StudentsMarks {

    // Function to push names with marks > 75 into stack
    public static void pushAbove75(HashMap<String, Integer> map, Stack<String> stack) {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 75) {
                stack.push(entry.getKey());
            }
        }
    }

    // Function to pop and display stack
    public static void popAndDisplay(Stack<String> stack) {

        System.out.println("Student Marks above 75 in the stack:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        // Creating HashMap with sample data
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Mano", 85);
        studentMarks.put("Shan", 85);
        studentMarks.put("John", 55);
        studentMarks.put("Anu", 60);
        studentMarks.put("Aju", 90);
        studentMarks.put("Frank", 80);

        System.out.println("Student Marks in the HashMap: " + studentMarks);

        // Creating stack
        Stack<String> stack = new Stack<>();

        // Calling functions
        pushAbove75(studentMarks, stack);
    System.out.println(stack);
    }
}