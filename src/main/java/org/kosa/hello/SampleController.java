package org.kosa.hello;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;

//로그 출력을 위한 어너테이션 설정  
@Slf4j
@Controller
public class SampleController {
	
	@RequestMapping(value="/ex1", method = RequestMethod.GET)
    public void ex1(String name, int age){
        log.info("ex1........");
        log.info("name: " + name);
        log.info("age: " + age);
    }
	
	
	@GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "AAA") String name,
                    @RequestParam(name = "age", defaultValue = "20")int age){
        log.info("ex2........");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate){
        log.info("ex3........");
        log.info("dueDate: " + dueDate);
    }
    
    @GetMapping("/ex4")
    public void ex4(Boolean checked){
        log.info("ex4........");
        log.info("checked: " + checked);
    }
    
    @GetMapping("/ex5")
    public String ex5(RedirectAttributes redirectAttributes){

    	//--> @RequestParam 을 이용하여 값을 사용한다
    	// view에서 접근은 ${param.변수명}을 사용한다 
        redirectAttributes.addAttribute("name","ABC");
        
        //--> @ModelAttribute을 이용하여 값을 사용한다
    	// view에서 접근은 ${변수명}을 사용한다 
        redirectAttributes.addFlashAttribute("result", "success");  

        return "redirect:/ex6";
    }

    @GetMapping("/ex6")
    public void ex6(@RequestParam("name") String name,
            @ModelAttribute("result") String result,
            Model model) {
    	log.info("name=" + name);
    	log.info("result=" + result);
    	
    }    
}
