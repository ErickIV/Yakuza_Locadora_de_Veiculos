/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package GUI.Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author RafaelSonoki
 */
public interface ServiceInterface extends Remote {

public void Car (int carID, final String carType, String brand, String model, String fuelType, String gearType, int modelYear, final double price) throws RemoteException;

public void Person (String name, String surname, String nationality, String idNumber, String birthdayDate, String licenceDate, String phone, String mail) throws RemoteException;


    
    


}
