package vn.com.duy.exportmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vn.com.duy.exportmanagement.model.DaiLy;

@Controller
public class StoreController {
    @PostMapping(value = "/store")
    public String createStore(@RequestBody DaiLy daiLy) {

        return "redirect:/index.html";
    }
}
