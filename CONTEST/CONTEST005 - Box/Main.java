import java.util.*;
import java.lang.*;
import java.math.*;

class Item {
    private String name;
    private int weight;
    
    // task 1
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public Item(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
}

// task 2
abstract class Box {
    abstract public void add(Item item);
    abstract public boolean isInBox(Item item);
}

// task 3
class BoxWithMaxHeight extends Box {
    ArrayList<Item> items;
    int maxWeight;
    
    public BoxWithMaxHeight(int maxWeight) {
        items = new ArrayList<Item>(maxWeight);
        this.maxWeight = maxWeight;
    }
    
    public void add(Item item) {
        if(items.size() < maxWeight) {
			items.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        for(Item i:items) {
            if (item.getName().equals(i.getName()))
                return true;
        }
        return false;
    }
}

// task 4
public class Main {
	public static void main(String[] args) {
        BoxWithMaxHeight box = new BoxWithMaxHeight(10);
        
        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Pirkka", 5);
        Item item3 = new Item("Kopi Luwak", 5);
        
        box.add(item1);
        box.add(item2);
        box.add(item3);
        
        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println(box.isInBox(new Item("Kopi Luwak")));       
    }
}