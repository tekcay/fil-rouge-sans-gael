package com.api.helpers;


import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * An interface to handle mapping a entity of type {@code T} to its corresponding DTO class {@code DTO} and the reverse operation.
 * @param <DTO> the {@code DTO} class
 * @param <T> the entity to work with
 */
public interface MappingHelper<DTO, T> {

    ModelMapper getMappingModelMapper();
    ModelMapper getUnMappingModelMapper();


    /**
     * Maps an entity {@code T} to its corresponding {@code DTO}
     * @param toMap the entity to map
     * @param targetClass the corresponding {@code DTO} class
     * @return the corresponding {@code DTO}
     */
    default DTO mapToDTO(T toMap, Class<DTO> targetClass) {
        return getMappingModelMapper().map(toMap, targetClass);
    }

    /**
     * Unmaps an {@code DTO} to its corresponding entity
     * @param toUnMap the {@code DTO} to unmap
     * @param targetClass the corresponding entity class
     * @return the corresponding entity
     */
    default T unMapDTO(DTO toUnMap, Class<T> targetClass) {
        return getMappingModelMapper().map(toUnMap, targetClass);
    }

    /**
     * Map a list of entity {@code T} to a list of the corresponding {@code DTO}
     * @param listToMap the list of entity to map
     * @param targetClass the corresponding {@code DTO} class
     * @return the corresponding {@code List<DTO>}
     */
    default List<DTO> mapListToDTO(List<T> listToMap, Class<DTO> targetClass) {
        return listToMap
                .stream()
                .map(t -> getMappingModelMapper().map(t, targetClass))
                .collect(Collectors.toList());
    }

    /**
     * Unmap a list of {@code DTO} to a list of the corresponding entity
     * @param listToUnMap the list of {@code DTO} to unMap
     * @param targetClass the corresponding entity class
     * @return the corresponding {@code List<T>} of entity
     */
    default List<T> unMapDTOList(List<DTO> listToUnMap, Class<T> targetClass) {
        return listToUnMap
                .stream()
                .map(t -> getMappingModelMapper().map(t, targetClass))
                .collect(Collectors.toList());
    }
}
