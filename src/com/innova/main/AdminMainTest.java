package com.innova.main;

import com.innova.controller.AdminController;
import com.innova.dto.AdminDto;

public class  AdminMainTest {
    public static void main(String[] args) {
        AdminController adminController = new AdminController();

        // create
//        AdminDto adminDto = new AdminDto();
//        adminDto.setAdminName("asdqwe");
//        adminDto.setAdminSurname("Altinsoy");
//        adminController.create(adminDto);

        // delete

//        AdminDto adminDto = new AdminDto();
//        adminDto.setAdminID(8);
//        adminController.delete(adminDto);

        // update
//        AdminDto adminDto = new AdminDto();
//        adminDto.setAdminID(7);
//        adminDto.setAdminName("Umut-1");
//        adminDto.setAdminSurname("Altinsoy-1");
//        adminController.update(adminDto);

        // list
        AdminDto adminDto = new AdminDto();
        adminController.list();
        for (AdminDto dto : adminController.list()){
            System.out.println(dto);
        }

    }
}
