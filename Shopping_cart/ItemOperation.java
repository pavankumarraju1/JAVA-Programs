import java.util.*;

class ItemOperation {
    public ArrayList<String> items = new ArrayList<>();

    public void addItem(String str) {
        items.add(str);
    }

    public void modifyItem(String oldstr, String newstr) {
        int pos = items.indexOf(oldstr);
        items.set(pos, newstr);
        System.out.println("The item " + oldstr + "  has updated to " + newstr + " at " + (pos+1));
    }

    public void deleteItem(String str) {
        int index = items.indexOf(str);
        items.remove(index);
    }

    public void searchItem(String str) {
        int idx = items.indexOf(str);
        if (idx >= 0) {
            System.out.println("The item " + str + "  found at " + (idx + 1));
        } else {
            System.out.println("Item not found");
        }
    }

    public void printList() {
        if (items.size() <= 0) {
            System.out.println("NO items found");
        } else {
            System.out.println("Total " + items.size() + " in your cart");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + 1 + ")" + items.get(i));
            }
        }
    }
}