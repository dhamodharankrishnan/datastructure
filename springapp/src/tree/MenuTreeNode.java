package tree;

public class MenuTreeNode extends TreeNode<MenuData> {

	public MenuTreeNode(MenuData inputData) {
		super(inputData);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see tree.ITreeNode#isParent(java.lang.String)
	 */
	public boolean isParent(String menuID) {
		
		if(menuID.startsWith(getData().getTabID())){
			return true;
		}
		return false;
	}

}
