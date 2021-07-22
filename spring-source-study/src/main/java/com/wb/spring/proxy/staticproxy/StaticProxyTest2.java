package com.wb.spring.proxy.staticproxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangbin33 on 2020/2/8.
 */
public class StaticProxyTest2 {
	public static void main(String[] args) {
		try {
			Order order = new Order();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date date = sdf.parse("2017/02/01");
			order.setCreateTime(date.getTime());

			IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
			orderService.createOrder(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
