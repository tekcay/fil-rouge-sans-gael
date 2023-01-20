package com.api.converters;

import org.modelmapper.Converter;

import java.util.List;
import java.util.function.Function;

public class ConverterBuilder<T> {

    private final Function<T, Integer> getIdHelper;

    public ConverterBuilder(Function<T, Integer> getIdHelper) {
        this.getIdHelper = getIdHelper;
    }

    public Converter<List<T>, List<Integer>> build() {
        return entity -> entity.getSource()
                .stream()
                .map(getIdHelper)
                .toList();
    }

}
