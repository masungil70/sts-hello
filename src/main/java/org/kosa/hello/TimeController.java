package org.kosa.hello;

import java.time.LocalDate;

import org.kosa.hello.service.TimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//�α� ����� ���� ������̼� ����  
@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/time")
public class TimeController {
	final TimeService timeService;
	
    @GetMapping("/getNow")
    public void getNow(Model model) {
        log.info("getNow()...");
        log.info("DB �ð� : " + timeService.getNow());
        model.addAttribute("getNow", timeService.getNow());
    }
}
