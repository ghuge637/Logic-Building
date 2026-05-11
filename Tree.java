class Node{
    int data;
    Node left;
    Node right;
    
    Node(int n){
        this.data = n;
        left = right = null;
    }
}


public class Tree
{
    static Node root;
    
    public static Node insert( Node root , int n){
        if(root == null){
            return new Node(n);
        }
        
        if(n<root.data){
            root.left = insert( root.left,n);
        }
        
        if(n>root.data){
            root.right = insert(root.right,n);
        }
        
        return root;
    }
    
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    public static void postorder(Node root){
        if(root != null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
      public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
            
        }
    }
    
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);
        
        inorder(root);
        
        System.out.println("Postorder : ");
        postorder(root);
        
        System.out.print("Preorder :" );
        preorder(root);
	}
}
