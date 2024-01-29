package com.gmontalvo404.domain;

public class AnagramInput {
    String sequence;

    public AnagramInput(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "AnagramInput{" +
                "sequence='" + sequence + '\'' +
                '}';
    }
}
