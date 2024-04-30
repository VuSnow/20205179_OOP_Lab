import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public boolean isFull() {
		return (qtyOrdered >= MAX_NUMBERS_ORDERED) ? true : false;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(isFull()) {
			System.out.println("Your order is full!");
            System.out.println("Unable to complete order!");
            return;
		}
		qtyOrdered++;
		itemsOrdered[qtyOrdered-1] = disc;
//		System.out.println("Add successfully");
	}
	
	public int find(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(!disc.equals(itemsOrdered[i])) {
				continue;
			}
			return i;
		}
		return -1;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        int index = find(disc);
        if (index < 0) {
            System.out.println("Unable to find such disc!");
            return;
        }

        qtyOrdered--;
        List <DigitalVideoDisc> afterDeleted = new ArrayList <DigitalVideoDisc>();
        Collections.addAll(afterDeleted, itemsOrdered);
        afterDeleted.remove(index);
        itemsOrdered = afterDeleted.toArray(new DigitalVideoDisc[qtyOrdered]);
        System.out.println("Deletion successful!");
    }
	
	public float totalCost()
    {
        float cost = 0;
        for (int i = 0; i < qtyOrdered; i++)
            cost += itemsOrdered[i].getCost();

        return cost;
    }
}
