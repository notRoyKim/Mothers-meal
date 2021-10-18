package com.mm.mothersmeal.Controller.DispatcherCont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserDispController {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Member/login");

        return mv;
    }
    @RequestMapping(value="/register", method = RequestMethod.GET)
    public ModelAndView register(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Member/Register");

        return mv;
    }
}
