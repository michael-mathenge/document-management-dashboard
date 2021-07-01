package com.example.legal.services;

import com.example.legal.models.Contract;
import com.example.legal.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    private final ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> getContracts(){
        return contractRepository.findAll();
    }

    public void newContract(Contract contract){
        contractRepository.save(contract);
    }
}
