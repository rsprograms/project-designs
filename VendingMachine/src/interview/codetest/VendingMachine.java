package interview.codetest;

import java.util.HashSet;
import java.util.Set;

public class VendingMachine {
	
	private Set<Item> itemSet;
	private Set<Item> paymentTypesAcceptedSet;
	
	public VendingMachine() {
		
	}
	
	public VendingMachine(Set<Item> itemList, Set<Item> paymentTypesAcceptedSet) {
		this.itemSet = itemList;
		this.paymentTypesAcceptedSet = paymentTypesAcceptedSet;
	}	
	 
	public Set<Item> reportItemsSoldOut() {
		Set<Item> itemsSoldOut = new HashSet<>();
		for (Item i : itemSet) {
			if (i.getQuantity() == 0) {
				itemsSoldOut.add(i);
			}			
		}
		return itemsSoldOut;
	}
	
	public boolean buy(Item item, PaymentType paymentType) {
		PaymentFactory paymentFactory = new PaymentFactory();
		Payment paymentMode = paymentFactory.getPayment(paymentType);
		return paymentMode.acceptPayment(item.getPrice());	
	}
}
