/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Octans.com.PruebaTecnica.Services;

import Octans.com.PruebaTecnica.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nico
 */
public interface RolService extends JpaRepository<Rol, Long>{
    
}
