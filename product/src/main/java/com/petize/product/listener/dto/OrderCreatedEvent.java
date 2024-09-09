package com.petize.product.listener.dto;

import java.util.Date;

public record OrderCreatedEvent(Long id, Date data_pedido, String quantidade,String status) {
    
}
