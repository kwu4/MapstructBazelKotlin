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
        "//mapstruct_example/src/main/java/org/mapstruct/example:lombok", # Fails to compile unless this is added
        "//mapstruct_example/src/main/java/org/mapstruct/example:mapstruct",
        "//mapstruct_example/src/main/java/org/mapstruct/example"
    ],
)
