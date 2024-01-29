package com.gmontalvo404.domain.basicanagrambuilder;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Character letter;
    private List<Node> children;

    public Node(Character letter) {
        this.letter = letter;
        this.children = new ArrayList<>();
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void addChild(Node child) {
        children.add(child);
    }
}
