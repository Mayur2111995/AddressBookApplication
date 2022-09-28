package com.example.addressbookapplication.repository;

import com.example.addressbookapplication.Model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
