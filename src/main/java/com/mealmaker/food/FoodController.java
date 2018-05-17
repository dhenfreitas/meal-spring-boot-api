package com.mealmaker.food;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {

	@GetMapping("/{category}")
    @ResponseBody
    public String get(@PathVariable String category){
        return category;
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(Food food){
        return food.toString();
    }
}
