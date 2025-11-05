package leetCode;
/*给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。*/
//虚拟头节点dummy
//倒数第n个,可以用快慢指针,让快指针先走n步
//边界和数格子好麻烦,让哈基米帮我写了个标准的,再看
public class leetCode19 {
    public static void main(String[] args) {

    }
    static ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. 虚拟头节点，指向 head
        ListNode dummy = new ListNode(-1, head);

        // 2. 指针 1 (fast) 和 指针 2 (slow) 都从 dummy 开始
        ListNode fast = dummy;
        ListNode slow = dummy;

        // 3. fast 先走 n + 1 步
        // 为什么是 n+1 ?
        // 这样当 fast 到达 null 时, slow 刚好在要删除节点的前一个
        for (int i = 0; i < n + 1; i++) {
            // (如果 n 大于链表长度, fast 会变 null)
            if (fast == null) {
                // 这种情况可以根据题目要求处理，这里假设 n 总是有效
                return head;
            }
            fast = fast.next;
        }

        // 4. fast 和 slow 一起走，直到 fast 走到 null
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 5. 此时 slow 就在“要删除的节点”的“前一个节点”上
        //    (例如 [1,2,3,4,5], n=2.
        //     fast 先走 3 步 (n+1) 到 3.
        //     while 循环： fast=4, slow=1; fast=5, slow=2; fast=null, slow=3
        //     slow 停在 3, 3 的下一个是 4 (要删除的))
        slow.next = slow.next.next;

        // 6. 返回 dummy.next
        return dummy.next;
    }
}
