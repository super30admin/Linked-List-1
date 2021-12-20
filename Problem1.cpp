/ Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes


class Solution {
public:
    ListNode* reverseList(ListNode* head) {
         if(head==nullptr || head->next==nullptr)
        {
            return head;
        }
        ListNode *prev=nullptr;
        ListNode *cur=head;
        while(cur!=nullptr)
        {
            ListNode* temp=cur->next;
            cur->next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
};
