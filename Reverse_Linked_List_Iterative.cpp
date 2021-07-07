Iterative method
Time Complexity-O(n)
Space Complexity-O(1)
Did the code run on Leetcode? yes

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *p=head,*a=NULL,*b=NULL;
        while(p!=NULL)
        {
            a=p->next;
            p->next=b;
            b=p;
            p=a;
        }
        head=b;
        return b;
        
    }
};