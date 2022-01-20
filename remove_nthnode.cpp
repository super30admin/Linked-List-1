//TimeComplexity O(n)
//SpaceComplexity O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        if( head == nullptr){
            return head;
        }
        ListNode* dummy = new ListNode();
        dummy->next=head;
        
        ListNode* fast=dummy;
        ListNode* slow=dummy;
            
        
        int count=0;
        while(count<n){
            fast=fast->next;
            count++;
        }
        
        while(fast->next != NULL){
            slow=slow->next;
            fast=fast->next;
        }
        
        slow->next=slow->next->next;
        return dummy->next;
        
    }
};

