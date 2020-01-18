package kr.co.acewood.sample.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.acewood.sample.model.Member;
import kr.co.acewood.sample.service.SampleService;

@Controller
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleService SampleService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome sample! The client locale is {}.", locale);

        List<Member> memberList = SampleService.getMembers();

        model.addAttribute("memberList", memberList);

        return "sample";
    }
}
