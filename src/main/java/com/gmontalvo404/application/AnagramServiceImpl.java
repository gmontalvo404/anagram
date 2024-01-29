package com.gmontalvo404.application;

import com.gmontalvo404.domain.AnagramInput;
import com.gmontalvo404.domain.AnagramOutput;
import com.gmontalvo404.domain.AnagramService;
import com.gmontalvo404.domain.basicanagrambuilder.BasicAnagramBuilder;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Set;

@ApplicationScoped
public class AnagramServiceImpl implements AnagramService {

    private final BasicAnagramBuilder basicAnagramBuilder;

    public AnagramServiceImpl() {
        this.basicAnagramBuilder = new BasicAnagramBuilder();
    }

    @Override
    public AnagramOutput getAllCombinations(AnagramInput anagramInput) {
        Set<String> combinations = basicAnagramBuilder.getAllCombination(anagramInput.getSequence());
        return new AnagramOutput(combinations);
    }
}
