load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library", "kt_jvm_test")

kt_jvm_test(
    name = "mapper_test",
    srcs = ["FailingKotlinMapperTest.kt"],
    test_class = "org.mapstruct.example.MapperTest",
    deps = [
        "@maven//:junit_junit",
        "//mapstruct_example/src/main/kotlin/org/mapstruct/example",
        "//mapstruct_example/src/main/java/org/mapstruct/example"
    ],
)