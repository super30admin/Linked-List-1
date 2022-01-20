//TimeComplexity O(n)
//SpaceComplexity O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        ListNode* prev=NULL;
        ListNode* next=NULL;
        ListNode* curr=head;
        
        while(curr!=NULL){
            next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
        }
  
        return prev;
    }
};

