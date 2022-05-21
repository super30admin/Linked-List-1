//Iterative
//O(N) Time
//O(1) Space

class Solution {
public:
    ListNode* reverseList(ListNode* head) 
    {
        if(head == NULL || head->next==NULL) return head;
        ListNode *prev = NULL;
        ListNode *curr = head;
        ListNode *nxt = head->next;
        while(curr->next!=NULL){
            curr->next = prev;
            prev = curr;
            curr = nxt;
            nxt = nxt->next;
        }
        curr->next = prev;
        return curr;
    }
};
