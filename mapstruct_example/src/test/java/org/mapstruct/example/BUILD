load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "mapper_test",
    srcs = ["MapperTest.java"],
    test_class = "org.mapstruct.example.MapperTest",
    deps = [
        "@maven//:junit_junit",
        "//mapstruct_example/src/main/java/org/mapstruct/example"
    ],
)