package com.geekbrains.july.market.controllers;

import com.geekbrains.july.market.entities.Product;
import com.geekbrains.july.market.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class SortController {
//    ProductsService productsService;
//
//@Autowired
//    public SortController(ProductsService productsService) {
//        this.productsService = productsService;
//    }
//
//    @GetMapping(value = "/page/{page-number}")
//    public String findPaginated(@PathVariable(name = "page-number") final int pageNo,
//                                @RequestParam(name = "sort-field") final String sortField,
//                                @RequestParam(name = "sort-dir") final String sortDir,
//                                final Model model) {
//
//        // Hardcoding the page-size to 15.
//        final int pageSize = 15;
//        final Page<Product> page = productsService.findPaginated(pageNo, pageSize, sortField, sortDir);
//        final List<Product> productList = page.getContent();
//
//        // Creating the model response.
//        // Note for simplicity purpose we are not making the use of ResponseDto here.
//        // In ideal cases the response will be encapsulated in a class.
//        // pagination parameters
//        model.addAttribute("currentPage", pageNo);
//        model.addAttribute("totalPages", page.getTotalPages());
//        model.addAttribute("totalItems", page.getTotalElements());
//        // sorting parameters
//        model.addAttribute("sortField", sortField);
//        model.addAttribute("sortDir", sortDir);
//        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//        // employees
//        model.addAttribute("listProducts", productList);
//        return "sort";
//    }
}
