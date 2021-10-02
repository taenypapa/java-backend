package com.bigdata.sample;

import com.bigdata.core.JsonUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sample")
public class SampleController {

    @GetMapping
    public ResponseEntity<?> getSample() {

        return ResponseEntity.ok(JsonUtils.loadFile("/data/sample/sample.json"));
    }
}
