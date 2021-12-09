
using namespace std;

/*
 This is the ImmutableListNode's API interface.
 
 The interface is implemented internally by leetcode.com and should not be implemented
 by the person solving the problem. However, the problem must be solved only by applying this interface.
 
 If the participant tries to implement it on the website or solve the problem without applying the interface,
 the test cases on leetcode.com will not be successful.
 */
class ImmutableListNode {
public:
    void printValue(); // print the value of the node.
    ImmutableListNode* getNext(); // return the next node.
};

class Solution {
public:

    void printLinkedListInReverse(ImmutableListNode* head) {
        if (head != nullptr) {
            printLinkedListInReverse(head->getNext());
            head->printValue();
        }
    }
};
