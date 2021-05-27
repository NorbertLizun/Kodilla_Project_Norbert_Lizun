package com.kodilla;

import com.kodilla.facade.ShopService;
import com.kodilla.facade.api.ItemDto;
import com.kodilla.facade.api.OrderDto;
import com.kodilla.facade.api.OrderFacade;
import com.kodilla.facade.api.OrderProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShopServiceTestSuite {

    @Autowired
    private OrderFacade orderFacade;

    @Autowired
    private ShopService shopService;

    @Test
    public void testShopFacade() {
        OrderDto order = new OrderDto();
        order.addItem(new ItemDto(10L, 2));
        order.addItem(new ItemDto(216L, 1));
        order.addItem(new ItemDto(25L, 1));
        order.addItem(new ItemDto(11L, 3));

        orderFacade.test();
        try {
            orderFacade.processOrder(order, 1L);
        } catch (OrderProcessingException e) {
            // business exception - should be handled in real application
        }
    }
}
