package surgery;

import patient.Patient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Surgery {
    private String date;
    private Patient patient;

    public Surgery(Patient patient) {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(date);

        this.date = strDate;
        this.patient = patient;
    }

    public int getPatientId() {
        return patient.getId();
    }

    public String getDate() {
        return date;
    }
}
