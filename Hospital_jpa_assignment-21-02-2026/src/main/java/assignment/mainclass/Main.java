package assignment.mainclass;

import assignment.dao.AppointmentDao;
import assignment.dao.DepartmentDao;
import assignment.dao.DoctorDao;
import assignment.dao.MedicalRecordDao;
import assignment.dao.PatientDao;
import assignment.dao.PrescriptionDao;

public class Main {

    public static void main(String[] args) {

        MedicalRecordDao medDao = new MedicalRecordDao();
        DepartmentDao deptDao = new DepartmentDao();
        PrescriptionDao prescDao = new PrescriptionDao();
        PatientDao patientDao = new PatientDao();
        DoctorDao doctorDao = new DoctorDao();
        AppointmentDao apptDao = new AppointmentDao();

        medDao.insert("Feverish", "Rest for 3 days");
        deptDao.insert("Cardiology");
        prescDao.insert("Paracetamol", "3 times a day");

        patientDao.insert("Palak", "9999999999", 1);
        patientDao.updatePhone(1, "8888888888");

        apptDao.insert("11:30 AM", "SCHEDULED", 1, 1);

        patientDao.projectNames();
        doctorDao.projectNames();

        patientDao.delete(1);

    }
}