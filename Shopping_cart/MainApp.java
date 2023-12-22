import java.util.*;

public class MainApp {
    private static Scanner in = new Scanner(System.in);
    public static ItemOperation obj = new ItemOperation();

    public static void main(String[] args) {
        boolean exit = true;
        int userChoice = 0;
        System.out.println("<-----------------------------WELCOME TO MY SHOPPING ARENA------------------------->");
        printInstructions();
        while (exit) {
            System.out.print("Enter your choice:");
            userChoice = in.nextInt();
            in.nextLine();
            switch (userChoice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    obj.printList();
                    ;
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("ERROR!!!!Enter the number in the list");
                    ;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("0 - To print choices");
        System.out.println("1 - To print shopping List");
        System.out.println("2 - To add an item");
        System.out.println("3 - To remove an item");
        System.out.println("4 - To modify an item");
        System.out.println("5 - To search an item");
        System.out.println("6 - To exit the app");
    }

    public static void addItem() {
        System.out.println("Enter the item to add into your cart");
        obj.addItem(in.nextLine());
    }

    public static void removeItem() {
        if (obj.items.size() <= 0) {
            System.out.println("No items present pls add items");
        } else {
            System.out.println("Enter the item to delete from your cart");
            obj.deleteItem(in.nextLine());
        }
    }

    public static void modifyItem() {
        if (obj.items.size() <= 0) {
            System.out.println("First enter the elements and perform required operation");
        } else {
            System.out.println("Enter the item to modify from your cart");
            String str1 = in.nextLine();

            System.out.println("Enter the NEW-ITEM to modify from your cart");
            String str2 = in.nextLine();

            obj.modifyItem(str1, str2);
        }
    }

    public static void searchItem() {

        if (obj.items.size() <= 0) {
            System.out.println("First enter the elements and perform required operation");
        } else {
            System.out.println("Enter the element to search");
            obj.searchItem(in.nextLine());
        }
    }
}
