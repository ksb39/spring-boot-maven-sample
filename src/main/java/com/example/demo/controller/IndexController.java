package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class IndexController {

    @GetMapping({"/",
            "/{path1}",
            "/{path1}/{path2}",
            "/{path1}/{path2}/{path3}",
            "/{path1}/{path2}/{path3}/{path4}",
            "/{path1}/{path2}/{path3}/{path4}/{path5}",
            "/{path1}/{path2}/{path3}/{path4}/{path5}/{path6}",
            "/{path1}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}",
            "/{path1}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}",
            "/{path1}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}/{path9}",
            "/{path1}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}/{path9}/{path10}"})
    public String index(@PathVariable Optional<String> path1, @PathVariable Optional<String> path2,
                        @PathVariable Optional<String> path3, @PathVariable Optional<String> path4,
                        @PathVariable Optional<String> path5, @PathVariable Optional<String> path6,
                        @PathVariable Optional<String> path7, @PathVariable Optional<String> path8,
                        @PathVariable Optional<String> path9, @PathVariable Optional<String> path10,
                        Model model) {

        String path = "";

        if(path1.isPresent()) path = path + "/" + path1.get();
        if(path2.isPresent()) path = path + "/" +  path2.get();
        if(path3.isPresent()) path = path + "/" +  path3.get();
        if(path4.isPresent()) path = path + "/" +  path4.get();
        if(path5.isPresent()) path = path + "/" +  path5.get();
        if(path6.isPresent()) path = path + "/" +  path6.get();
        if(path7.isPresent()) path = path + "/" +  path7.get();
        if(path8.isPresent()) path = path + "/" +  path8.get();
        if(path9.isPresent()) path = path + "/" +  path9.get();
        if(path10.isPresent()) path = path + "/" +  path10.get();

        model.addAttribute("path", path);

        return "index";
    }
}
