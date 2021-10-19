package com.example.Study.ObjectArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ObjectArrayController {

    @RequestMapping("/ObjectArrayTimeTest")
    public String ObjectArrayTimeTest(){

        return "ObjectArray/ObjectArrayTimeTest";
    }
}
