package Trees;

import java.util.Scanner;

public class MakeTreeFromArray {
	private static class Node {
	      int data;
	      Node left;
	      Node right;

	      Node(int data, Node left, Node right) {
	         this.data = data;
	         this.left = left;
	         this.right = right;
	      }
	   }

	   public static void display(Node node) {
	      if (node == null) {
	         return;
	      }

	      String str = "";

	      str += node.left == null ? "." : node.left.data;
	      str += " => " + node.data + " <= ";
	      str += node.right == null ? "." : node.right.data;

	      System.out.println(str);

	      display(node.left);
	      display(node.right);
	   }

	   public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int[] arr = new int[scn.nextInt()];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = scn.nextInt();
	      }

	      Node root = construct(arr);
	      if (root == null) {
	         System.out.println("Invalid");
	      } else {
	         display(root);
	      }
	   }

	   public static Node construct(int[] arr) {
		   
		   Node [] nodes= new Node[arr.length];
		   Node root = null;
		   
		   for(int i=0;i<arr.length;i++){
			   nodes[i]=new Node(i, null, null);
			   }
		   
		   for (int i=0;i<arr.length;i++){
			   int child= arr[i];
			   if(child!=-1){
				   if(nodes[child].left==null)
					   nodes[child].left=nodes[i];
				   else if(nodes[child].right==null)
					   nodes[child].right=nodes[i];
				   else
					   return null;
			   }
			   else
				    root=nodes[i];
			   
		   }
		return root;
	      
	   }

	}
