package hello.core.discount.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discuontPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discuontPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discuontPrice = discuontPrice;
    }

    public int calculatePrice(){
        return itemPrice - discuontPrice;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscuontPrice() {
        return discuontPrice;
    }

    public void setDiscuontPrice(int discuontPrice) {
        this.discuontPrice = discuontPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discuontPrice=" + discuontPrice +
                '}';
    }
}
