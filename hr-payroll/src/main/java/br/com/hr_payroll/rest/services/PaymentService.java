package br.com.hr_payroll.rest.services;

import br.com.hr_payroll.domain.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }

}
