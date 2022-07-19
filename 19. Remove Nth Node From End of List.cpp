class Solution {
public:
    //TC-O(N)
    //SC-O(1)
    ListNode* removeNthFromEnd(ListNode* head, int n) {
      
        
        ListNode* slow=head;
        ListNode* fast=head;
        int count=0;
        while(count<n){
            fast=fast->next;
            count++;
        }
        if(fast==NULL){
            head=head->next;
            return head;
        }
        while(fast->next){
            slow=slow->next;
            fast=fast->next;
        }
        slow->next=slow->next->next;
        
        return head;
    }
};