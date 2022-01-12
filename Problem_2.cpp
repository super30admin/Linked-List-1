/*
Time complexity:
The time complexity is O(n) as we are traversing the linked list
only once
*/

/*
Space Complexity:
The space complexity is O(1) as we are not creating any extra space
*/

/*
Approach:
We are using the basic idea here that if we have to delete a particular node
from the last, how far is it from the start. To find it we find the length
of the list and subtract the given value of n from it.  And then we delete
the node easily. But this technique can be further optimized as in it
once we have to traverse the entire list to find the length and second time
to delete the node. So the time complexity will be O(2n).

To further optimize it we maintain two pointers. First only one pointer moves steps
equal to given value of n. Then both the pointers move until the first pointer hits
null. This brings the second pointer to the node previous to the node which is to be
deleted. Then we can easily delete the node by carefully linking the pointers.

To take care of the edge cases like when there is only one node or two nodes
in the list, we create a dummy node and start from there*/





class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        
        ListNode *first = dummy;
        ListNode *second = dummy;
        int count = 0;
        
        while(count<n){
            first = first->next;
            count++;
        }
        
        while(first->next != nullptr){
            first = first->next;
            second = second->next;
        }
        
        second->next = second->next->next;
        
        return dummy->next;
        
    }
};