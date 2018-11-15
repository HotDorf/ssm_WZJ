package com.itm.controller;

import com.itm.domain.Items;
import com.itm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("item/")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findItem")
    public String findItem(HttpServletRequest request){
        Items item = itemsService.findById(1);

        request.setAttribute("item",item);

        return "itemDetail";
    }
}
