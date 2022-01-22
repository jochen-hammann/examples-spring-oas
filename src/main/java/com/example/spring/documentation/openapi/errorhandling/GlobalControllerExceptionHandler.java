package com.example.spring.documentation.openapi.errorhandling;

import com.example.spring.documentation.openapi.exceptions.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    // -------------------- [Public Fields] --------------------

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Private Construction / Destruction] --------------------

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    /**
     * Caution: The 404 Not Found error will be added to all endpoints !!!
     */
    //    @ExceptionHandler(BookNotFoundException.class)
    //    @ResponseStatus(HttpStatus.NOT_FOUND)
    //    public ResponseEntity<String> handleBookNotFound(RuntimeException ex)
    //    {
    //        ResponseEntity<String> responseEntity = new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    //        return responseEntity;
    //    }
}
