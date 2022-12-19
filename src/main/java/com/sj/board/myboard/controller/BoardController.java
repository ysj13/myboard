package com.sj.board.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String list() {
        return "board/list";
    }
}
