// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        if(head == NULL)
            return head;
        
        ListNode* prev = head;
        ListNode* curr = head->next;
        ListNode* next;
        
        // Keep reversing the pointer directions during traversal
        while(curr)
        {
            next = curr->next;
            
            curr->next = prev;
            
            prev = curr;
            
            curr = next;
        }
        
        head->next = NULL;
        
        return prev;
    }
};