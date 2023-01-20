package com.api.converters;

import org.modelmapper.ModelMapper;

public interface ConverterTemplate {

    ModelMapper getMappingModelMapper();
    ModelMapper getUnMappingModelMapper();

}
