package com.gmontalvo404.domain;

import com.gmontalvo404.domain.AnagramInput;
import com.gmontalvo404.domain.AnagramOutput;

public interface AnagramService {
    AnagramOutput getAllCombinations(AnagramInput anagramInput);
}
