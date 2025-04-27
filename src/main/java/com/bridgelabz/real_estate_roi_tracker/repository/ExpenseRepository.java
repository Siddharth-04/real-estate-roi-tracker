package com.bridgelabz.real_estate_roi_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.real_estate_roi_tracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
