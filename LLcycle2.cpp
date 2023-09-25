//TC: O(N)
//Sc: O(1)

//Appraoch: we use two pointers slow and fast that start at head
//each moving one and two steps slow and fast respectively until fast reaches null
//both the pointers are certain to meet at some point
//the moment both the pointers meet each other is the time we reset fast to head
//from there until my fast meets slow we increment both slow and fast at one step each so that we could find the node where the cycle begins

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* slow=head;
        ListNode* fast=head;
        bool hasCycle=false;
        while(fast!=nullptr and fast->next!=nullptr)
        {
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast)
            {
               hasCycle=true;
               break; 
            }
        }
        if(!hasCycle)
            return nullptr;

        fast=head;
        while(slow!=fast)
        {
            fast=fast->next;
            slow=slow->next;
        }
        return fast;
    }
};