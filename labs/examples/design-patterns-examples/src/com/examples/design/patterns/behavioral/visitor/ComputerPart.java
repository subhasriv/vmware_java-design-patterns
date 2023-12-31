package com.examples.design.patterns.behavioral.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
