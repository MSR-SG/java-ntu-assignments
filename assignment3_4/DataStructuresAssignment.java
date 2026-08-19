import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;
import java.util.HashSet;

public class DataStructuresAssignment {
    
    public static void main(String[] args) {

        productInventory();
        manageRecentlyViewedItems();
        studentGradesCourseCodes();

        System.out.println("\n####### This is the End #######\n");
    }

    /**
     * Uses ArrayList. Creates an ArrayList to store 5 product names.
     * Adds two more products to the list.
     * Removes one product from the list.
     * Prints the total number of products and displays all product names.
     */
    public static void productInventory(){
        System.out.println("\n####### Product Inventory #######\n");
        // This creates a product list with 5 elements.
        List<String> productList = new ArrayList<>(Arrays.asList("Banana", "Pineapple", "Orange", "Strawberry", "Grapes"));

        // This adds 2 more items to the productList.
        productList.add("Mango");
        productList.add("Watermelon");

        // This removes 1 item from the productList.
        productList.remove("Orange");

        // This prints the total number of products in the productList.
        System.out.println("Total number of products: " + productList.size());

        // This displays all product names by iterating through the list.
        for(String product : productList){
            System.out.println(product);
        }
        
    }

    /**
     * Uses LinkedList. Creates a LinkedList to simulate "recently viewed items" in an e-commerce store.
     * When the 6th item is added, automatically remove the oldest item (keep only 5 recent items).
     * Displays the final list of recently viewed items.
     */
    public static void manageRecentlyViewedItems(){
        System.out.println("\n####### Recently Viewed Items #######\n");

        int maxSize = 5;
        List <String> recentlyViewedItems = new LinkedList<>();
        // This simulates adding new items one by one, retaining only 5 recent items.
        recentItemOps(recentlyViewedItems, "Pen", maxSize);
        recentItemOps(recentlyViewedItems, "Notebook", maxSize);
        recentItemOps(recentlyViewedItems, "Backpack", maxSize);
        recentItemOps(recentlyViewedItems, "Keychain", maxSize);
        recentItemOps(recentlyViewedItems, "Cap", maxSize);
        
        // Adding the 6th item, removes Pen adds TShirt.
        recentItemOps(recentlyViewedItems, "TShirt", maxSize);

        // Adding the 6th item, removes Notebook adds Socks.
        recentItemOps(recentlyViewedItems, "Socks", maxSize);

        // Adding the 6th item, removes Backpack adds Sunglasses.
        recentItemOps(recentlyViewedItems, "Sunglasses", maxSize);
    }

    /**
     * This private method adds 1 new item to the recently viewed list. 
     * Retains only 5 recent items, removing oldest when the new item arrives.
     * @param recentList
     * @param item
     * @param maxSize
     */
    private static void recentItemOps(List<String> recentList, String item, int maxSize) {
        if (recentList.size() >= maxSize) {                     // This checks if the list has reached limit.
            System.out.println("Removing oldest item " + recentList.get(recentList.size() - 1) );
            recentList.remove(recentList.size() - 1);           // This removes the oldest item            
        }
        System.out.println("Adding new item " + item);
        recentList.add(0, item);                        // This adds the new items when list is within limit.
        System.out.println("Recently viewed items (Total " + recentList.size() + "): " + recentList + "\n");
    }

    /**
     * Creates a HashMap to store student names (as keys) and their grades (as values).
     * Adds 5 unique students with their grades.
     * Prints the grade of a specific student by name.
     * Creates a HashSet to store unique course codes (e.g., "CS101", "MATH201").
     * Adds 5 course codes, including one duplicate, and displays the unique courses.
     */
    public static void studentGradesCourseCodes(){
        System.out.println("\n####### Student Grades and Course Code #######\n");

        Map <String, String> studentsMap = new HashMap<>();      // This is the map of students, key has name, value has grade.
        studentsMap.put("Ana" , "A");                 // This  adds 5 entries to the map {name, grade}
        studentsMap.put("Sam" , "A");
        studentsMap.put("Leo" , "B");
        studentsMap.put("Eli" , "B");
        studentsMap.put("Max" , "A");

        String studentToFind = "Ana";                            // This finds the grade of a specific student.
        String grade = studentsMap.getOrDefault(studentToFind, null);
        if( grade != null ){
            System.out.println(studentToFind + " has grade " + grade);
        }
        else{
            System.out.println(studentToFind + " is not found." );
        }

        Set<String> courseSet = new HashSet<>();
        // This adds unique elements.
        courseSet.add("AI101");
        courseSet.add("FrontEnd102");
        courseSet.add("BackEnd103");
        courseSet.add("Database104");
        courseSet.add("Infra105");
        // This won't add duplicate, Set enforces uniqueness.
        courseSet.add("AI101");                       
        
        System.out.println("Courses (Total " + courseSet.size() + ") in the set :"); 
        for(String course : courseSet){
            System.out.println(course);
        }

    }
}
