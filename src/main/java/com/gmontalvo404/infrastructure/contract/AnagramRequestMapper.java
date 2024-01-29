package com.gmontalvo404.infrastructure.contract;

import com.gmontalvo404.domain.AnagramInput;
import com.gmontalvo404.domain.AnagramOutput;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnagramRequestMapper {

    AnagramRequestMapper INSTANCE = Mappers.getMapper(AnagramRequestMapper.class);

    AnagramInput toAnagramInput(AnagramInputRequest anagramInputRequest);
    AnagramOutputRequest toAnagramOutputRequest(AnagramOutput anagramOutput);
}
