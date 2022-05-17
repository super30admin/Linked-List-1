// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==NULL || head->next==NULL) {
            return NULL;
        }
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast->next != NULL && fast->next->next!=NULL) {
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast) {
                slow=head;
                while(slow!=fast) {
                    slow=slow->next;
                    fast=fast->next;
                }
                return slow;
            }
        }
        
        return NULL;
    }
};