// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        
        if(head == NULL)
            return NULL;
        
        // 2 pointers traversing at different speeds
        ListNode* slow_ptr = head;
        ListNode* fast_ptr = head;

        while(slow_ptr && fast_ptr && fast_ptr->next)
        {
            slow_ptr = slow_ptr->next;
            fast_ptr = fast_ptr->next->next;
            
            // If pointers match condition
            if(slow_ptr == fast_ptr)
            {
                slow_ptr = head;

                // Traverse till the pointers are matching   
                while(slow_ptr != fast_ptr)
                {
                    slow_ptr = slow_ptr->next;
                    fast_ptr = fast_ptr->next;
                }
                
                return slow_ptr;
            }
        }      
        return NULL;
    }
};