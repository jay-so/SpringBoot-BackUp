package com.prgrms.springbootbasic.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerValidator {

    private static final Pattern ENGLISH_PATTERN = Pattern.compile("^[a-zA-Z]*$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$");

    public static void validateInputCustomerInfo(String name, String email) {
        validateName(name);
        validateEmail(email);
    }

    private static void validateName(String input) {
        Matcher match = ENGLISH_PATTERN.matcher(input);
        if (!match.matches()) {
            log.error("고객이 입력한 문자열 {} 이 영어가 아니어서 오류 발생", input);
            throw new IllegalArgumentException("Input: " + input + ", 입력하신 것은 영어가 아닙니다.");
        }
    }

    private static void validateEmail(String input) {
        Matcher match = EMAIL_PATTERN.matcher(input);
        if (!match.matches()) {
            log.error("고객이 입력한 문자열 {} 이 이메일이 아니어서 오류 발생", input);
            throw new IllegalArgumentException("Input: " + input + ", 입력하신 것은 이메일이 아닙니다.");
        }
    }

    public static void validateCreateVoucher(String inputCustomerName, String inputCustomerEmail) {
        validateName(inputCustomerName);
        validateEmail(inputCustomerEmail);
    }
}