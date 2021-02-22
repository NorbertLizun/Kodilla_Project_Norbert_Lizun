package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice("1234za1");
        Item item1 = new Item(new BigDecimal(10), new BigDecimal(12), 10);
        Item item2 = new Item(new BigDecimal(100), new BigDecimal(112), 110);
        Product product = new Product("Product");

        product.getItems().add(item1);
        product.getItems().add(item2);


        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);

        item1.setProduct(product);
        item2.setProduct(product);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);


    }



}
