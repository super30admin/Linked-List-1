TC:O(N) SC:O(N)
// Recursive solution
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        // go till the end node and return it 

        if(head==nullptr || head->next==nullptr)
        return head;
        ListNode* reversed = reverseList(head->next);
        head->next->next=head;
        head->next=nullptr;

        return reversed;

        
    }
};

TC:O(N);SC:O(1)

// Iterative solution

class Solution {
public:
    ListNode* reverseList(ListNode* head) {

        if(head==nullptr) return head;
        ListNode* temp=head;
        ListNode* newhead=nullptr;

        while(head)
        {
            head=head->next;
            temp->next=newhead;
            newhead=temp;
            temp=head;
        }

        return newhead;
    }
};