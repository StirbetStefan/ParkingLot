/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.park.parkinglot.servlet.car;

import com.park.parkinglot.common.CarDetails;
import com.park.parkinglot.ejb.CarBean;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Stefan
 */

import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "DeleteCars", value = "/DeleteCars")
public class DeleteCar extends HttpServlet {

    @Inject
    CarBean carBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CarDetails> cars= carBean.getAllCars();
        List<Integer> carList=new ArrayList<>();
        for(CarDetails c:cars)
        {
            carList.add(c.getId());
        }
        carBean.deleteCarsByIds(carList);

        response.sendRedirect(request.getContextPath()+"/Cars");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

}
