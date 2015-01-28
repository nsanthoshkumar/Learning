package trees;

public class TreeProblems {
	public int getHeight(Node root){
		int left,right;
		if(root==null){
			return 0;
		}
		left=getHeight(root.leftChild);
		right=getHeight(root.rightChild);
		
		if(left>right){
			return left+1;
		}
		else{
			return right+1;
		}
		
		
	}
	public int findNumOfLeaves(Node root){
		int left=0,right=0;
		if(root!=null){
			left=getHeight(root.leftChild);
			right=getHeight(root.rightChild);
			//left++;
			//right++;
		}
		
		return left+right+1;
		
		
	}
	

}
