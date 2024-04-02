package org.kosa.hello.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckboxFormatter implements Formatter<Boolean> {

    @Override
    public Boolean parse(String text, Locale locale) throws ParseException {
    	log.info("CheckboxFormatter parse() text ->" + text);
        return "on".equals(text);
    }

    @Override
    public String print(Boolean object, Locale locale) {
        return object.toString();
    }
}
