package com.mm.mothersmeal.Controller.DispatcherCont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SubController {

    @RequestMapping(value="/sub", method = RequestMethod.GET)
    public ModelAndView sub(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Subscribe/Sub");

        return mv;
    }
}
