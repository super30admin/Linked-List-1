//Time Complexity : O(n) "n is number of nodes"
//Space Complexity : O(1)
#include<iostream>
#include<vector>
using namespace std;
struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
};
class Solution {
public:
    int length(ListNode * head)
    {
        int cnt=0;
        while(head != NULL)
        {
            cnt++;
            head = head -> next;
        }
        return cnt;
    }
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int len = length(head);
        int num = len-n;
        if(num == 0)
        {
            ListNode * curr = head;
            head = head -> next;
            delete curr;
            return head;
        }
        ListNode * th = head;

        while(num-1>0)
        {
            head = head -> next;
            num--;
        }
        ListNode * curr = head -> next;
        head-> next = curr -> next;
        delete curr;
        
    return  th;
        
    }
};