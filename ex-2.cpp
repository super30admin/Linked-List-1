//time complexity: O(n) as we have done in only one pass and travelled all nodes
//space complexity: O(1) we are not using any extra space.
//Idea: 1. travel the whole linked list and then find the length of the linked list an dthen come back and find the node which we need to find.
//How to do it in one pass?
//similar to finding the mid point question take two pointers fast and slow and fast starts  n+1 steps ahead of slow again of slow and both starts from a node before head (lets assume) call it dummy. and when fast reach nullptr then slow-next becomes the node to delete.
//because to reach nullptr by fast it should travel total-(n+1) steps 
//and slow travels total - (n+1) steps. that means for slow to reach end it need n+1 steps
//which impolies it is at n+1 steps from end. which further implies it is one step before of the node we need to delete.


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        //lets create a dummy node before head for our convinience.
        ListNode* dummy = new ListNode(0);
        dummy->next = head; 
        ListNode* fast = dummy;
        ListNode* slow = dummy;

        for(int i=0; i < n+1 ; i++){//fast is n+1 steps ahead of slow 
            fast = fast->next; //
        }

        while(fast != nullptr){
            fast = fast->next;
            slow = slow->next;
        }
        ListNode* NodeToDelete = slow->next;
        slow->next = slow->next->next;

        delete NodeToDelete;

        return dummy->next;
    }
};
