package org.mapstruct.example

import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
abstract class SourceTargetMapper {
    companion object {
        val INSTANCE = Mappers.getMapper(SourceTargetMapper::class.java)
    }
    abstract fun javasourceToTarget(source: JavaSource): Target
    abstract fun sourceToJavaTarget(source: Source): JavaTarget
}
