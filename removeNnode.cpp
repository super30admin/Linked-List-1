TC:O(N)
SC:O(1)
// Problems faced
// Here the problem is ,if we need to delete the first node,
// to avoid this I have taken a dummy node before head and attached to head
// Instead of initiating fast and slow with head now initiating it with dummy 
// and at last returning dummy->next




//Approach
// here I followe fast and slow pointer approach
// First moved the fast pointer by n
// As next now combinely moving fast and slow pointer until end
// Now slow pointer will be before the nth node from end



class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        ListNode* dummy= new ListNode(0);
        dummy->next=head;

        ListNode* first=dummy;
        ListNode* second=dummy;

        int count=0;

        while(count<n+1)
        {
            first=first->next;
            count++;
            cout<<count;
        }

        while(first)
        {
            first=first->next;
            second=second->next;
        }

        second->next=second->next->next;

        return dummy->next;
    }
};