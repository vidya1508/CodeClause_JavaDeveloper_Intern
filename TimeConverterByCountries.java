import java.time.*;
import java.util.*;
public class TimeConverterByCountries {
    public static void main(String[] args)
    { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr your Local time zone (eg. Asia/Kolkata,Asia/Tashikent,Asia/Kuwait):");
    String locateZoneidString=sc.nextLine();
    ZoneId localZoneId=ZoneId.of(locateZoneidString);
    System.out.println("Enter the country time zone (eg. America/New_York,Europe/London,Asia/Tokyo)");
    String countryZoneidString=sc.nextLine();
    ZoneId countryZoneId=ZoneId.of(countryZoneidString);
    LocalTime localTime=LocalTime.now(localZoneId);
    LocalTime countryTime=LocalTime.now(countryZoneId);
    System.out.println("Local time (" + localZoneId + "): " + localTime);
        System.out.println("Country time (" + countryZoneId + "): " + countryTime);
        sc.close();
}
}
