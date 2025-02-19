package com.hospital.controller;

import com.hospital.model.Appointment;
import com.hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // POST: Book a new appointment
    @PostMapping("/book")
    public Appointment bookAppointment(@RequestBody Appointment appointment) {
    // Log the appointment details to verify if the data is passed correctly
        System.out.println("Received Appointment Data: ");
        System.out.println("Patient Name: " + appointment.getPatientName());
        System.out.println("Doctor ID: " + appointment.getDoctor());
        System.out.println("Appointment Date: " + appointment.getAppointmentDate());
    // Save the appointment and return the saved appointment
        return appointmentRepository.save(appointment);
    }

}
