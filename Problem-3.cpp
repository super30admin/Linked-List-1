/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 Time Complexity = O(N)
 Space Complexity = O(1)
 Where N is the number of nodes in the linked list.
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *fast = head;
        ListNode *slow = head;
        if(head==NULL || head->next==NULL)
            return NULL;
        slow = slow->next;
        fast = fast->next->next;
        while(fast!=slow && fast!=NULL && fast->next!=NULL)
        {
            fast = fast->next->next;
            slow = slow->next;
        }
        if(fast==NULL || fast->next==NULL)
            return NULL;
        else
        {
            fast = head;
            while(fast!=slow)
            {
                fast = fast->next;
                slow = slow->next;
            }
            return slow;
        }
    }
};




/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 Time Complexity = O(N)
 Space Complexity = O(1)
 Where N is the number of nodes in the linked list.
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *fast = head;
        ListNode *slow = head;
        if(head==NULL)
            return NULL;
        slow = head;
        fast = head;
        bool flag = false;
        while(fast!=NULL && fast->next!=NULL)
        {
            fast = fast->next->next;
            slow = slow->next;
            if(fast==slow)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            return NULL;
        fast = head;
        while(fast!=slow)
        {
            fast = fast->next;
            slow = slow->next;
        }
        return slow;
    }
};
