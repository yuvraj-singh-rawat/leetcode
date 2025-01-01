/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode reversedHead = reverseList(head.next);

        // Reverse the current node
        head.next.next = head; // Make the next node point to the current node
        head.next = null; // Break the current node's original next link

        return reversedHead; // Return the new head
    }
}