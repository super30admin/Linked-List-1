#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* removeNthFromEnd(ListNode* head, int n) {
    int count = 1;
    ListNode* ptr = head;
    while(count<n+1&&ptr){
        ptr=ptr->next;
        count++;
    }
    if(!ptr) return head->next;
    ListNode* back = head;
    while(ptr->next){
        back = back->next;
        ptr = ptr->next;
    }
    back->next=back->next->next;
    return head;        
}

int main(){
    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);
    head->next->next->next->next = new ListNode(5);
    ListNode* newHead = removeNthFromEnd(head,2);
    while(newHead){
        cout<<newHead->val<<" ";
        newHead = newHead->next;
    }
    return 0;
}
// Time Complexity: O(n)    
// Space Complexity: O(1)
// Input: 1->2->3->4->5, n = 2
// Output: 1->2->3->5
// Explanation: The 2nd node from the end is removed.