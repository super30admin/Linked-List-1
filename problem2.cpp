//Time Complexity - O(N)
//Space Complexity - O(1)
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head==NULL)
            return head;
        ListNode* dummy = new ListNode(-1);
        dummy->next=head;
        ListNode *slow=dummy,*fast=dummy;
        int cnt=0;
        while(cnt<=n){
            fast=fast->next;
            cnt++;
        }
        while(fast!=NULL){
            slow=slow->next;
            fast=fast->next;
        }
        slow->next=slow->next->next;
        return dummy->next;
    }
};