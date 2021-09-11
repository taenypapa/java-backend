package com.bigdata.center;

import com.bigdata.index.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/center")
public class CenterController {

    @Autowired
    private CenterRepository centerRepository;

    @GetMapping
    public ResponseEntity<?> getList() {

        return ResponseEntity.ok(centerRepository.findAll());

    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Long id) {

        return ResponseEntity.ok(centerRepository.findById(id));

    }
}
