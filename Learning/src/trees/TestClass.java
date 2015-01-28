package trees;

public class TestClass {

	public static void main(String[] args) {
		Node root=new Node();
		root.data=70;
		TreeProblems tp=new TreeProblems();
		System.out.println("Height: "+tp.getHeight(root));

	}

}
