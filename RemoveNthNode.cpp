// Time Complexity : O(N) where N=Number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//BruteForce approach

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        ListNode* curr = head;
        int count = 0;
        
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        
        while(curr!= NULL)
        {
            count++;
            curr = curr->next;
        }
        
        curr = dummy;
        
        for(int i=0;i<count-n;i++)
        {
            curr = curr->next;
        }
        curr->next = curr->next->next;
        return dummy->next;
        
    }
};
