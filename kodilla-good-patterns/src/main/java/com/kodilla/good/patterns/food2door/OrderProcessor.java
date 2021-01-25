package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getSupplier(), orderRequest.getProduct(), orderRequest.getPlaceOfDelivery(), orderRequest.getDeliveryTime());

        if (isOrdered) {
            informationService.sendInfo(orderRequest.getSupplier(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getSupplier(), orderRequest.getProduct(), orderRequest.getPlaceOfDelivery(), orderRequest.getDeliveryTime());

            return new OrderDto(orderRequest.getSupplier(), true);

        } else {

            return new OrderDto(orderRequest.getSupplier(), false);
        }
    }
}
