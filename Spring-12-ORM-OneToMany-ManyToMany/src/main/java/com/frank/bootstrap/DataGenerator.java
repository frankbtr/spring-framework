package com.frank.bootstrap;

import com.frank.enums.Status;
import com.frank.model.*;
import com.frank.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository, ItemRepository itemRepository, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
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

        Customer customer1 = new Customer("msmith", "Mike", "Smith", "m.smith@gmail.com", "VA");

        Item item1 = new Item("Milk", "M01");
        Item item2 = new Item("Sugar", "S01");
        Item item3 = new Item("Water", "W01");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);

        cartRepository.save(cart1);
        cartRepository.save(cart2);

        cart1.setItemList(Arrays.asList(item1, item2, item3));
        cart2.setItemList(Arrays.asList(item1, item3));

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);

        merchantRepository.save(merchant1);
        customerRepository.save(customer1);

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);
    }
}
