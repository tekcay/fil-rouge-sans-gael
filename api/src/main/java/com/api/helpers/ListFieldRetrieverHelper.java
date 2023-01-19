package com.api.helpers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

/**
 * A class that provides useful methods to retrieve a {@code List<T>} of objects using queries from its corresponding {@code Repository}.
 * @param <T> type for the {@code List<T>} that is passed as an input
 * @param <U> type of Spring {@code Repository} used to do the query
 */
public class ListFieldRetrieverHelper<T, U extends JpaRepository<T, Integer>> {


    public List<T> getListFromId(List<Integer> idList, U repository, Class<T> tClass) {

        return idList.stream()
                .map(id -> repository
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("No such " + tClass.getName() + "with id " + id)))
                .toList();
    }



}
