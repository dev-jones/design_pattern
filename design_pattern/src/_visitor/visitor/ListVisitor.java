package _visitor.visitor;

import java.util.Iterator;

import _visitor.element.Directory;
import _visitor.element.Entry;
import _visitor.element.File;

public class ListVisitor extends Visitor {
	private String currentdir = "";

	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}
}
