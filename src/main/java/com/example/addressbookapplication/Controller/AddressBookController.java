package com.example.addressbookapplication.Controller;


import com.example.addressbookapplication.Dto.AddressBookDTO;
import com.example.addressbookapplication.Dto.ResponseDTO;
import com.example.addressbookapplication.Model.AddressBookData;
import com.example.addressbookapplication.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {
    @Autowired
    private IAddressBookService iAddressBookService;

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressBookList= iAddressBookService.getAddressBookData();
        addressBookList = iAddressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get call Success !!!", addressBookList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable int personId) {
        AddressBookData addressBookData = iAddressBookService.getAddressBookDataById(personId);
        ResponseDTO responseDTO = new ResponseDTO("Success Call for Person Id!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = iAddressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data ADDED Successfully!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> editAddressBookData(@PathVariable int personId,
                                                           @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = iAddressBookService.updateAddressBookData(personId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data UPDATED Successfully!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> removeAddressBookData(@PathVariable int personId) {
        iAddressBookService.deleteAddressBookData(personId);
        ResponseDTO responseDTO = new ResponseDTO("Data DELETED Successfully!!!",
                "ID number: " + personId + " DELETED!!!");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
