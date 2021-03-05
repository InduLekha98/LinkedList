package javapractice;
public class MyNode<K> implements INode<K> {
    private INode next;

    private K Key;
    public  MyNode(K key){
        this.Key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return Key;
    }

    @Override
    public void SetKey(K Key) {
        this.Key = Key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
