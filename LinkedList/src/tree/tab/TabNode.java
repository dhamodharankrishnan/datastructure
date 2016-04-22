package tree.tab;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The TabNodes will be created with the default unselected bgcolor and style.
 * Later on, the selection will be set appropriately. 
 * */
public class TabNode implements Serializable, ITabConstants
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tabID;
	private int level;
	private String title;
	private boolean hasChild;
	
	/**
	 * For nodes in level 1, the parent Node will be null.
	 * For nodes in level 2, their parent node will be the level 1 node.
	 * For nodes in level 3, their parent node will be the level 2 node.
	 * 
	 * And this could be extended to any level.
	 * */
	private TabNode parentNode; 
	
	/**
	 * Collection of Nodes that come under this Node. 
	 * */
	private ArrayList children;
	
	/**
	 * The style i.e. to be used to show the label bevelled up or down based on the selection.
	 * */
	private String style;
	
	/**
	 *  
	 * */
	private String backgroundColor;
	
	/**
	 * 
	 * */
	private boolean selected;
	
	private TabCollection tabCollection;
	/**
	 * For root node, parentNode will be null
	 * */
	public TabNode(String aTabID, TabNode aParentNode, int aLevel, String aTitle, String aStyle, String aBgColor, TabCollection aTabColl)
	{
		tabID = aTabID;
		level = aLevel;
		title = aTitle;
		hasChild = false;
		parentNode = aParentNode;
		children = new ArrayList();
		style = aStyle;
		backgroundColor = aBgColor;
		
		selected = false;
		tabCollection = aTabColl; 
	}
	
	public void addChild(TabNode childNode)
	{
		hasChild = true;
		children.add(childNode);
	}
	
	/**
	 * @param tabID2 
	 * 
	 * */
	public void setSelected(String aTabID)
	{
		//To make the zeroth node of the parent to be selected, if the parent has been selected directly.
		if(tabID.startsWith(aTabID))
		{
			if(children != null && children.size() > 0)
			{
				TabNode tabNode = ((TabNode)children.get(0));
				tabNode.setSelected(tabNode.getTabID());
			}
		}
		
		//To mark the last node to be selected and added to the Multi Level Tab.
		if(children != null && children.size() > 0)
		{
			for(int count=0; count<children.size(); count++)
			{
				TabNode tabNode = ((TabNode)children.get(count));
				if( tabNode.getTabID().equals(aTabID))
				{
					tabNode.setSelected(aTabID);
				}
			}
		}
		
		//This is to make the current node as selected.
		setSelected();
	}

	/**
	 * This is for marking the selected status
	 * */
	private void setSelected()
	{
		selected = true;
		style = tabCollection.getSelstyle(level);
		backgroundColor = tabCollection.getSelbgColor(level);
		
		System.out.println("tabID="+tabID+", style="+style+", bgColor="+backgroundColor);
		
		//Insert into the multiLevelList from here.
		tabCollection.addToMultiLevelList(this.getChildren());
	}

	public boolean getSelected()
	{
		return selected;
	}

	public ArrayList getChildren()
	{
		return children;
	}

	public boolean getHasChild()
	{
		return hasChild;
	}

	public int getLevel()
	{
		return level;
	}

	public TabNode getParentNode()
	{
		return parentNode;
	}

	public String getStyle()
	{
		return style;
	}

	public String getTabID()
	{
		return tabID;
	}

	public String getTitle()
	{
		return title;
	}

	public boolean isParent(String aTabID)
	{
		if(aTabID.startsWith(tabID))
				return true;
		return false;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("(L="+level);
		sb.append(", T="+tabID+"."+title  +", selected="+selected+")");
		//sb.append(", T="+tabID+"."+title +")");
//		if(children.size() >0)
//			sb.append("|"+children);
		return sb.toString();
	}

	public String getBackgroundColor()
	{
		return backgroundColor;
	}
}
