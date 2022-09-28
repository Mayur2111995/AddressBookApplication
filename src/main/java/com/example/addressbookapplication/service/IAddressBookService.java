package com.example.addressbookapplication.service;

import com.example.addressbookapplication.Dto.AddressBookDTO;
import com.example.addressbookapplication.Model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int personId);
}
