//O(N) time
//O(1) space

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* slow = head;
        ListNode* fast = head;
        int count = 0;
        while(count<n){
            fast = fast->next;
            count++;
        }
        if(fast==NULL) return head->next;
        while(fast->next!=NULL){
            slow = slow->next;
            fast = fast->next;
        }
        slow->next = slow->next->next;
        return head;
    }
};
