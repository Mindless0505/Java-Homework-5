import java.util.Queue;

public class OrderQueue<T> implements Queue{
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    public int stock;
    public int queueSize;
    
    public OrderQueue(){
        head=0;
        tail=0;
        stock=0;
        queueSize=0;
    }

    public OrderQueue(int stock, int queuesize){
        this.stock=stock;
        this.queueSize=queuesize;
    }

    public void enqueue(CustomerOrder order){
        if (head==null){
            head= tail= new LinkedNode<T>(order);
            size=1;
        }

    public OrderQueue<T> addQueue(int quan){
         new CustomerOrder(quan);
         return ;
    }

    public void addStock(int num){
        this.stock+=num;
    }


    public String toString(){
        return "the quantity of orders the customer at the front of the que has is: " + front;
    }

}
}