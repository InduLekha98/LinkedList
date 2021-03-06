package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class MyLinkedListTest {
        @Test
        public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
            MyNode<Integer> myFirstNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(56);
            MyLinkedList myLinkedList = new MyLinkedList();
            new javapractice.MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.add(mySecondNode);
            myLinkedList.add(myThirdNode);
            myLinkedList.printMyNodes();
            boolean result = myLinkedList.head.equals(myThirdNode) &&
                             myLinkedList.head.getNext().equals(mySecondNode) &&
                             myLinkedList.tail.equals(myFirstNode);
            Assertions.assertTrue(result);
        }
    }
