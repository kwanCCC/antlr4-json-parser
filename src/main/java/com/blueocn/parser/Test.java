package com.blueocn.parser;

import org.apache.commons.lang3.tuple.Pair;

import com.blueocn.entity.Query;

public class Test {
    public static void main(String[] args) {
        String json = "{\"groupby\":[\"region\",\"timeSection\"],\"idAndV\":{\"country\":[\"CN\",\"USA\"],\"metricId\":[5]}}";
        Query parse = ParserEngine.parse(json);
        for (String s : parse.getGroupby()) {
            System.out.println(s);
        }
        for (Pair<String, Object> l : parse.getIdAndV()) {
            System.out.println(l.getLeft() + "--" + l.getRight());
        }
    }
}
