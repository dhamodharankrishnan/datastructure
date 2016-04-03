package linkedlist;

public class PolyExprCoeff extends PolyExprList<PolExpr> {

	@Override
	public int compareTo(PolyNode<PolExpr> thisNode, PolyNode<PolExpr> thatNode) {
		
		return thisNode.data.compareTo(thatNode.data);
	}

	public PolyExprCoeff add(PolyExprCoeff exprCoeffTwo) {
		
		PolyNode<PolExpr> thistemp = this.start;
		PolyNode<PolExpr> thattemp = exprCoeffTwo.start;
		
		PolyExprCoeff result = new PolyExprCoeff();
		
		System.out.println("Inside add poly...");
		for(; thistemp != null ; 
				thistemp = thistemp.nextNode, thattemp = thattemp.nextNode){
			System.out.println(thistemp.data);
			
			PolExpr resultPolyExpr = thistemp.data.add(thattemp.data);
			
			result.middleInsert(resultPolyExpr);
		}
		return result;
	}

	
}
