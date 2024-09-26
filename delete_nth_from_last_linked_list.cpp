//Time Complexity-O(n)
//Space Complexity-O(1)
//Ran successfully on leetcode
//3 point algo is -
	//Intuition is that we need to get a pointer to one node before the one that we have to delete.
	//Then we can move its next pointer to next->next so that it skips the one we need to delete.
	//1.We have a node before head so that we can handle edge cases.
	//2.We then iterate fast pointer to n nodes from the prev pointer.
	//3.From there, we iterate slow and fast pointers by 1 till fast is NULL.
	//4.Our slow pointer is now at one node before the one we want to delete.
	//5.So we now we can go ahead and move the next pointer of slow to next->next so that there is no access to the original slow->next.

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
        ListNode*prev=new ListNode(0,head);
        ListNode*slow=prev;
        ListNode*fast=prev;
        for(int i=0;i<=n;i++)
            fast=fast->next;
        while(fast!=NULL)
        {
            slow=slow->next;
            fast=fast->next;
        }
        slow->next=slow->next->next;
        return head;
    }
};