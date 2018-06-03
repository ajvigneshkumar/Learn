package com.example;

class node {
	int data;
	node left, right;
	
	node(int value) {
		data= value;
		left=right=null;
	}
	
}

class Res {
    public int val;
}

public class BinTreeMaxPath {
	
	node root;
	
	int findMaxUtil(node root, Res res ) {
		
		int l,r, maxsingle, maxtop;
		
		if (root == null) 
			return 0;
		
		
		l = findMaxUtil (root.left, res);
		r = findMaxUtil(root.right, res);
		
		maxsingle= Math.max(Math.max(l, r) + root.data, root.data);
		
		maxtop = Math.max(maxsingle, l+r+root.data);
		
		res.val = Math.max(res.val, maxtop);
		
		return maxsingle;
		
	}
	


int findMaxSum() {
    return findMaxSum(root);
}

int findMaxSum(node node) {
	 
    // Initialize result
     //int res = Integer.MIN_VALUE;
     Res res = new Res();
     res.val = Integer.MIN_VALUE;

    // Compute and return result
    findMaxUtil(node, res);
    return res.val;
}

/* Driver program to test above functions */
public static void main(String args[]) {
	BinTreeMaxPath tree = new BinTreeMaxPath();
    tree.root = new node(10);
    tree.root.left = new node(2);
    tree.root.right = new node(10);
    tree.root.left.left = new node(20);
    tree.root.left.right = new node(1);
    tree.root.right.right = new node(-25);
    tree.root.right.right.left = new node(3);
    tree.root.right.right.right = new node(4);
    System.out.println("maximum path sum is : " +
                        tree.findMaxSum());
}
}


