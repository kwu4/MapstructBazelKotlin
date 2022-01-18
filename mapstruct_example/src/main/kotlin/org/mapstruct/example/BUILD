load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library", "kt_jvm_test")
load("@rules_java//java:defs.bzl", "java_library", "java_plugin")

filegroup(
    name = "kotlin_files",
    srcs = glob(["*.kt"]),
    visibility = ["//mapstruct_example/src/test/kotlin/org/mapstruct/example:__subpackages__"],
)

kt_jvm_library(
    name = "example",
    srcs = [":kotlin_files"],
    visibility = [
        "//mapstruct_example/src/main/kotlin/org/mapstruct/example:__subpackages__",
        "//mapstruct_example/src/test:__subpackages__",
    ],
    deps = [
        "@maven//:org_mapstruct_mapstruct",
        ":mapstruct",
        "//mapstruct_example/src/main/java/org/mapstruct/example"
    ],
)

java_library(
    name = "mapstruct",
    exported_plugins = [
        ":mapstruct_plugin",
    ],
    visibility = [
        "//visibility:public",
    ],
    exports = [
        "@maven//:org_mapstruct_mapstruct_processor",
    ],
)

java_plugin(
    name = "mapstruct_plugin",
    processor_class = "org.mapstruct.ap.MappingProcessor",
    deps = [
        "@maven//:org_mapstruct_mapstruct_processor",
    ],
)
