package com.elroykanye.junglelms.exception;

import org.jetbrains.annotations.Nullable;

public class UserException {
    public static class UserNotFoundWithIdException extends RuntimeException {
        public UserNotFoundWithIdException(Long userId) {
            super("User with ID: " + userId + " not found");
        }
    }

    public static class UserNotFoundWithUsernameException extends RuntimeException {
        public UserNotFoundWithUsernameException(String username) {
            super("User with username: " + username + " not found");
        }
    }

    public static class UserAlreadyExistsException extends Throwable {
        public UserAlreadyExistsException(@Nullable String username) {
            super("User with username: " + username + " already exists");
        }
    }

    public static class UserCredentialsInvalidException extends Throwable {
        public UserCredentialsInvalidException(@Nullable String username) {
            super("Bad credentials for user with username: " + username);
        }
    }
}
