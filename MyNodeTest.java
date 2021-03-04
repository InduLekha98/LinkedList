package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.security.Key;

public class MyNodeTest {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
            MyNode<Integer> myFirstNode = new MyNode<>( Key: 56);
            MyNode<Integer> mySecondNode = new MyNode<>( Key: 30);
            MyNode<Integer> myThirdNode = new MyNode<>( Key: 70);
            myFirstNode.setNext(mySecondNode);
            mySecondNode.setNext(myThirdNode);
            boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                             mySecondNode.getNext().equals(myThirdNode);
            Assertions.assertTrue(result);
    }

}
