package org.mapstruct.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MapperTest {
    @Test
    public void test() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        JavaSource source = new JavaSource(arrayList);
        JavaTarget javaTarget = JavaSourceTargetMapper.INSTANCE.javaSourceToTarget(source);
        Assert.assertEquals(javaTarget.arg, arrayList);
    }
}
