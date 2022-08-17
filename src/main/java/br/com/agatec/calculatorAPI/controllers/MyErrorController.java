package br.com.agatec.calculatorAPI.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyErrorController implements ErrorController {

//    @GetMapping("/error")
//    public ModelAndView errorHandler(HttpServletRequest req) {
//        // Get status code to determine which view should be returned
//        Object statusCode = req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//        // In this case, status code will be shown in a view
//        ModelAndView mav = new ModelAndView("error_default");
//        mav.addObject("code", statusCode.toString());
//        return mav;
//    }
   @GetMapping("/error")
   public String errorHandler(HttpServletRequest req) {
       return "caminho não encontrado";
   }

//
//    public String getErrorPath() {
//        return "/error";
//    }
}