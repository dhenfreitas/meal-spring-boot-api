package com.mealmaker.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {

	@GetMapping("/{category}")
    @ResponseBody
    public String get(@PathVariable Category foodCategory){
        
		
        return foodCategory;
    }
}
