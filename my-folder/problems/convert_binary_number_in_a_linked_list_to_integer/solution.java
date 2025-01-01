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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        // Traverse the linked list
        while (head != null) {
            num = num * 2 + head.val; // Shift num left by 1 and add the current node value
            head = head.next; // Move to the next node
        }
        return num;
    }
}