package com.musdon.thejavaacademybank.service.impl;

import com.musdon.thejavaacademybank.dto.TransactionDto;
import com.musdon.thejavaacademybank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
