package com.silencedut.hub_compiler;

import com.squareup.javapoet.ClassName;

/**
 * Created by SilenceDut on 2017/1/18 .
 */

public class TypeUtil {

    public static final ClassName MapClz = ClassName.get("java.util", "Map");
    public static final ClassName HashMapClz = ClassName.get("java.util", "HashMap");
    public static final ClassName StringCls = ClassName.get("java.lang", "String");
    public static final ClassName ImplClsFinder = ClassName.get("com.silencedut.hub", "IFindImplClz");

}