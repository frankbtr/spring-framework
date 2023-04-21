package com.frank.bootstrap;

import com.frank.enums.Status;
import com.frank.model.Merchant;
import com.frank.model.Payment;
import com.frank.model.PaymentDetail;
import com.frank.repository.MerchantRepository;
import com.frank.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Payment payment1 = new Payment(LocalDate.of(2023, 04, 17), new BigDecimal(200000), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal(10000), new BigDecimal(1000), LocalDate.of(2023, 04, 20));

        Payment payment2 = new Payment(LocalDate.of(2022, 11, 30), new BigDecimal(123456789), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal(200), new BigDecimal(50), LocalDate.of(2022, 12, 05));


        payment1.setPaymentDetail(paymentDetail1);
        payment2.setPaymentDetail(paymentDetail2);

        Merchant merchant1 = new Merchant("AmazonSunMerchant", "M123", new BigDecimal(0.25), new BigDecimal(3.25), 5);

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        merchantRepository.save(merchant1);

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);
    }
}
