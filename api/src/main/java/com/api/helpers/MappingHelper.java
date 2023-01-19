package com.api.helpers;

import org.modelmapper.ModelMapper;

import java.util.List;


public interface MappingHelper<DTO, T> {

    static ModelMapper modelMapper = new ModelMapper();

    default DTO mapToDTO(T toMap, Class<DTO> targetClass) {
        return modelMapper.map(toMap, targetClass);
    }

    default T unMapDTO(DTO toMap, Class<T> targetClass) {
        return modelMapper.map(toMap, targetClass);
    }

    default List<DTO> mapListToDTO(List<T> list, Class<DTO> targetClass) {
        return list
                .stream()
                .map(formation -> modelMapper.map(formation, targetClass))
                .toList();
    }

    default List<T> unmapDTOList(List<DTO> list, Class<T> targetClass) {
        return list
                .stream()
                .map(formation -> modelMapper.map(formation, targetClass))
                .toList();
    }
}
