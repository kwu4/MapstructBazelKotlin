package org.mapstruct.example

import kotlin.annotation.Target

@Target(AnnotationTarget.CONSTRUCTOR)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
annotation class Default
