import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original ArrayList: " + colors);


        for (String color : colors) {
            System.out.println(color);
        }


        colors.add(2, "Purple");
        colors.remove(1);

        System.out.println("\nUpdated ArrayList: " + colors);


        String searchTerm = "Green";
        System.out.println("\nSearching for color: " + searchTerm);
        System.out.println(searchColor(colors, searchTerm));


        ArrayList<String> uniqueColors = removeDuplicates(colors);
        System.out.println("\nArrayList after removing duplicates: " + uniqueColors);
    }

    public static String searchColor(ArrayList<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        if (position == -1) {
            return "Color not found.";
        } else {
            return "Color found at position " + (position + 1) + ".";
        }
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> colors) {
        ArrayList<String> uniqueColors = new ArrayList<String>();
        for (String color : colors) {
            if (!uniqueColors.contains(color)) {
                uniqueColors.add(color);
            }
        }
        return uniqueColors;
    }
}