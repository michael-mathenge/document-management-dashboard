package com.example.controllers;

import com.example.models.Contract;
import com.example.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContractController {

    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contracts")
    public String getContracts(Model model){
        List<Contract> contractList = contractService.getContracts();
        model.addAttribute("contracts", contractList);

        return "contracts";
    }

    @PostMapping("/contracts/addnew")
    public String addNewContract(Contract contract){
            contractService.newContract(contract);
        return "redirect:/contracts";
    }
}
