package com.gmontalvo404.infrastructure.contract;

import java.util.Set;

public class AnagramOutputRequest {

    Set<String> combinations;

    public AnagramOutputRequest(Set<String> combinations) {
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
        return "AnagramOutputRequest{" +
                "combinations=" + combinations +
                '}';
    }
}
