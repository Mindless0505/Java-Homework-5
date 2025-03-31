public class CustomerOrder{
    public String name;
    public String date;
    public int quantity;

    public CustomerOrder(){
        name="default";
        date="1/1/1";
        quantity=0;
    }

    public CustomerOrder(int quantity){
        this.quantity=quantity;
    }

    public void ship(){
        if(quantity!=0){
            quantity-=1;
        }

    }

}