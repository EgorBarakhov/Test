package ru.itis.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.itis.demo.services.TagsService;

@Controller
public class TagsController {

    @Autowired
    private TagsService tagsService;

}
