package com.doosan.ddpp.web.controller.solution;

import com.doosan.ddpp.model.category.dto.CategoryResponse;
import com.doosan.ddpp.model.category.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@RequestMapping("/api/solution")
@RestController
public class SolutionController {
    public SolutionController() {

    }

    @GetMapping("/list")
    public ResponseEntity<List<CategoryResponse>> getSolutionCategories() {
        // public String getSolutionCategories() {
        // return "I'm Alive";
        CategoryResponse category1 = new CategoryResponse("01", "name01");
        CategoryResponse category2 = new CategoryResponse("02", "name02");
        List<CategoryResponse> categoryResponses = new ArrayList<CategoryResponse>(Arrays.asList(category1, category2));
        return new ResponseEntity<>(categoryResponses, HttpStatus.OK);
    }
}