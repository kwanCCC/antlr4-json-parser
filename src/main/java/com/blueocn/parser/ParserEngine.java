package com.blueocn.parser;

import com.alibaba.fastjson.parser.JSONScanner;

// {"groupby":["region","timeSection"],"idAndV":{"country":"CN","metricId":5}}
public class ParserEngine {
    JSONScanner j = new JSONScanner("{\"groupby\":[\"region\",\"timeSection\"],\"idAndV\":{\"country\":\"CN\",\"metricId\":5}}");
}
