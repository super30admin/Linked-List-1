Time Complexity-O(n)
Space Complexity-O(1)
Did the code run on Leetcode? Yes

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==NULL || head->next==NULL)
        {
            return NULL;
        }
        ListNode* a=head;
        ListNode* b=head;
        int flag=0;
        while(b!=NULL && b->next!=NULL)
        {
            a=a->next;
            b=b->next->next;
            if(a==b)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            return NULL;
        }
        a=head;
        while(a!=b)
        {
            a=a->next;
            b=b->next;
        }
        return a;
        
    }
};