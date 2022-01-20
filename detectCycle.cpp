//TimeComplexity O(n)
//SpaceComplexity O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        
        ListNode* slow=head;
        ListNode* fast=head;
        
        while(fast != NULL && fast->next != NULL ){
            fast=fast->next->next;
            slow=slow->next; 
            if(fast==slow){
                slow=head;
                while(fast!=slow){
                    fast=fast->next;
                    slow=slow->next;
                }
                return fast;
                break;
            }
     
        }
        
        return NULL;
    }
};

