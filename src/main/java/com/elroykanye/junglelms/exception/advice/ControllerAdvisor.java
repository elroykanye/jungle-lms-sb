package com.elroykanye.junglelms.exception.advice;

import com.elroykanye.junglelms.exception.ExceptionUtil;
import com.elroykanye.junglelms.exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    /**
     * Handles resolving the exception to a response entity.
     * @param ex The exception to be resolved.
     * @param httpStatus The http status to be used.
     * @return The response entity.
     */
    private ResponseEntity<Object> handler(Exception ex, HttpStatus httpStatus) {
        return new ResponseEntity<>(
                ExceptionUtil.createExceptionResponseBody(ex.getMessage(), httpStatus),
                httpStatus
        );
    }

    @ExceptionHandler(value = {
            UserException.UserCredentialsInvalidException.class
    })
    public ResponseEntity<Object> handleCredentialsInvalidException(Exception ex, WebRequest webRequest) {
        return handler(ex, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = {
            UserException.UserNotFoundWithIdException.class,
            UserException.UserNotFoundWithUsernameException.class
    })
    public ResponseEntity<Object> handleNotFoundException(Exception ex, WebRequest webRequest) {
        return handler(ex, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {
            UserException.UserAlreadyExistsException.class,
    })
    public ResponseEntity<Object> handleAlreadyExistsException(Exception ex, WebRequest webRequest) {
        return handler(ex, HttpStatus.CONFLICT);
    }



}
