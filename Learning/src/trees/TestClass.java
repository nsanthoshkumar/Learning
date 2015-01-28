package trees;

public class TestClass {

	public static void main(String[] args) {
		Node root=new Node();
		root.data=70;
		root.leftChild=new Node();
		root.leftChild.data=60;
		root.rightChild=new Node();
		root.rightChild.data=70;
		root.rightChild.rightChild=new Node();
		root.rightChild.rightChild.data=45;
		TreeProblems tp=new TreeProblems();
		System.out.println("Height: "+tp.getHeight(root));
		System.out.println("leaves: "+tp.findNumOfLeaves(root));

	}

}
