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
Approach: We are using three extra pointers here. 'Curr' pointer to iterate over
the list. 'Prev' pointer to keep the track of previous node and 'Temp' pointer to
hold the values for temporary purpose to help in reversing the list.

We can use recursive approach too, but in that case our space complexity will be 
increased. So the optimal solution is iterative solution in this case.
*/

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        ListNode *prev = 0;
        ListNode *curr = head;
        ListNode *temp;
        
        while(curr){
            temp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
        
    }
};