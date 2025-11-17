module com.example.group54_javafx_hrm_payroll_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group54_javafx_hrm_payroll_system to javafx.fxml;
    exports com.example.group54_javafx_hrm_payroll_system;
}