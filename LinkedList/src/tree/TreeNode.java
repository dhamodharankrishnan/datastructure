package tree;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeNode<T>  implements ITreeNode{

	private T data;
	
	private List<TreeNode<T>> children;
	
	public TreeNode(T inputData){
		this.data = inputData;
		children = new ArrayList<TreeNode<T>>();
	}
	
	public void addChild(TreeNode<T> childNode){
		children.add(childNode);
	}

	public T getData() {
		return data;
	}

	public List<TreeNode<T>> getChildren() {
		return children;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", children=" + children + "]";
	}
	
	
	
}
