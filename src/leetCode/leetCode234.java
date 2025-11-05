package leetCode;
/*给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。

 */
//反转链表+快慢指针
public class leetCode234 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode current = slow;
        ListNode next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode tail = prev;
        ListNode p1 = head; // 前半部分的头
        ListNode p2 = tail; // 后半部分的头
        while (p2 != null) { // 修复 3：以后半部分为准
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
