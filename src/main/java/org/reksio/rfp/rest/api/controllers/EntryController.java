package org.reksio.rfp.rest.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * EntryController
 */
@RestController
public class EntryController {
    @RequestMapping("/api")
    public ResponseEntity entry() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
