package com.example.casetest_modul4.repository;

import com.example.casetest_modul4.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    Iterable<Staff> findAllByNameContaining(String name);

    @Query(value = "select * from staff order by age DESC", nativeQuery = true)
    List<Staff> sortIncreasing();

    @Query(value = "select * from staff order by age ASC", nativeQuery = true)
    List<Staff> sortDecreasing();
}
