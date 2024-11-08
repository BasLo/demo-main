package com.demo.main.controller;

import com.demo.main.dto.Response;
import com.demo.main.service.BrandService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import liquibase.change.core.CreateTableChange;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
@Validated
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response<String>> getById(@PathVariable("id") @NotNull @Positive Long id) {
        return Response.ok(brandService.getById(id).getName());
    }

}
