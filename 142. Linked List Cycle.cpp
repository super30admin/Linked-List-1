class Solution {
public:
    //tc-o(N)
    //sc-o(1)
    ListNode *detectCycle(ListNode *head) {
       if(head==NULL||head->next==NULL)
           return NULL;
     
        ListNode *slow=head;
        ListNode *fast=head;
        // ListNode *entry=head;
        while(fast &&fast->next){
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast){
                fast=head;
            while(slow!=fast){
                slow=slow->next;
                fast=fast->next;
            }
              return fast;  
        }
        
        }
        return NULL;
    }
};