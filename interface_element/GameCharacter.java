package interface_element;

import interface_visitor.Visitor;

public interface GameCharacter {
    void accept(Visitor visitor);
}
