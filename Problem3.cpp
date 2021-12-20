// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
public:
    ListNode *detectCycle(ListNode *head) 
    {
        ListNode *slow=head;
        ListNode *fast=head;
        ListNode *iter=head;
        ListNode *meet=nullptr;
        while(fast!=nullptr && fast->next!=nullptr)
        {
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast)
            {
                meet=slow;
                break;
            }
            
        }
        if(meet==nullptr)
        {
            return nullptr;
        }
        slow=head;
        while(slow!=fast)
        {
            slow=slow->next;
            fast=fast->next;
        }
        return slow;
    }
};
