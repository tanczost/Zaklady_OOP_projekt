package manager;

import employees.Employee;
import employees.Paramedic;
import employees.specialists.Cardiologist;
import employees.specialists.Neurologist;
import workplaces.AmbulanceCar;

public class Seeder {
    private final static Employee[] doctors = {
                                new Cardiologist("Fero Velky", 45, 14785, 20.5, 9, "Kardiologia"),
                                new Cardiologist("Miso Maly", 57, 57429, 21.5, 8, "Kardiologia"),
                                new Neurologist("Arnold Kabel", 60, 78241, 22.0, 6, "Neuroliga"),
                                new Cardiologist("Patrik Podhorsky", 61, 32978, 23.5, 8, "Kardiologia" ),
                                new Neurologist("Adrian Nagy", 35, 86571, 18.5, 12, "Neuroliga" )
                                };

    private final static Paramedic[] paramedics = {
                                    new Paramedic("Michal Oros", 27, 54114, 15.5, 10, new AmbulanceCar("GA874FR", true)),
                                    new Paramedic("Ladislav Lol Sokol", 25, 98754, 10.0, 12, new AmbulanceCar("BA784PP", true)),
                                    new Paramedic("Ernest Chudy", 30, 10014, 13.5, 12, new AmbulanceCar("GA954ER", false))
                                    };

    public static Employee[] getDefaultDoctors() {
        return doctors;
    }

    public static Paramedic[] getDefaultParamedics() {
        return paramedics;
    }
}





