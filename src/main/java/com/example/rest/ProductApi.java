package com.example.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductApi {

    //Parametryzowanie metod odbywa się:
//    1. Po przez parametr
//    2. Po przez ścieżkę
//    3. Po przez headery
//    4. Po przez body

//    @GetMapping
//   public String getProducts(@RequestParam(required = false, defaultValue = "cos") String name,
//                             @RequestParam String surname) {
//
//       return "GET " + name + " " + surname;
//   }
//    @GetMapping("/{name}/{surname}")
//    public String getProducts(@PathVariable String name,
//                              @PathVariable String surname) {
//        return "GET " + name + " " + surname;
//    }
//        @GetMapping
//        public String getProducts(@RequestHeader String name) {
//            return "GET " + name;
//        }

//    @GetMapping
//    public String getProducts(@RequestBody String name) {
//        return "GET " + name;
//    }







//    @GetMapping("/{example}")
//    public String getProducts(@RequestParam(required = false, defaultValue = "info") String info,
//                               @PathVariable String example) {
//        return "GET" + " " + info + " " + example;
//    }

    @GetMapping
    public ResponseEntity<String> getProducts() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }



//    @PostMapping
//    public String postProducts() {
//        return "POST";
//    }
//    @PutMapping
//    public String putProducts() {
//        return "PUT";
//    }
//    @DeleteMapping
//    public String deleteProducts() {
//        return "DELETE";
//    }
}

