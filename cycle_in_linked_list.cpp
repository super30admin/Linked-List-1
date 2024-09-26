/**
//Time Complexity-O(n)
//Space Complexity-O(n), O(1)
//Ran successfully on leetcode
//3 point algo is -
	//1a) First solution is to maintain a hashset which has the addresses of the nodes. 
	//1b) If we encounter the same address then there is a cycle.
	//2a) Second solution is to have slow(+1) and fast(+2) pointers.
	//2b) If they meet, then there is a cycle.
	//2c) To identify where it starts we reset slow pointer to the beginning move slow and fast by 1.
 
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==NULL)
            return NULL;
        ListNode*slow=head;
        ListNode*fast=head;
        bool flag=false;
        while(fast!=NULL && fast->next!=NULL)
        {
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
            return NULL;
        slow=head;
        while(slow!=fast)
        {
            slow=slow->next;
            fast=fast->next;
        }
        return slow;
    }
};