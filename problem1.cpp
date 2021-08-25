//Time Complexity - O(N)
//Space Complexity - O(1)
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head==NULL)
            return head;
        ListNode *prev=NULL;
        ListNode *curr=head;
        ListNode *n=head;
        while(curr!=NULL){
            n=curr->next;
            curr->next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
};