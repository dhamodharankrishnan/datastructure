package tree;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuCollection extends ArrayList<MenuTreeNode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[][] menuArray;
	public MenuCollection(String menuArray[][]){
		this.menuArray = menuArray;
		generateMenu();
	}
	
	private void generateMenu() {
		
		if(menuArray != null){
			for(int count=0; count< menuArray.length; count++){
				String[] menuElement = menuArray[count];
				
				String menuID = menuElement[0];
				String menuTitle = menuElement[1];
				
				//Get the level.
				TreeNode<MenuData> parentNode = getParentNode(menuID);
				
				if(parentNode != null){
					//Create MenuData
					MenuData menuData = new MenuData(menuID, menuTitle, parentNode.getData().getLevel()+1);
					MenuTreeNode childNode = new MenuTreeNode(menuData);
					parentNode.addChild(childNode);
					
				}else{
					//Create MenuData
					MenuData menuData = new MenuData(menuID, menuTitle, 1);
					MenuTreeNode treeNode = new MenuTreeNode(menuData);
					addChild(treeNode);
					
				}
			}
		}

		
	}
	
	private TreeNode<MenuData> getParentNode(String menuID) {
		TreeNode<MenuData> parentNode = null;
		
		for(int count=0; count< size(); count++){
			TreeNode<MenuData> node = get(count);
			
			if(node.isParent(menuID)){
				//to check actual parent 
				//parentNode = node;
				parentNode = getParentNode(node, menuID);
				break;
			}
		}
		return parentNode;
	}

	private TreeNode<MenuData> getParentNode(TreeNode<MenuData> aParentNode, String menuID) {
		TreeNode<MenuData> parentNode = aParentNode;
		String parentMenuID = parentNode.getData().getTabID();
		String parentID = menuID.substring(0, menuID.lastIndexOf("."));
		
		if(parentID.equals(parentMenuID)){
			return parentNode;
		}else{
			Iterator<TreeNode<MenuData>> nodeIter = parentNode.getChildren().iterator();
			while(nodeIter.hasNext()){
				TreeNode<MenuData> treeNode = nodeIter.next();
				if(treeNode.isParent(menuID)){
					return getParentNode(treeNode, menuID);
				}

			}
		}

		return parentNode;
	}

	public void addChild(MenuTreeNode childNode){
		add(childNode);
	}
}
