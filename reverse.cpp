//TC: O(N)
//SC: O(1)
//Approach: maintain prev and next nodes so that we can shift the flow of pointers 
//while our current node is not null we save the next node by curr->next, then we also make sure to establish link to prev node by curr->next, since we want to get going with the rest of the list we just slide prev to curr and curr to next node. This process goes on until my curr is null
//now who's my head? curr went null next node went null it should be prev node that points to the head of the list
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* prev=NULL;
        ListNode* curr=head;
        ListNode* nextNode;
        while(curr!=nullptr)
        {
            nextNode=curr->next;
            curr->next=prev;
            prev=curr;
            curr=nextNode;

        }
        return prev;
    }
};