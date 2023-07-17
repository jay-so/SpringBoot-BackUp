package com.prgrms.springbootbasic.dto.voucher.request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.prgrms.springbootbasic.enums.voucher.VoucherType;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class VoucherUpdateRequestTest {

    //Update DTO 테스트
    @Mock
    private UUID mockVoucherId;

    @Test
    @DisplayName("getVoucherId() 메소드가 정상적으로 동작하는지 테스트")
    void getVoucherId() {
        //given
        UUID voucherId = UUID.randomUUID();

        //when
        VoucherUpdateRequest request = new VoucherUpdateRequest(voucherId, 60, VoucherType.RATE);

        //then
        assertEquals(voucherId, request.getVoucherId());
    }

    @Test
    @DisplayName("getDiscount() 메소드가 정상적으로 동작하는지 테스트")
    void getDiscount() {
        //given
        long discount = 50;

        //then
        VoucherUpdateRequest request = new VoucherUpdateRequest(mockVoucherId, discount, VoucherType.RATE);

        //then
        assertEquals(discount, request.getDiscount());
    }

    @Test
    @DisplayName("getType() 메소드가 정상적으로 동작하는지 테스트")
    void getType() {
        //given
        VoucherType type = VoucherType.RATE;

        //when
        VoucherUpdateRequest request = new VoucherUpdateRequest(mockVoucherId, 50, type);

        //then
        assertEquals(type, request.getType());
    }
}