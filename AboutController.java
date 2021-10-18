package com.mm.mothersmeal.Controller.DispatcherCont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AboutController {
    @RequestMapping(value="/about", method = RequestMethod.GET)
    public ModelAndView about(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("About/About");

        return mv;
    }
}
