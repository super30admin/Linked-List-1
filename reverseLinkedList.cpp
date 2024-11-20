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

// we can reverse the linked by intalizing three pointer
// curr = head
// prev = -1//dummynode
// temp = head.next

// now by keeping track of the next node we can update the pointer of current
// curr.next = prev
// prev = curr
// curr =tmp
// tmp = tmp.next

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL)
            return head;
        ListNode *curr = head;
        ListNode *prev = NULL;
        ListNode *temp = curr->next;

        while(temp != NULL)
        {
            curr->next = prev;
            prev = curr;
            curr = temp;
            temp = temp->next;
        }
        curr->next = prev;
        return curr;
    }
};
//Time complexity O(N)
//Space complexity O(1)