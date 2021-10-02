package com.bigdata.core;

import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

@Slf4j
class JsonUtilsTest {

    @Test
    void test() {
        JSONObject jsonObject = JsonUtils.loadFile("data/sample/sample.json");
        log.info(jsonObject.get("firstName").toString());
    }

}