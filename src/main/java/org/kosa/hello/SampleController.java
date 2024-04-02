package org.kosa.hello;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
}
