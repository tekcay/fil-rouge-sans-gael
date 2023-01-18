package com.api.helpers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;

public interface MappingHelper<DTO, T> {


    default DTO mapToDTO(T toMap, Class<DTO> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(toMap, targetClass);
    }

    default T reverseMapToDTO(DTO toMap, Class<T> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(toMap, targetClass);
    }

    default List<DTO> mapListToDTO(List<T> list, Class<DTO> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return list
                .stream()
                .map(formation -> modelMapper.map(formation, targetClass))
                .toList();
    }

    default List<T> reverseMapListToDTO(List<DTO> list, Class<T> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return list
                .stream()
                .map(formation -> modelMapper.map(formation, targetClass))
                .toList();
    }
}
