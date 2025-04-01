import java.util.Queue;

public class OrderQueue<T> implements Queue{
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    public int stock;
    public int queueSize;
    
    public OrderQueue(){
        head=null;
        tail=null;
        stock=0;
        queueSize=0;
    }

    public OrderQueue(int stock, int queuesize){
        this.stock=stock;
        this.queueSize=queuesize;
    }

    public void enqueue(int num){
        CustomerOrder order = new CustomerOrder(num);
        if (head==null){
            head= tail= new LinkedNode<T>(order);
            queueSize=1;
        }
        else{
            tail.next= new LinkedNode<T>(order);
            tail=tail.next;
            queueSize++;
        }
    }

    public CustomerOrder dequeue(){
        if (head ==null){
            return null;
        }
        else if (head==tail){
            LinkedNode<T> temp= head;
            stock--;
            head.ship();
            if (head.quantity==0){
                head=head.next;
                tail=null;
            }
            return temp;
        }
        else{
            LinkedNode<T> temp= head;
            stock--;
            head.ship();
            if (head.quantity==0){
                head=head.next;
        }
        return temp;
    }
}

    public CustomerOrder massDequeue(){
        while (head!=null or stock!=0){
            if (head ==null){
                return null;
            }
            else if (head==tail){
                LinkedNode<T> temp= head;
                stock--;
                head.ship();
                if (head.quantity==0){
                    head=head.next;
                    tail=null;
                }
                return temp;
            }
            else{
                LinkedNode<T> temp= head;
                stock--;
                head.ship();
                if (head.quantity==0){
                    head=head.next;
            }
            return temp;
    }
    }
}
    // public OrderQueue<T> addQueue(int quan){
    //      new CustomerOrder(quan);
    //      return ;
    // }

    public void addStock(int num){
        this.stock+=num;
    }


    public String toString(){
        return "the quantity of orders the customer at the front of the que has is: " + head.quantity;
    }

}
    