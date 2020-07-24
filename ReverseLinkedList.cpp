// Time Complexity : O(N) where N=Number of nodes
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        if(head==NULL)
            return head;
        ListNode *curr = head,*next=NULL,*prev = NULL;
        
        while(curr!=NULL){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
};
