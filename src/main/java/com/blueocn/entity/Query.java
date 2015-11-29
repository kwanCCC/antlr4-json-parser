package com.blueocn.entity;

import java.util.List;

import lombok.Data;

import org.apache.commons.lang3.tuple.Pair;

@Data
public class Query {
    private final List<String>               groupby;
    private final List<Pair<String, Object>> idAndV;
    private final Integer                    top;
    private final String                     order;

    private Query(List<String> groupby, List<Pair<String, Object>> idAndV, Integer top, String order) {
        this.groupby = groupby;
        this.idAndV = idAndV;
        this.top = top;
        this.order = order;
    }

    public static QueryBuilder builder() {
        return new QueryBuilder();
    }

    public static class QueryBuilder {
        private List<String>               groupby;
        private List<Pair<String, Object>> idAndV;
        private Integer                    top;
        private String                     order;

        private QueryBuilder() {}

        public QueryBuilder groupby(List<String> groupby) {
            this.groupby = groupby;
            return this;
        }

        public QueryBuilder idAndV(List<Pair<String, Object>> idAndV) {
            this.idAndV = idAndV;
            return this;
        }

        public QueryBuilder top(Integer top) {
            this.top = top;
            return this;
        }

        public QueryBuilder order(String order) {
            this.order = order;
            return this;
        }

        public String toString() {
            return "QueryBuilder (" + groupby + idAndV + top + order + ")";
        }

        public Query build() {
            return new Query(groupby, idAndV, top, order);
        }
    }
}
