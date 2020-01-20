Time Complexity-O(n)
Space Complexity-O(1)
Did the code run on Leetcode? Yes

class Solution {
    public:
    int findsize(ListNode* head){
        int sum=0;
        while(head!=NULL)
        {
            sum++;
            head=head->next;
        }
        return sum;
    }
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int size=findsize(head);
        ListNode* a=head;
        ListNode* b=head->next;
        if(n>=size)
        {
            return head->next;
        }
        while(size-n-1!=0)
        {
            a=b;
            b=b->next;
            size--;
        }
        a->next=b->next;
        return head;
    }
};
