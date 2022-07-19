class Solution {
public:
    //TC-O(N)
    //SC-O(1)
    ListNode* reverseList(ListNode* head) {
        if(!head||!head->next)return head;
        ListNode *curr=head;
        ListNode *prev=NULL;//PREVIOIS
        ListNode *fast=head;//NEXT NODE
        
        while(curr){
           fast=fast->next;
           curr->next=prev;
            prev=curr;
            curr=fast;
            
        }
        head=prev;
        return head;
    }
};