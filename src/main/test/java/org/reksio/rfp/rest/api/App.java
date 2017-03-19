package org.reksio.rfp.rest.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.reksio.rfp.rest.api.models.Document;
import org.reksio.rfp.rest.api.models.Invoice;
import org.reksio.rfp.rest.api.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAppRepoConfig.class)
public class App {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Test
    public void saveDocument() {
        invoiceRepository.deleteAll();

        Invoice faktura = Invoice.builder()
                .name("fakturka")
                .build();

        invoiceRepository.save(faktura);

        /*Person ludek = Person.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .document(doc)
                .build();

        peopleRepository.save(ludek);

        Person ludek2 = Person.builder()
                .firstName("Tadeusz")
                .lastName("Nowak")
                .document(faktura)
                .build();

        peopleRepository.save(ludek2);*/
    }

}