package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;

import java.util.LinkedList;

public class Order {
    LinkedList<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;

    public Order(LinkedList items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order() {
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for(int i=0; i < this.items.size(); i++){
            price += this.items.get(i).getPrice();
        }
        return price;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public String processOrder(){
        return "your order was processed. help me world btw";
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", payment=" + payment +
                ", delivery=" + delivery +
                '}';
    }
}
