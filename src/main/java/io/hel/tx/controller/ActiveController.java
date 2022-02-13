package io.hel.tx.controller;

import io.hel.tx.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hel
 * 2022/2/13 2:46 下午
 * description:
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("active")
public class ActiveController {

    @Autowired
    private ActiveService activeService;

    @GetMapping("add")
    public void addActive() throws Exception {
        activeService.addActive();
    }
}
