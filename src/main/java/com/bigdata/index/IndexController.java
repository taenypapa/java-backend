package com.bigdata.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/index")
public class IndexController {

    @Autowired
    private IndexRepository indexRepository;

    @GetMapping
    public ResponseEntity<?> getList() {

        return ResponseEntity.ok(indexRepository.findAll());

    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Long id) {

        return ResponseEntity.ok(indexRepository.findById(id));

    }
}
