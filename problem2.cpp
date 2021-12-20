// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *Dummy=new ListNode(-1);
        Dummy->next=head;
        ListNode *slow=Dummy;
        ListNode *fast=Dummy;
        int count=0;
        while(count<=n)
        {
            fast=fast->next;
            count++;
        }
        while(fast!=nullptr)
        {
            slow=slow->next;
            fast=fast->next;
        }
        ListNode *temp=slow->next;
        slow->next=slow->next->next;
        delete temp;
        return Dummy->next;
    }
};
