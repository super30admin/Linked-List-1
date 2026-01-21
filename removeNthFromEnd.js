
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
Intuition:
To remove the nth node from the end in a single pass, we use the two-pointer technique. A dummy 'temp' node is added before the head to handle edge cases like deleting the first node. The 'fast' pointer is moved 'n' steps ahead first, creating a gap of 'n' nodes between 'fast' and 'slow'. Then both pointers move together until 'fast' reaches the end of the list. At this point, 'slow' is positioned just before the node that needs to be removed. We skip that node by adjusting 'slow.next', and finally return 'temp.next' as the updated head of the list.
*/

var removeNthFromEnd = function (head, n) {
    // temp variable to pass the edge cases
    let temp = new ListNode(null);
    temp.next = head;
    let slow = temp, fast = head;
    // move fast first to n places.
    while (n > 0) {
        fast = fast.next;
        n--;
    }

    while (fast != null) {
        tenp = slow;
        slow = slow.next;
        fast = fast.next;
    }
   // remove the link for the node that need to be removed
    slow.next = slow.next.next;
    return temp.next;
};