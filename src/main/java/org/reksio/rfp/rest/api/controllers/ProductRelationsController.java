package org.reksio.rfp.rest.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductRelationsController
 */
@RestController
public class ProductRelationsController {
    @RequestMapping("/api/products/relations/set-father")
    public ResponseEntity setFather() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
