package org.reksio.rfp.rest.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.reksio.rfp.rest.api.builders.InvoiceBuilder;
import org.reksio.rfp.rest.api.builders.PositionBuilder;
import org.reksio.rfp.rest.api.models.Document;
import org.reksio.rfp.rest.api.models.Invoice;
import org.reksio.rfp.rest.api.models.Position;
import org.reksio.rfp.rest.api.models.Product;
import org.reksio.rfp.rest.api.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAppRepoConfig.class)
public class App {

    @Autowired
    CounterpartyRepository counterpartyRepository;

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    PositionRepository positionRepository;

    @Test
    public void showMeADocument() {
        Position position = positionRepository.findAll().get(0);

        System.out.println("---");
        System.out.println(position.getDocument().getName());
        System.out.println("---");
    }

    @Test
    public void addInvoice() {
        Invoice invoice = InvoiceBuilder.instance()
                .setCounterparty(counterpartyRepository.findAll().get(0))
                .setStore(storeRepository.findAll().get(0))
                .setName("fakturka z builderka")
                .build();

        invoiceRepository.save(invoice);

        Position position = PositionBuilder.instance()
                .setIndex(0)
                .setBuyNettoPrice(1.0)
                .setSellBruttoPrice(2.0)
                .setQuantity(1.0)
                .setStore(storeRepository.findAll().get(0))
                .setDocument(invoice)
                .build();

        Position position2 = PositionBuilder.instance()
                .setIndex(1)
                .setBuyNettoPrice(2.0)
                .setSellBruttoPrice(3.0)
                .setQuantity(2.0)
                .setStore(storeRepository.findAll().get(0))
                .setDocument(invoice)
                .build();

        positionRepository.save(position);
        positionRepository.save(position2);

        invoice.setPositions(Arrays.asList(position));
        invoiceRepository.save(invoice);
    }


    String generateNumber(int digits) {
        if (digits <= 0)
            return "0";

        Random rnd = new Random();
        String number = "";

        for(int i=0;i<digits;++i) {
            number += String.valueOf(rnd.nextInt(10));
        }

        return number;
    }

    @Test
    public void generateProducts() {

        String[] firstNames = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
        String[] lastNames = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
        int length = 100;

        productRepository.deleteAll();

        Random rnd = new Random();

        for (int i=0;i<length;++i) {
            Product product = new Product();
            product.setName(String.join(" ", firstNames[rnd.nextInt(firstNames.length)], lastNames[rnd.nextInt(lastNames.length)]));
            product.setEan(generateNumber(13));
            productRepository.save(product);
        }
    }
}