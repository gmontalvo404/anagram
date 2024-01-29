package com.gmontalvo404.infrastructure.contract;

public class AnagramInputRequest {

    String sequence;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "AnagramInputRequest{" +
                "sequence='" + sequence + '\'' +
                '}';
    }
}
