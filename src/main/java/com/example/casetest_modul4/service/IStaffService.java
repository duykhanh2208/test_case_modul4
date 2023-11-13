package com.example.casetest_modul4.service;

import com.example.casetest_modul4.model.Staff;

public interface IStaffService extends IService<Staff> {
    Iterable<Staff> findAllByNameContaining(String name);
}
