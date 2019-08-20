package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping(value = "/board/mainboard")
    public void board_mainboard() {
        return;
    }

    @RequestMapping(value = "/board/list")
    public void board_list() {
        return;
    }

    @RequestMapping(value = "/board/edit")
    public void board_edit() {
        return;
    }

    @RequestMapping(value = "/board/view")
    public void board_view() {
        return;
    }

    @RequestMapping(value = "/board/delete")
    public void board_delete() {
        return;
    }

}