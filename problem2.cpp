// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        ListNode *slow = head, *fast = head;

        for(int i=0;i<n;i++) 
            fast = fast->next;
        
        if (!fast) 
            return head->next;

        while (fast->next) 
        {
            slow = slow->next;
            fast = fast->next;
        }

        ListNode* toDelete = slow->next;

        slow->next = slow->next->next;

        delete toDelete;

        return head;
    }
};