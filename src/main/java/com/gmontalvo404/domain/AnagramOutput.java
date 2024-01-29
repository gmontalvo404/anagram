package com.gmontalvo404.domain;

import java.util.Set;

public class AnagramOutput {
    Set<String> combinations;

    public AnagramOutput(Set<String> combinations) {
        this.combinations = combinations;
    }

    public Set<String> getCombinations() {
        return combinations;
    }

    public void setCombinations(Set<String> combinations) {
        this.combinations = combinations;
    }

    @Override
    public String toString() {
        return "AnagramOutput{" +
                "combinations=" + combinations +
                '}';
    }
}
