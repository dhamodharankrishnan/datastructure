package linkedlist;

public class PolyExprImpl {

	public static void main(String args[]){
		
		PolyExprCoeff exprCoeff = new PolyExprCoeff();
		PolExpr dataInput = new PolExpr(3, 2);
		exprCoeff.middleInsert(dataInput );
		
		PolExpr dataInput3 = new PolExpr(-2, 0);
		exprCoeff.middleInsert(dataInput3);

		PolExpr dataInput2 = new PolExpr(5, 1);
		exprCoeff.middleInsert(dataInput2);

		PolyExprCoeff exprCoeffTwo = new PolyExprCoeff();
		PolExpr ydataInput = new PolExpr(2, 2);
		exprCoeffTwo.middleInsert(ydataInput );
		
		PolExpr ydataInput3 = new PolExpr(5, 0);
		exprCoeffTwo.middleInsert(ydataInput3);

		PolExpr ydataInput2 = new PolExpr(-6, 1);
		exprCoeffTwo.middleInsert(ydataInput2);

		exprCoeff.add(exprCoeffTwo);

	}
}
