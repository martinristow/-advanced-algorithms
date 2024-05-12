package Napredni_Algoritmi;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
}

    public static Node insert (Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert (root.left,val);
        }
        else{
            root.right=insert (root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }


    public static void main(String args[]){

        int value[]={3,4,6,2,7,9,5,8};
        Node root=null;

        for(int i=0;i<value.length;i++){
            root=insert(root, value[i]);
        }
        inorder(root);
    }
}