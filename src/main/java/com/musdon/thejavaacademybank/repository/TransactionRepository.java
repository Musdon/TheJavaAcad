package com.musdon.thejavaacademybank.repository;

import com.musdon.thejavaacademybank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
