public class LinkedNode<T> {
	public T element;
	public LinkedNode<T> next;
	
	public LinkedNode(T element){
		this.element = element;
		next = null;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public LinkedNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedNode<T> next) {
		this.next = next;
	}

	
}
