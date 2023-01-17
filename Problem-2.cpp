


19. Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head.



TC O(n)
SC O(1)






class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *slow = dummy;
        ListNode *fast = dummy;
        int count =0;

        while (count <= n) {
            count++;
            fast = fast->next;
        }

        while (fast != NULL) {
            fast = fast->next;
            slow = slow->next;
        }

        slow->next = slow->next->next;
        return dummy->next;

    }
};
