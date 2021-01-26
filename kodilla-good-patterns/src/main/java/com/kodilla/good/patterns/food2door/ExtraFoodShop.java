package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements OrderProcess {

    private final OrderService orderService;
    private final InformationService informationService;
    private final OrderRepository orderRepository;

    public ExtraFoodShop(OrderService orderService, InformationService informationService, OrderRepository orderRepository) {

        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }


    @Override
    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.sendInfo(orderRequest);
            orderRepository.saveOrder(orderRequest);
           return new OrderDto();

        } else {
          return  new OrderDto();
        }
    }
}

