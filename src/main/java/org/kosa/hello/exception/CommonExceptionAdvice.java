package org.kosa.hello.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice //�ش� ��ü�� �������� ��Ʈ�ѷ����� �߻���Ű�� ���ܸ� ó���ϴ� �������� ���
@Slf4j
public class CommonExceptionAdvice {

	/*
	 * 500�޼����� Internal Server Error �̹Ƿ� @ExceptionHandler�� �̿��ؼ� ó���� ����������
	 * 400�޼����� �߸��� URL�� ȣ���� �� ���̹Ƿ� �ٸ��� ó�����־�� �Ѵ�.
	 */
	
	//500 error
	@ExceptionHandler(Exception.class)
	public String except(Exception e, Model model) {
		/*
		 * ���ܰ� �߻��ϰ� �Ǹ� �ش� ���� �ʵ尡 �޸𸮿� �Ҵ�ȴ�.
		 * �Ҵ�� �����ʵ��� �ּҰ��� ���� ��ü�� �ʿ��ϹǷ� �Ű������� ExceptionŸ���� e��ü�� �����س��´�.
		 */
		log.error("Exception..:.." + e.getMessage());
		model.addAttribute("exception", e);
		log.error(model.toString());
		return "errorPage";
	}
	
	//404 error
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle404() {
		return "errorPage";
	}
}
