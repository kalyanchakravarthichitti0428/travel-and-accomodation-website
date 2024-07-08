package com.example.travelWebsite.repository;

import com.example.travelWebsite.collections.FlightBooking;
import com.example.travelWebsite.collections.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
    List<FlightBooking> findByTransactions(Transactions transactions);
}
