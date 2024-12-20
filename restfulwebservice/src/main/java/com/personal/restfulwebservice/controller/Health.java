package com.personal.restfulwebservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Slf4j
@RestController
public class Health {
    @RequestMapping(value = {"/health", }, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> home(Locale locale) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(new Date());
        return new ResponseEntity<String>("Welcome, Crud Service is running. The time on the server is: "
                + formattedDate, HttpStatus.OK);
    }
}
