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
  public ListNode doubleIt(ListNode head) {
    if (getCarry(head) == 1)
      return new ListNode(1, head);
    return head;
  }

  private int getCarry(ListNode node) {
    int val = node.val * 2;
    if (node.next != null)
      val += getCarry(node.next);
    node.val = val % 10;
    return val / 10;
  }
}