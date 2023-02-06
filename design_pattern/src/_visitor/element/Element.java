package _visitor.element;

import _visitor.visitor.Visitor;

public interface Element {

	public void accept(Visitor v);
}
