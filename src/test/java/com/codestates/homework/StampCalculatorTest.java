package com.codestates.homework;

import com.codestates.helper.StampCalculator;
import com.codestates.order.entity.Order;
import com.codestates.order.entity.OrderCoffee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StampCalculatorTest {
    @Test
    @DisplayName("실습1: 스탬프 카운트 계산 단위 테스트")
    public void calculateStampCountTest() {
        int nowCount = 3;
        int earned = 5;
        int actual = StampCalculator.calculateStampCount(nowCount, earned);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("실습1: 주문 후 누적 스탬프 카운트 계산 단위 테스트")
    public void calculateEarnedStampCountTest(){
        Order order = new Order();
        OrderCoffee orderCoffee1 = new OrderCoffee();
        OrderCoffee orderCoffee2 = new OrderCoffee();
        orderCoffee1.setQuantity(3);
        orderCoffee2.setQuantity(5);
        order.getOrderCoffees().add(orderCoffee1);
        order.getOrderCoffees().add(orderCoffee2);

        int actual = StampCalculator.calculateEarnedStampCount(order);
        int expected = 8;
        assertEquals(expected, actual);
    }



}
