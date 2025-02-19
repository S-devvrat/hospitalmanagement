@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private String doctor;
    private String appointmentDate;
    private String status;

    // Getters and Setters
}
