package com.api.helpers;


import com.api.converters.ConverterBuilder;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Arrays;
import java.util.function.Function;

public class ModelMapperHelper {

    public ModelMapper build(Function<?, Integer>... functions) {
        ModelMapper modelMapper = new ModelMapper();
        Arrays.stream(functions).toList().forEach(function -> {
                    ConverterBuilder<?> converterBuilder = new ConverterBuilder<>(function);
                    modelMapper.addConverter(converterBuilder.build());
                });
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public ModelMapperHelper() {
    }
}
