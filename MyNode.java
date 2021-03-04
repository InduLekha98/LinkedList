package javapractice;


public class MyNode<Key> {
    private MyNode next;

    private MyNode Key; {
        this.Key = getNext().Key;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
