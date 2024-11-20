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
 // to remove the the nth node from the end
 // we need two pointer
 // first = head
 // second = head +n;
 // now we iterate both the pointer untill the second pointer.next is null cause we want the
 // node previous then nth node then we delete the node

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode* first = dummy;
        ListNode* second = dummy;
        
        while(n>=0)
        {
            second = second->next;
            n--;
        }

        while(second != NULL)
        {
            first = first ->next;
            second = second->next;
        }
        //delete the node
        ListNode *tmp = first->next->next;
        first->next = first->next->next;
        tmp = NULL;

        return dummy->next;
    }
};

//Time complexity O(N)
//space complexity O(1)