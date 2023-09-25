//TC: O(n) 
//SC: O(1)

//Approach: we use the two pointer concept where maintain the distance between the two equals to n such that it becomes easy for us to delete the node
//once we finish placing the slow and fast pointers, we move until fast is not null one by one
//and immediately delete desired node using slow pointer when fast goes NULL 
//now which node to return? head? NO what if problem ask us to delete that node?
//maintain dummy pointer whose next points to head initially so even if we delete head we can return dummy next

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
      if(head==nullptr )
        return nullptr;
        int count=0;
        ListNode* dummy = new ListNode(0);
        dummy->next=head;

        ListNode* slow=dummy;
        ListNode* fast=dummy;

        while(count<=n)
        {
            fast=fast->next;
            count++;
        }
        while(fast!=nullptr)
        {
            slow=slow->next;
            fast=fast->next;
        }
        slow->next=slow->next->next;

        return dummy->next;
    }
};