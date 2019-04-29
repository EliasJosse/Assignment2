import java.util.*;

public class PrettyPrintVisitor<T> implements TreeVisitor<T, String> {

	private String result = "\n";
	char letter = 65;
	String space  = "   ";

	public String visit(Tree<T> t) {
		return t.accept(this);
	}

	public String visit(Leaf<T> l) {
		//result = result +"\n"+space+l.getValue();
		return "" + l.getValue();
	}

	public String visit(Node<T> n) {
		String depth = "";
		depth += space;
		for (Tree<T> child : n.getChildren()) {
			result+="\n" + depth + child.accept(this);
			
		}
		letter++;
		return result = result +"\n"+ space +letter;
	}
}
