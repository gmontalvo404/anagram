package com.gmontalvo404.infrastructure;

import com.gmontalvo404.domain.AnagramInput;
import com.gmontalvo404.domain.AnagramOutput;
import com.gmontalvo404.domain.AnagramService;
import com.gmontalvo404.infrastructure.contract.AnagramInputRequest;
import com.gmontalvo404.infrastructure.contract.AnagramOutputRequest;
import com.gmontalvo404.infrastructure.contract.AnagramRequestMapper;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/anagram")
public class AnagramAPI {

    private final AnagramService anagramService;

    public AnagramAPI(AnagramService anagramService) {
        this.anagramService = anagramService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public AnagramOutputRequest getAllCombinations(AnagramInputRequest anagramInputRequest) {
        AnagramInput anagramInput = AnagramRequestMapper.INSTANCE.toAnagramInput(anagramInputRequest);
        AnagramOutput anagramOutput = this.anagramService.getAllCombinations(anagramInput);
        return AnagramRequestMapper.INSTANCE.toAnagramOutputRequest(anagramOutput);
    }
}
