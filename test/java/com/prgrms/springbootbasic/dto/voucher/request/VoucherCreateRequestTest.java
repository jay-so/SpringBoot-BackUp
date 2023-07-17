package com.prgrms.springbootbasic.dto.voucher.request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.prgrms.springbootbasic.enums.voucher.VoucherType;
import java.time.LocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VoucherCreateRequestTest {

    //CreateRequest(요청) DTO 테스트
    @Test
    @DisplayName("getDiscount() 메서드가 정상적으로 동작하는지 테스트")
    void getDiscount() {
        //given
        long discount = 10000;

        //when
        VoucherCreateRequest request = new VoucherCreateRequest(discount, VoucherType.FIXED, LocalDateTime.now());

        //then
        assertEquals(discount, request.getDiscount());
    }

    @Test
    @DisplayName("getType() 메서드가 정상적으로 동작하는지 테스트")
    void getType() {
        //given
        VoucherType type = VoucherType.RATE;

        //when
        VoucherCreateRequest request = new VoucherCreateRequest(60, type, LocalDateTime.now());

        //then
        assertEquals(type, request.getType());

    }

    @Test
    @DisplayName("getCreateAt() 메서드가 정상적으로 동작하는지 테스트")
    void getCreateAt() {
        //given
        LocalDateTime createAt = LocalDateTime.now();

        //when
        VoucherCreateRequest request = new VoucherCreateRequest(10000, VoucherType.FIXED, createAt);

        //then
        assertEquals(createAt, request.getCreateAt());

    }
}