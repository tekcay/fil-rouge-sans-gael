package com.api.converters;

import com.api.converters.ConverterTemplate;
import com.api.entities.STheme;
import com.api.entities.SsTheme;
import com.api.helpers.ModelMapperHelper;
import org.modelmapper.ModelMapper;

import java.util.function.Function;

public class FormationConverter implements ConverterTemplate {

    @Override
    public ModelMapper getMappingModelMapper() {
        ModelMapperHelper modelMapperHelper = new ModelMapperHelper();
        Function<STheme, Integer> function1 = STheme::getId;
        Function<SsTheme, Integer> function2 = SsTheme::getId;
        return modelMapperHelper.build(function1, function2);
    }

    @Override
    public ModelMapper getUnMappingModelMapper() {
        return null;
    }

}
