load("@rules_java//java:defs.bzl", "java_library", "java_plugin")

filegroup(
    name = "java_files",
    srcs = glob(["*.java"]),
)

java_library(
    name = "example",
    srcs = [":java_files"],
    visibility = [
        "//visibility:public",
    ],
    deps = [
        ":lombok",
        ":mapstruct",
    ]
)

java_library(
    name = "lombok",
    exported_plugins = [
        ":lombok_plugin",
    ],
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:org_projectlombok_lombok",
    ],
)

java_plugin(
    name = "lombok_plugin",
    generates_api = True,
    processor_class = "lombok.launch.AnnotationProcessorHider$AnnotationProcessor",
    deps = [
        "@maven//:org_projectlombok_lombok",
    ],
)

java_library(
    name = "mapstruct",
    exported_plugins = [
        ":mapstruct_plugin",
    ],
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:org_projectlombok_lombok_mapstruct_binding",
        "@maven//:org_mapstruct_mapstruct_processor",
        "@maven//:org_mapstruct_mapstruct",
    ],
)

java_plugin(
    name = "mapstruct_plugin",
    generates_api = True,
    processor_class = "org.mapstruct.ap.MappingProcessor",
    deps = [
        "@maven//:org_projectlombok_lombok_mapstruct_binding",
        "@maven//:org_mapstruct_mapstruct_processor",
    ],
)

