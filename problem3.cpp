//Time Complexity - O(n)
//Space Complexity - O(1)
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==NULL)
            return head;
        ListNode* slow=head;
        ListNode* fast=head;
        bool flag=false;
        while(fast!=NULL&&fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
            if(fast==slow){
                flag=true;
                break;
            }
        }
        if(flag==false)
            return NULL;
        slow=head;
        while(slow!=fast){
            slow=slow->next;
            fast=fast->next;
        }
        return slow;
    }
};