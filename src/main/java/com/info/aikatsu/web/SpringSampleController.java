package com.info.aikatsu.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.info.aikatsu.Message;

@Controller
public class SpringSampleController {

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model){
                // 空のフォームオブジェクトをModelに設定
		model.addAttribute("message", new Message());
                // 遷移先を返す(この場合はinput.htmlが遷移先となる)
		return "input";
	}

	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(@ModelAttribute("message") Message form) {
                // 遷移先を返す(この場合はconfirm.htmlが遷移先となる)
		return "confirm";
	}


	@RequestMapping(value = "/unitlist", method = RequestMethod.GET)
	public String unitlist() {
                // 遷移先を返す(この場合はconfirm.htmlが遷移先となる)
		return "unitlist";
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String display() {
                // 遷移先を返す(この場合はconfirm.htmlが遷移先となる)
		return "display";
	}

}