package com.example.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Customer;
import com.example.model.User;
import com.example.service.UserService;

@Controller
// @SessionAttributes("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String home() {

		return "redirect:/login";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String getLoingForm(@CookieValue(value = "cookieName", defaultValue = "") String cookieName,
			@CookieValue(value = "cookiePassword", defaultValue = "") String cookiePassword, Model model) {

		if (!cookieName.equals(null) && !cookiePassword.equals(null)) {
			model.addAttribute("cookieName", cookieName);
			model.addAttribute("cookiePassword", cookiePassword);

		}

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticate(HttpServletRequest request, User user, HttpSession session, Model model,
			RedirectAttributes requestAttributes, HttpServletResponse response) {
		if (userService.authenticate(user)) {
			if ("1".equals(request.getParameter("remember"))) {
				Cookie c = new Cookie("cookieName", user.getUser_name());
				c.setMaxAge(2 * 30 * 24 * 60 * 60); // two months
				response.addCookie(c);

				Cookie c2 = new Cookie("cookiePassword", user.getPassword());
				c2.setMaxAge(2 * 30 * 24 * 60 * 60); // two months
				response.addCookie(c2);			

							

			}
			else{
				Cookie c = new Cookie("cookieName", user.getUser_name());
				c.setMaxAge(0); //
				response.addCookie(c);

				Cookie c2 = new Cookie("cookiePassword", user.getPassword());
				c2.setMaxAge(0); // 
				response.addCookie(c2);		
			}

			session.setAttribute("user", user);
			requestAttributes.addFlashAttribute("message", "Refresh and I wll be gone like a flash");

			// model.addAttribute("user", user);
			return "redirect:/index"; // try page refresh, PRG?

		} else {
			model.addAttribute("err_msg", "username and/or passord invlaid.");
			return "login";
		}
	}

	@RequestMapping("/index")
	public String welcome1() {

		return "index";
	}

	@RequestMapping(value = "/logout")
	public String logout(SessionStatus status, HttpSession session) {
		// status.setComplete();
		session.invalidate();
		return "redirect:/login";

	}

}
