package pa.althaus.dam.javaproyect.aeropuerto.model.dao;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import pa.althaus.dam.javaproyect.aeropuerto.model.AirlineCompany;
import pa.althaus.dam.javaproyect.aeropuerto.model.Airport;
import pa.althaus.dam.javaproyect.aeropuerto.model.Flight;

import static pa.althaus.dam.javaproyect.aeropuerto.util.config.Paths.PATH_FLIGHT;

public class FlightDao extends CoreDao<Flight> {

    public FlightDao() {
        super(PATH_FLIGHT);
    }

    @Override
    protected String getCodigoFromCsvLine(String csvLine) {
        return csvLine.split(",")[0];
    }

@Override
protected String entidadToCSVString(Flight entidad) {
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    
    return String.format("%s,%d,%s,%s,%s,%s,%s,%s,%d,%s,%s,%s",
            entidad.getCodigoVuelo(),
            entidad.getAirlineCompany().getPrefijo(),
            entidad.getAirlineCompany().getCodigo(),
            entidad.getAirlineCompany().getNombre(),
            entidad.getAirlineCompany().getDireccion(),
            entidad.getAirlineCompany().getMunicipio(),
            entidad.getAirlineCompany().getTlfPasajero(),
            entidad.getAirlineCompany().getTlfAeropuerto(),
            entidad.getPlazasTotales(),
            timeFormat.format(entidad.getHoraSalida()),
            timeFormat.format(entidad.getHoraLlegada()),
            entidad.getDiasOpera());
}



@Override
protected Flight parseCsvLine(String csvLine) {
    String[] campos = csvLine.split(",");
    System.out.println("Campos length: " + campos.length);
    System.out.println("Campos: " + Arrays.toString(campos));

    return new Flight(
            campos[0], // Código de vuelo
            new AirlineCompany(
                    Integer.parseInt(campos[1]), // Prefijo
                    campos[2], // Código
                    campos[3], // Nombre
                    campos[4], // Dirección
                    campos[5], // Municipio
                    campos[6], // TlfPasajero
                    campos[7] // TlfAeropuerto
            ),
            new Airport(campos[8], campos[9], campos[10]), // Aeropuerto de origen
            new Airport(campos[11], campos[12], campos[13]), // Aeropuerto de destino
            Integer.parseInt(campos[14]), // Número de plazas totales
            Time.valueOf(campos[15]), // Hora de salida
            Time.valueOf(campos[16]), // Hora de llegada
            Arrays.asList(Arrays.copyOfRange(campos, 17, campos.length)) // Días de operación
    );
}

   
   
}
