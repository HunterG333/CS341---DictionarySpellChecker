package greer;

public class Node {
	public String word;
	public Node left;
	public Node right;
	
	public Node(String word) {
		this.word = word;
		left = null;
		right = null;
	}
	
	public String toString() {
		return word;
	}
}
