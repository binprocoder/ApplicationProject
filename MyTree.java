
package mytree;

class TNode
{
    int data;
    TNode left,right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    TNode(int x , TNode l , TNode r)
    {
        data=x;
        left=l;
        right=r;
    }
    public String toString()
    {
        return data + " ";
    }
}
public class MyTree {
    TNode root;
    void taocayT1()
    {
        TNode a = new TNode(5,new TNode(9,new TNode(6),null),new TNode(8,new TNode(4),null));
        TNode b = new TNode(7,new TNode(2),new TNode(5));
        root = new TNode(3,a,b);
    }
    void taocayT2()
    {
        TNode a = new TNode(2,new TNode(3,new TNode (1),null),new TNode (9,new TNode(2),null));
        TNode b = new TNode(7,new TNode(5,new TNode(0,new TNode(10),null),null),new TNode(4));
        root = new TNode(8,a,b);
    }
    
    void f1(TNode T)
    {
        if(T!=null)
        {
            System.out.print(T);
            f1(T.left);
            f1(T.right);
        }
    }
    void tientu1()
    {
        f1(root);
    }
    void f2(TNode T)
    {
        if(T!=null)
        {
            System.out.print(T);
            f2(T.left);
            f2(T.right);
        }
    }
    void tientu2()
    {
        f2(root);
    }
    void f3(TNode T)
    {
        if(T!=null)
        {
            f3(T.left);
            System.out.print(T);
            f3(T.right);
        }
    }
    void trungtuT1()
    {
        f3(root);
    }
    void f4(TNode T)
    {
        if(T!=null)
        {
            System.out.print(T);
            f2(T.right);
            f2(T.left);
        }
    }
    void hautuT1()
    {
        f4(root);
    }
    int tong(TNode T)
    {
        if(T==null)
            return 0;
        else
            return T.data+ tong(T.left)+ tong(T.right);
    }
    int tong()
    {
        return tong(root);
    }
    public static void main(String[] args) {
        MyTree t = new MyTree();
        t.taocayT1();
        t.tientu1();
    //  t.taocayT2();
    //  t.tientu2();
        System.out.println(" ");
        t.trungtuT1();
        System.out.println(" ");
 //       t.hautuT1();
        System.out.println("Tong cac not trong tong = " + t.tong());
    }
    
}
