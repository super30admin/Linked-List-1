// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO



class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL || head->next == NULL)
        {
            return NULL;
        }

        ListNode *slow = head;
        ListNode *fast = head;
        ListNode *entry = head;

        while(fast->next && fast->next->next)
        {
            slow = slow->next;
            fast = fast->next->next;

            if(slow == fast)
            {
                while(entry != slow)
                {
                    slow = slow->next;
                    entry = entry->next;
                    
                }
                return entry;
            }

        }  
        return NULL;
    }
};






