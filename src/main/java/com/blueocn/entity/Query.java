package com.blueocn.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.apache.commons.lang3.tuple.Pair;


@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Query {
    private final List<String>         groupby;
    private final Pair<String, String> idAndV;
    private final String               top;
}
