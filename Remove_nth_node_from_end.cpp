// {Approach 1}
// Time Complexity : O(2n) == O(n) .... List is traversed two times 
// Space Complexity : O(1) ..... extra spance is used dummy node and count which is constant.
//
// {Approach 2}
// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leetcode : https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

/*
Approach 1 : 
In first pass, total size of the node is counted.
We may need to remove the head node as well. To handle such scenario, dummy node is added
to the start of the head.

After couting the nodes; list traversal is done agin for (size - n) times to reach one 
node before the target node. Now, just set currenNode->next = currenNode->next->next;

If we are still at dummy node after the travserse, that means head is neede to be deleted. In
this case just return head->next.

*/

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == nullptr) return head;

        ListNode* ptr = head;
        int listSize = 0;

        //Count Nodes
        while(ptr != nullptr){   
            listSize++;
            ptr = ptr->next;
        }

        //Add dummy node to the start of head
        ListNode* dummy = new ListNode(0);
        dummy->next = head;

        int count = listSize - n;
        ptr = dummy;
        while(count > 0){
            ptr = ptr->next;
            count--;
        }
        if(ptr == dummy) return head->next; // head itself is needed to be deleted.
        ptr->next = ptr->next->next;
        return head;
    }
};


/*
Approach 2 : Using two pointers with Window method 

Two pointers are used slow and fast. Difference between slow and fast pointers is maintained
same as number of node needed from the end.  Therefore, when fast node is at the end of the list;
slow pointer is at node node which is needed to be deleted.
*/

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == nullptr) return head;

        ListNode* dummy = new ListNode(0);
        dummy->next = head;

        ListNode* slow = dummy;
        ListNode* fast = dummy;

        // move fast counter by n times. Slow pointer is still as start
        // Therefore, we have the window between slow and fast, same as required nth node from end.
        while(n>0){
            fast = fast->next;
            n--;
        }

        // now move fast pointer, till it reaches to the end.
        while(fast->next != nullptr){
            fast = fast->next;
            slow = slow->next;
        }
        if(slow == dummy) return head->next;
        slow->next = slow->next->next;
        return head;
    }
};