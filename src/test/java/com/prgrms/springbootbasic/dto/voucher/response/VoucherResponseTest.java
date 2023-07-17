package com.prgrms.springbootbasic.dto.voucher.response;

import com.prgrms.springbootbasic.enums.voucher.VoucherType;
import java.time.LocalDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class VoucherResponseTest {

    //VoucherReponseDTO테스트

    @Mock
    private UUID mockVoucherId;


    @Test
    void getVoucherId() {
        //given
        VoucherResponse voucherResponse = new VoucherResponse(mockVoucherId, 10000, VoucherType.FIXED, LocalDateTime.now());

        //when
        UUID expectedVoucherId = UUID.randomUUID();
        Mockito.when(mockVoucherId.toString()).thenReturn(expectedVoucherId.toString());
        UUID actualVoucherId = voucherResponse.getVoucherId();

        //then
        Assertions.assertEquals(expectedVoucherId, actualVoucherId);
    }

    @Test
    void getDiscount() {
        //given
        long expectedDiscount = 10000;
        VoucherResponse voucherResponse = new VoucherResponse(UUID.randomUUID(), expectedDiscount, VoucherType.FIXED, LocalDateTime.now());

        //when
        long actualDiscount = voucherResponse.getDiscount();

        //then
        Assertions.assertEquals(expectedDiscount, actualDiscount);

    }

    @Test
    void getType() {
        //given
        VoucherType expectedType = VoucherType.FIXED;
        VoucherResponse voucherResponse = new VoucherResponse(UUID.randomUUID(), 10000, expectedType, LocalDateTime.now());

        //when
        VoucherType actualType = voucherResponse.getType();

        //then
        Assertions.assertEquals(expectedType, actualType);

    }

    @Test
    void getCreateAt() {
        //given
        LocalDateTime mockDateTime = LocalDateTime.now();

        //when
        VoucherResponse voucherResponse = new VoucherResponse(UUID.randomUUID(), 10000, VoucherType.FIXED, mockDateTime);
        LocalDateTime actualDateTime = voucherResponse.getCreateAt();

        //then
        Assertions.assertEquals(mockDateTime, actualDateTime);

    }
}