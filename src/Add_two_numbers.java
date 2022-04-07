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
class Add_two_numbers {
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 == null && l1 == null) {
            if (carry > 0) {
                res.next = new ListNode(carry);
            }
            return dummy.next;
        }

        if (l2 == null) {
            while (l1 != null) {
                int sum = l1.val + carry;
                carry = sum / 10;
                res.next = new ListNode(sum % 10);
                res = res.next;
                l1 = l1.next;
            }
        }
        if (l1 == null) {
            while (l2 != null) {
                int sum = l2.val + carry;
                carry = sum / 10;
                res.next = new ListNode(sum % 10);
                res = res.next;
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            res.next = new ListNode(carry);
        }
        return dummy.next;
    }*/
}