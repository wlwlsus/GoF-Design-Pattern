package ch12_visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
