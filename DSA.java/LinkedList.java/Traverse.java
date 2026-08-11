public class Traverse {
    public static int getValue(Node head, int idx){
        Node temp = head;
        int index = 0, ans = -1;
        while(temp!=null){
            if(index==idx){
                ans = temp.val;
                break;
            }
            temp = temp.next;
            index++;
        }
        if(ans==-1) System.out.print("Index Out of Bound: ");
        return ans;
    }
    public static int getValueRec(Node head, int idx){
        return helper(head,idx,0);
    }
    public static int helper(Node head, int idx, int index){
        Node temp = head;
        if(temp==null) return -1;
        if(index==idx){
            return temp.val;
        }
        return helper(temp.next, idx, index+1);
    }
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b; b.next = c;
        c.next = d; d.next = e; 
        e.next = f;
        System.out.println(getValue(a,3));
        System.out.println(getValueRec(a,1));
    }
    
}
