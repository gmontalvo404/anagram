package com.gmontalvo404.domain.basicanagrambuilder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BasicAnagramBuilder {

    public Set<String> getAllCombination(String sequence) {
        Node root = new Node(null);
        Node tree = buildTree(root, sequence);
        return getCombinationsFromTree(tree, "");
    }

    private Node buildTree(Node root, String sequence) {
        if(sequence.isEmpty()) {
            return null;
        }

        for(int i = 0; i < sequence.length(); i++) {
            char letter = sequence.charAt(i);
            Node child = new Node(letter);
            root.addChild(child);
            buildTree(child, sequence.substring(0, i) + sequence.substring(i+1));
        }

        return root;
    }

    private Set<String> getCombinationsFromTree(Node node, String sequence) {
        Set<String> combinations = new HashSet<>();
        if(node == null || node.getChildren().isEmpty()) {
            return Collections.emptySet();
        }

        for(Node currentNode: node.getChildren()) {
            combinations.add(sequence + currentNode.getLetter());
            Set<String> currentCombination = getCombinationsFromTree(currentNode, sequence + currentNode.getLetter());
            combinations.addAll(currentCombination);
        }


        return combinations;
    }
}
