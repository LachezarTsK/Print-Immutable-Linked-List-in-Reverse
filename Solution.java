
class Solution {

    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head != null) {
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
    }
}

/*
This is the ImmutableListNode's API interface.

The interface is implemented internally by leetcode.com and should not be implemented
by the person solving the problem. However, the problem must be solved only by applying this interface.

If the participant tries to implement it on the website or solve the problem without applying the interface,
the test cases on leetcode.com will not be successful.
 */
interface ImmutableListNode {

    public void printValue(); // print the value of this node.
    public ImmutableListNode getNext(); // return the next node.
};
