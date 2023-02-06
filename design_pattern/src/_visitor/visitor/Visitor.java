package _visitor.visitor;

import _visitor.element.Directory;
import _visitor.element.File;

public abstract class Visitor {

	public abstract void visit(File file);
	public abstract void visit(Directory directory);
}
