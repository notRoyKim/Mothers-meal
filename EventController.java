package com.mm.mothersmeal.Controller.DispatcherCont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EventController {

    @RequestMapping(value="/event", method = RequestMethod.GET)
    public ModelAndView event(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Event/Event");

        return mv;
    }
}
