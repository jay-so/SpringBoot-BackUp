package com.prgrms.springbootbasic.service;

//class VoucherServiceTest {
//
//    @Mock
//    private VoucherRepository voucherRepository;
//
//    private VoucherService voucherService;
//
//    @Captor
//    private ArgumentCaptor<Voucher> voucherCaptor;
//
//    public VoucherServiceTest() {
//        MockitoAnnotations.openMocks(this);
//        voucherService = new VoucherService(voucherRepository);
//    }
//
//    @Test
//    @DisplayName("고정 할인 바우처 생성 테스트")
//    void createFixedDiscountVoucherTest() {
//        // given
//        long discount = 10000;
//
//        // when
//        voucherService.createVoucher(VoucherType.FIXED, discount);
//
//        // then
//        verify(voucherRepository, times(1)).insert(voucherCaptor.capture());
//        Voucher capturedVoucher = voucherCaptor.getValue();
//
//        assertThat(capturedVoucher).isInstanceOf(FixedVoucher.class);
//        assertThat(capturedVoucher.getDiscount()).isEqualTo(discount);
//    }
//
//    @Test
//    @DisplayName("비율 할인 바우처 생성 테스트")
//    void createPercentDiscountVoucherTest() {
//        // given
//        long discount = 20;
//
//        // when
//        voucherService.createVoucher(VoucherType.PERCENT, discount);
//
//        // then
//        verify(voucherRepository, times(1)).insert(voucherCaptor.capture());
//        Voucher capturedVoucher = voucherCaptor.getValue();
//
//        assertThat(capturedVoucher).isInstanceOf(RateVoucher.class);
//        assertThat(capturedVoucher.getDiscount()).isEqualTo(discount);
//    }
//
//    @Test
//    @DisplayName("고정 할인 바우처 생성 시 입력 금액이 0 이하인 경우 예외가 발생함")
//    void createFixedDiscountVoucherWithInvalidDiscountTest() {
//        // given
//        long discount = -100;
//
//        // when
//        assertThatThrownBy(() -> voucherService.createVoucher(VoucherType.FIXED, discount))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("고정 할인 바우처의 입력 금액은 0 이하를 입력할 수 없습니다.");
//
//        // then
//        verifyNoInteractions(voucherRepository);
//    }
//
//    @Test
//    @DisplayName("비율 할인 바우처 생성 시 할인 퍼센트가 1 미만 또는 99 초과인 경우 예외가 발생함")
//    void createPercentDiscountVoucherWithInvalidDiscountTest() {
//        // given
//        long discount = 110;
//
//        // when
//        assertThatThrownBy(() -> voucherService.createVoucher(VoucherType.PERCENT, discount))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("퍼센트 할인 바우처의 할인 퍼센트는 1 ~ 99까지의 숫자를 입력해야 합니다.");
//
//        // then
//        verifyNoInteractions(voucherRepository);
//    }
//
//    @Test
//    @DisplayName("모든 바우처 목록 조회 테스트")
//    void fetchAllVouchersTest() {
//        // given
//        Map<UUID, Voucher> voucherMap = Map.of(
//                UUID.randomUUID(), new FixedVoucher(10000),
//                UUID.randomUUID(), new RateVoucher(20)
//        );
//        when(voucherRepository.getAllVouchersList()).thenReturn(voucherMap);
//
//        // when
//        Map<UUID, Voucher> fetchedVouchers = voucherService.fetchAllVouchers();
//
//        // then
//        assertThat(fetchedVouchers).isEqualTo(voucherMap);
//        verify(voucherRepository, times(1)).getAllVouchersList();
//    }
//}
