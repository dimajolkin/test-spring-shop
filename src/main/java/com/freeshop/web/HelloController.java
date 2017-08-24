package com.freeshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(WebRequest request, ModelMap model) {
        Map<String, String[]> params = request.getParameterMap();

        model.addAttribute("message", params.toString());

        return "index";
    }
}