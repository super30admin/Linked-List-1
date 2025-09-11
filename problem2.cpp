// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Make a dummy node pointing to head, in case we need to delete the head
// Start slow and fast from head, keep moving fast till we have a window of n between slow & fast
// Once the gap is created, move slow and fast till fast reaches the end 
// slow->next will be pointing to the node that needs to be removed

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(-1, head); // -1 -> head
        ListNode* slow = dummy;
        ListNode* fast = dummy;
        int count = 0;
        while(count <= n) {
            count++;
            fast = fast->next;
        }
        while(fast) {
            fast = fast->next;
            slow = slow->next;
        }

        ListNode* temp = slow->next;
        slow->next = temp->next;

        return dummy->next;
    }
};