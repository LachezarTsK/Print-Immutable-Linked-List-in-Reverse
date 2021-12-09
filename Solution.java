
class Solution {

    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head != null) {
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
    }
}

/*
 This is the ImmutableListNode's API interface. It is created by leetcode.com 
 and the problem must be solved only by applying this interface.
 */
interface ImmutableListNode {
    public void printValue(); // print the value of this node.
    public ImmutableListNode getNext(); // return the next node.
};
