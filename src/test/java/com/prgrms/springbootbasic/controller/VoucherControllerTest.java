package com.prgrms.springbootbasic.controller;

//class VoucherControllerTest {
//
//    @Mock
//    private VoucherService voucherService;
//
//    private VoucherController voucherController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        voucherController = new VoucherController(voucherService);
//    }
//
//    @Test
//    @DisplayName("바우처 목록 validation 테스트")
//    void getVoucherListControllerTest() {
//        // given
//        Map<UUID, Voucher> voucherMap = Collections.emptyMap();
//        when(voucherService.fetchAllVouchers()).thenReturn(voucherMap);
//
//        // when
//        Map<UUID, Voucher> voucherList = voucherController.printVoucherList();
//
//        // then
//        assertThat(voucherList).isEmpty();
//        verify(voucherService, times(1)).fetchAllVouchers();
//    }
//
//    @Test
//    @DisplayName("바우처 생성 validation 테스트")
//    void getVoucherCreateControllerTest() {
//        // given
//        long discount = 10000;
//
//        // when
//        voucherController.createVoucher(VoucherType.FIXED, discount);
//
//        // then
//        verify(voucherService, times(1)).createVoucher(VoucherType.FIXED, discount);
//    }
//}
//

