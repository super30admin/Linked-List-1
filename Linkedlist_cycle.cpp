// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
    bool flag = false;
    ListNode* slow=head;
    ListNode* fast=head;   
        while(fast&&fast->next)
        {
            slow=slow->next;
            fast=fast->next->next;
          if(slow==fast){
               flag = true;
               break;
          }
             
        }
        if(!flag) return NULL;
        slow=head;
        while(slow!=fast)
        {
            slow=slow->next;
            fast=fast->next;
        }
        return slow;
    }
};