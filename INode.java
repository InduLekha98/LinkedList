package javapractice;

public interface INode<K> {
    K getKey();
    void SetKey(K Key);

    INode getNext();
    void setNext(INode next);
}
