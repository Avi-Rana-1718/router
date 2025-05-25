package com.avirana.router.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.avirana.router.service.RedirectService;

@RestController
public class RedirectController {

    RedirectService redirectService;

    RedirectController(RedirectService redirectService) {
        this.redirectService = redirectService;
    }

    @GetMapping("/{id}")
    public RedirectView getRoute(@PathVariable String id, HttpServletRequest request) {
        return redirectService.getRoute(id, request.getRemoteAddr());
    }

    @GetMapping("404")
    public String notFound() {
        return "404";
    }
    
}