package com.example.weatherapi.controller;

import com.example.weatherapi.model.WeatherResponse;
import com.example.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public WeatherResponse getWeather(@RequestParam String city) {
        return weatherService.getWeatherForCity(city);
    }
}
