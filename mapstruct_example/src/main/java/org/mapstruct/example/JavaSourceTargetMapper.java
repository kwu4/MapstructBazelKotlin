package org.mapstruct.example;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class JavaSourceTargetMapper {
    public static JavaSourceTargetMapper INSTANCE = Mappers.getMapper(JavaSourceTargetMapper.class);
    public abstract JavaTarget javaSourceToTarget(JavaSource javaSource);
}
