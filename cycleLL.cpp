TC:O(N)
SC:O(1)
// Using fast and slow pointer ,move fast at twice the speed of low
// If there is a cycle both meet at some point 

class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* fast=head;
        ListNode* slow=head;

        while(fast && fast->next)
        {
            fast=fast->next->next;
            slow=slow->next;
            if(fast==slow)
            return true;
        }
        return false;
    }
};